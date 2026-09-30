package com.game.client;

import com.game.factory.EquipmentFactory;
import com.game.products.*;

public class GameClient {
    private final Weapon weapon;
    private final Armor armor;
    private final Spell spell;

    public GameClient(EquipmentFactory factory) {
        this.weapon = factory.createWeapon();
        this.armor = factory.createArmor();
        this.spell = factory.createSpell();
    }

    public int executeElementalSynergyStrike() {
        int basePower = weapon.getBaseDamage() + spell.getMagicPower();
        boolean fullSetSynergy = weapon.getElement().equals(armor.getElement()) &&
                armor.getElement().equals(spell.getElement());
        return fullSetSynergy ? basePower * 2 : basePower;
    }

    public String executeFullCombatSequence() {
        return weapon.attack() + " | " + armor.protect() + " | " + spell.cast();
    }

    public String checkSetResonance() {
        if (weapon.getElement().equals(armor.getElement()) && armor.getElement().equals(spell.getElement())) {
            return "PERFECT RESONANCE: " + weapon.getElement() + " power amplified!";
        }
        return "MISMATCHED ELEMENTS: No bonus active.";
    }

    public Weapon getWeapon() { return weapon; }
    public Armor getArmor() { return armor; }
    public Spell getSpell() { return spell; }
}