package com.game.products.shadow;
import com.game.products.Armor;

public class ShadowArmor implements Armor {
    @Override public int getDefenseValue() { return 35; }
    @Override public String getElement() { return "SHADOW"; }
    @Override public String protect() { return "Shrouds in Void Cloak providing " + getDefenseValue() + " DEF."; }
}