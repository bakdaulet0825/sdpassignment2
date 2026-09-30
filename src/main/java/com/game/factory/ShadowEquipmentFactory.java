package com.game.factory;

import com.game.products.*;
import com.game.products.shadow.*;

public class ShadowEquipmentFactory implements EquipmentFactory {
    @Override public Weapon createWeapon() { return new ShadowWeapon(); }
    @Override public Armor createArmor() { return new ShadowArmor(); }
    @Override public Spell createSpell() { return new ShadowSpell(); }
}