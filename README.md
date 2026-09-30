# Assignment 2: RPG Equipment Management System
**Patterns:** Factory Method & Abstract Factory  
**Language:** Java 17  
**Build System:** Maven

---

## 📌 Project Overview
This project implements an extensible RPG Equipment Management System demonstrating the transition from direct object creation to Creational Design Patterns (**Factory Method** and **Abstract Factory**). The system manages matching equipment sets across multiple elemental families (`FIRE`, `ICE`, `LIGHTNING`, and `SHADOW`).

---

## 🏗️ Project Architecture & Design Patterns

### 1. Part A: Initial Domain Model (Naive Approach)
* Located in `com.game.naive.NaiveEquipmentManager`.
* Uses direct instantiation (`new`) inside conditional logic (`if/else`).
* **Problems identified:** High coupling, poor extensibility, high risk of mixing incompatible elemental items.

### 2. Part B: Factory Method Pattern
* Located in `com.game.creator`.
* Defines the `WeaponCrafter` abstract creator class containing business logic (`prepareAndTestWeapon()`).
* Concrete crafters (`FireWeaponCrafter`, `IceWeaponCrafter`, etc.) encapsulate the creation of specific `Weapon` instances.

### 3. Part C & D: Abstract Factory Pattern
* Located in `com.game.factory`.
* The `EquipmentFactory` interface declares factory methods for creating product families (`Weapon`, `Armor`, `Spell`).
* Concrete factories (`FireEquipmentFactory`, `IceEquipmentFactory`, `LightningEquipmentFactory`) guarantee that all created items share the same elemental family.

### 4. Part E & F: Runtime Selection & Business Scenario Client
* **Runtime Selection:** `FactoryProvider` dynamically loads the active family from `config.properties`.
* **Client Logic:** `GameClient` consumes `EquipmentFactory` to build full equipment sets and execute complex combat interactions (`executeElementalSynergyStrike()`, `checkSetResonance()`).

---

## 🚀 Part G: Extensibility Analysis (Adding 4th Family: Shadow)

To prove compliance with the **Open/Closed Principle (OCP)**, a 4th elemental family (`SHADOW`) was added.

### ➕ Files Added:
1. `com.game.products.shadow.ShadowWeapon`
2. `com.game.products.shadow.ShadowArmor`
3. `com.game.products.shadow.ShadowSpell`
4. `com.game.creator.ShadowWeaponCrafter`
5. `com.game.factory.ShadowEquipmentFactory`

### 🛠️ Existing Files Modified:
* **`GameClient.java`**: **0 lines modified** (100% decoupled from concrete products).
* **`WeaponCrafter.java`**: **0 lines modified**.
* **`EquipmentFactory.java`**: **0 lines modified**.
* **`FactoryProvider.java`**: Updated single `switch` statement to register `"SHADOW"`.

> **Conclusion:** Adding an entirely new family of 3 products required **zero changes** to core domain algorithms and client processing logic.

---

## 📊 Comparison Matrix

| Criteria | Naive Approach (`if/else`) | Factory Method | Abstract Factory |
| :--- | :--- | :--- | :--- |
| **Coupling** | High (Coupled to concrete classes) | Medium (Coupled to abstract creator) | Low (Coupled to abstract interfaces) |
| **Adding New Family** | Requires modifying large `if/else` blocks | Requires new Crafter subclass | Requires new Factory implementation |
| **Product Compatibility Guarantee** | ❌ None (Easy to mismatch Fire & Ice) | ❌ Single product only | ✅ Fully guaranteed by family factory |
| **OCP Compliance** | ❌ Violated | ✅ Compliant for single items | ✅ Fully Compliant for product suites |

---
---

## 🛠️ How to Run & Test

### Prerequisites
* Java JDK 17+
* Maven 3.x

### 1. Run Main Application
```bash
mvn clean compile
mvn exec:java -Dexec.mainClass="com.game.Main"
```
2. Run Automated Unit Tests
```Bash
mvn test
```
📐 UML Class Diagram
The class diagram is provided in PlantUML format in diagram.puml.