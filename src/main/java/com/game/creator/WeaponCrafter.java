package com.game.creator;

import com.game.products.Weapon;

public abstract class WeaponCrafter {
    public abstract Weapon createWeapon();

    public String prepareAndTestWeapon() {
        Weapon weapon = createWeapon();
        return "Forging " + weapon.getElement() + " weapon... " + weapon.attack();
    }
}