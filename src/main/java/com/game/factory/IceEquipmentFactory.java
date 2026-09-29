package com.game.factory;

import com.game.products.*;
import com.game.products.ice.*;

public class IceEquipmentFactory implements EquipmentFactory {
    @Override public Weapon createWeapon() { return new IceWeapon(); }
    @Override public Armor createArmor() { return new IceArmor(); }
    @Override public Spell createSpell() { return new IceSpell(); }
}