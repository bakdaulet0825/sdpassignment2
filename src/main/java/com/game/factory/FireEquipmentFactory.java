package com.game.factory;

import com.game.products.*;
import com.game.products.fire.*;

public class FireEquipmentFactory implements EquipmentFactory {
    @Override public Weapon createWeapon() { return new FireWeapon(); }
    @Override public Armor createArmor() { return new FireArmor(); }
    @Override public Spell createSpell() { return new FireSpell(); }
}