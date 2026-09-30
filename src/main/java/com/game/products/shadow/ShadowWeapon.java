package com.game.products.shadow;
import com.game.products.Weapon;

public class ShadowWeapon implements Weapon {
    @Override public int getBaseDamage() { return 55; }
    @Override public String getElement() { return "SHADOW"; }
    @Override public String attack() { return "Strikes from darkness with Shadow Blade for " + getBaseDamage() + " damage!"; }
}