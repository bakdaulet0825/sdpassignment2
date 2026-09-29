package com.game.products.ice;
import com.game.products.Spell;

public class IceSpell implements Spell {
    @Override public int getMagicPower() { return 55; }
    @Override public String getElement() { return "ICE"; }
    @Override public String cast() { return "Unleashes Blizzard freezing enemies with " + getMagicPower() + " power!"; }
}