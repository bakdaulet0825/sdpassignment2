package com.game;

import com.game.client.GameClient;
import com.game.factory.EquipmentFactory;
import com.game.factory.FactoryProvider;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== RPG Equipment Management System ===");
        EquipmentFactory factory = FactoryProvider.getFactoryFromConfig("config.properties");
        GameClient client = new GameClient(factory);

        System.out.println("Combat Log: " + client.executeFullCombatSequence());
        System.out.println("Set Bonus: " + client.checkSetResonance());
        System.out.println("Total Damage Power: " + client.executeElementalSynergyStrike());
    }
}