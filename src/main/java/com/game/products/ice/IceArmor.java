package com.game.products.ice;
import com.game.products.Armor;

public class IceArmor implements Armor {
    @Override public int getDefenseValue() { return 45; }
    @Override public String getElement() { return "ICE"; }
    @Override public String protect() { return "Deflects attack with Glacial Plate Armor (" + getDefenseValue() + " DEF)."; }
}