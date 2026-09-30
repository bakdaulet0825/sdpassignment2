package com.game.factory;

import java.io.InputStream;
import java.util.Properties;

public class FactoryProvider {
    public static EquipmentFactory getFactoryFromConfig(String fileName) {
        Properties props = new Properties();
        try (InputStream input = FactoryProvider.class.getClassLoader().getResourceAsStream(fileName)) {
            if (input == null) {
                throw new IllegalArgumentException("Configuration file not found: " + fileName);
            }
            props.load(input);
            String family = props.getProperty("family");
            return createFactory(family);
        } catch (Exception e) {
            throw new RuntimeException("Failed to load factory from config", e);
        }
    }

    public static EquipmentFactory createFactory(String familyName) {
        if (familyName == null) throw new IllegalArgumentException("Family name cannot be null");
        switch (familyName.toUpperCase()) {
            case "FIRE": return new FireEquipmentFactory();
            case "ICE": return new IceEquipmentFactory();
            case "LIGHTNING": return new LightningEquipmentFactory();
            case "SHADOW": return new ShadowEquipmentFactory();
            default: throw new IllegalArgumentException("Unknown product family: " + familyName);
        }
    }
}