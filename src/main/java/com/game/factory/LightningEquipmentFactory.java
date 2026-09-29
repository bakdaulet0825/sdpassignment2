package com.game.factory;

import com.game.products.*;
import com.game.products.lightning.*;

public class LightningEquipmentFactory implements EquipmentFactory {
    @Override public Weapon createWeapon() { return new LightningWeapon(); }
    @Override public Armor createArmor() { return new LightningArmor(); }
    @Override public Spell createSpell() { return new LightningSpell(); }
}