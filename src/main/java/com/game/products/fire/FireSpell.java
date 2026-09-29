package com.game.products.fire;
import com.game.products.Spell;

public class FireSpell implements Spell {
    @Override public int getMagicPower() { return 70; }
    @Override public String getElement() { return "FIRE"; }
    @Override public String cast() { return "Casts Fireball dealing " + getMagicPower() + " burn damage!"; }
}