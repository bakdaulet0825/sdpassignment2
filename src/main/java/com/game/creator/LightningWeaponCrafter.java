package com.game.creator;

import com.game.products.Weapon;
import com.game.products.lightning.LightningWeapon;

public class LightningWeaponCrafter extends WeaponCrafter {
    @Override public Weapon createWeapon() { return new LightningWeapon(); }
}