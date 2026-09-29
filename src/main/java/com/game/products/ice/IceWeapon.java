package com.game.products.ice;
import com.game.products.Weapon;

public class IceWeapon implements Weapon {
    @Override public int getBaseDamage() { return 40; }
    @Override public String getElement() { return "ICE"; }
    @Override public String attack() { return "Slashing with Frost Dagger for " + getBaseDamage() + " damage!"; }
}