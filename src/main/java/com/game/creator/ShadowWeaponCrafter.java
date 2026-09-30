package com.game.creator;

import com.game.products.Weapon;
import com.game.products.shadow.ShadowWeapon;

public class ShadowWeaponCrafter extends WeaponCrafter {
    @Override public Weapon createWeapon() { return new ShadowWeapon(); }
}