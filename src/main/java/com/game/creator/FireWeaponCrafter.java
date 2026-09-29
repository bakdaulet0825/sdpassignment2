package com.game.creator;

import com.game.products.Weapon;
import com.game.products.fire.FireWeapon;

public class FireWeaponCrafter extends WeaponCrafter {
    @Override public Weapon createWeapon() { return new FireWeapon(); }
}