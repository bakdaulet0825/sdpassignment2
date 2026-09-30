package com.game.products.shadow;
import com.game.products.Spell;

public class ShadowSpell implements Spell {
    @Override public int getMagicPower() { return 75; }
    @Override public String getElement() { return "SHADOW"; }
    @Override public String cast() { return "Summons Dark Nova dealing " + getMagicPower() + " shadow damage!"; }
}