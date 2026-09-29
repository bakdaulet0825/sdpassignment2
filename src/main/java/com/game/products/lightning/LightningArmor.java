package com.game.products.lightning;
import com.game.products.Armor;

public class LightningArmor implements Armor {
    @Override public int getDefenseValue() { return 25; }
    @Override public String getElement() { return "LIGHTNING"; }
    @Override public String protect() { return "Electrifies attackers using Storm Mail (" + getDefenseValue() + " DEF)."; }
}