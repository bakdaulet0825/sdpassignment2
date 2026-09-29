package com.game.products.lightning;
import com.game.products.Spell;

public class LightningSpell implements Spell {
    @Override public int getMagicPower() { return 80; }
    @Override public String getElement() { return "LIGHTNING"; }
    @Override public String cast() { return "Calls down Chain Lightning hitting for " + getMagicPower() + " power!"; }
}