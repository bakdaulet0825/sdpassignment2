package com.game.creator;

import com.game.products.Weapon;
import com.game.products.ice.IceWeapon;

public class IceWeaponCrafter extends WeaponCrafter {
    @Override public Weapon createWeapon() { return new IceWeapon(); }
}