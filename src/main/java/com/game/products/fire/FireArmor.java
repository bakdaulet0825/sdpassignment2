package com.game.products.fire;
import com.game.products.Armor;

public class FireArmor implements Armor {
    @Override public int getDefenseValue() { return 30; }
    @Override public String getElement() { return "FIRE"; }
    @Override public String protect() { return "Absorbs incoming hits with Flame Shield (" + getDefenseValue() + " DEF)."; }
}