package com.game.products.fire;
import com.game.products.Weapon;

public class FireWeapon implements Weapon {
    @Override public int getBaseDamage() { return 50; }
    @Override public String getElement() { return "FIRE"; }
    @Override public String attack() { return "Strikes with a Flaming Sword for " + getBaseDamage() + " damage!"; }
}