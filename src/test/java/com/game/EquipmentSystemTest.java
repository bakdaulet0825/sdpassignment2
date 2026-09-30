package com.game;

import com.game.client.GameClient;
import com.game.creator.*;
import com.game.factory.*;
import com.game.products.*;
import com.game.naive.NaiveEquipmentManager;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EquipmentSystemTest {

    @Test
    void testFireFactoryCreation() {
        EquipmentFactory factory = new FireEquipmentFactory();
        assertEquals("FIRE", factory.createWeapon().getElement());
        assertEquals("FIRE", factory.createArmor().getElement());
        assertEquals("FIRE", factory.createSpell().getElement());
    }

    @Test
    void testIceFactoryCreation() {
        EquipmentFactory factory = new IceEquipmentFactory();
        assertEquals("ICE", factory.createWeapon().getElement());
        assertEquals("ICE", factory.createArmor().getElement());
        assertEquals("ICE", factory.createSpell().getElement());
    }

    @Test
    void testLightningFactoryCreation() {
        EquipmentFactory factory = new LightningEquipmentFactory();
        assertEquals("LIGHTNING", factory.createWeapon().getElement());
        assertEquals("LIGHTNING", factory.createArmor().getElement());
        assertEquals("LIGHTNING", factory.createSpell().getElement());
    }

    @Test
    void testShadowFactoryCreation_FourthFamily() {
        EquipmentFactory factory = new ShadowEquipmentFactory();
        assertEquals("SHADOW", factory.createWeapon().getElement());
        assertEquals("SHADOW", factory.createArmor().getElement());
        assertEquals("SHADOW", factory.createSpell().getElement());
    }

    @Test
    void testFireWeaponAttack() {
        Weapon weapon = new FireEquipmentFactory().createWeapon();
        assertTrue(weapon.attack().contains("Flaming Sword"));
    }

    @Test
    void testIceArmorProtect() {
        Armor armor = new IceEquipmentFactory().createArmor();
        assertTrue(armor.protect().contains("Glacial Plate Armor"));
    }

    @Test
    void testLightningSpellCast() {
        Spell spell = new LightningEquipmentFactory().createSpell();
        assertTrue(spell.cast().contains("Chain Lightning"));
    }

    @Test
    void testProductCompatibilityGuarantee() {
        EquipmentFactory factory = new LightningEquipmentFactory();
        Weapon weapon = factory.createWeapon();
        Armor armor = factory.createArmor();
        Spell spell = factory.createSpell();

        assertEquals(weapon.getElement(), armor.getElement());
        assertEquals(armor.getElement(), spell.getElement());
    }

    @Test
    void testBusinessScenario_SynergyPowerCalculation() {
        GameClient client = new GameClient(new FireEquipmentFactory());
        assertEquals(240, client.executeElementalSynergyStrike());
    }

    @Test
    void testBusinessScenario_CombatSequence() {
        GameClient client = new GameClient(new IceEquipmentFactory());
        String log = client.executeFullCombatSequence();
        assertTrue(log.contains("Frost Dagger") && log.contains("Glacial") && log.contains("Blizzard"));
    }

    @Test
    void testBusinessScenario_ResonanceCheck() {
        GameClient client = new GameClient(new ShadowEquipmentFactory());
        assertEquals("PERFECT RESONANCE: SHADOW power amplified!", client.checkSetResonance());
    }

    @Test
    void testFactoryMethodBusinessLogic() {
        WeaponCrafter crafter = new FireWeaponCrafter();
        String result = crafter.prepareAndTestWeapon();
        assertTrue(result.contains("Forging FIRE weapon") && result.contains("Flaming Sword"));
    }

    @Test
    void testRuntimeFactorySelectionFromConfig() {
        EquipmentFactory factory = FactoryProvider.getFactoryFromConfig("config.properties");
        assertNotNull(factory);
        assertEquals("FIRE", factory.createWeapon().getElement());
    }

    @Test
    void testInvalidFamilyThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> FactoryProvider.createFactory("UNKNOWN_ELEMENT"));
    }

    @Test
    void testNaiveManagerThrowsExceptionOnInvalidProduct() {
        NaiveEquipmentManager manager = new NaiveEquipmentManager();
        assertThrows(IllegalArgumentException.class, () -> manager.createItem("INVALID", "WEAPON"));
    }
}