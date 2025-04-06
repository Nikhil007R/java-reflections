package com.bridgelabz.reflections;

import java.lang.reflect.Field;

class Configuration {
    private static String API_KEY = "DEFAULT_KEY";
}

public class StaticFieldAccessModify {
    public static void main(String[] args) {
        try {
            // Get Class object
            Class<?> cls = Configuration.class;

            // Get the Field object for API_KEY
            Field field = cls.getDeclaredField("API_KEY");

            // Make the private field accessible
            field.setAccessible(true);

            // Print original value
            String originalKey = (String) field.get(null); // null because it's static
            System.out.println("Original API_KEY: " + originalKey);

            // Modify the static field
            field.set(null, "NEW_API_KEY_123");

            // Print updated value
            String newKey = (String) field.get(null);
            System.out.println("Updated API_KEY: " + newKey);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

