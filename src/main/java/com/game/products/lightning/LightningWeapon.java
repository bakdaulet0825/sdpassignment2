package com.game.products.lightning;
import com.game.products.Weapon;

public class LightningWeapon implements Weapon {
    @Override public int getBaseDamage() { return 60; }
    @Override public String getElement() { return "LIGHTNING"; }
    @Override public String attack() { return "Strikes with Thunder Spear for " + getBaseDamage() + " damage!"; }
}