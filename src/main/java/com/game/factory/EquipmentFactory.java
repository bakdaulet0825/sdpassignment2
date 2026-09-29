package com.game.factory;

import com.game.products.Armor;
import com.game.products.Spell;
import com.game.products.Weapon;

public interface EquipmentFactory {
    Weapon createWeapon();
    Armor createArmor();
    Spell createSpell();
}