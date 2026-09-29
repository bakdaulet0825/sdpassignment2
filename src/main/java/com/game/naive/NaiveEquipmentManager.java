package com.game.naive;

import com.game.products.fire.*;
import com.game.products.ice.*;
import com.game.products.lightning.*;

public class NaiveEquipmentManager {
    public Object createItem(String family, String type) {
        if ("FIRE".equalsIgnoreCase(family)) {
            if ("WEAPON".equalsIgnoreCase(type)) return new FireWeapon();
            if ("ARMOR".equalsIgnoreCase(type)) return new FireArmor();
            if ("SPELL".equalsIgnoreCase(type)) return new FireSpell();
        } else if ("ICE".equalsIgnoreCase(family)) {
            if ("WEAPON".equalsIgnoreCase(type)) return new IceWeapon();
            if ("ARMOR".equalsIgnoreCase(type)) return new IceArmor();
            if ("SPELL".equalsIgnoreCase(type)) return new IceSpell();
        } else if ("LIGHTNING".equalsIgnoreCase(family)) {
            if ("WEAPON".equalsIgnoreCase(type)) return new LightningWeapon();
            if ("ARMOR".equalsIgnoreCase(type)) return new Armor();
            if ("SPELL".equalsIgnoreCase(type)) return new LightningSpell();
        }
        throw new IllegalArgumentException("Unknown family or product type");
    }
}