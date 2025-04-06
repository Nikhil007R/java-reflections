package com.bridgelabz.annotations;

import java.lang.reflect.Field;

class Person {
    private int age = 25;
}

public class AccessPrivateField {
    public static void main(String[] args) {
        try {
            // Create object of Person
            Person person = new Person();

            // Get the Class object
            Class<?> cls = person.getClass();

            // Get the private field 'age'
            Field field = cls.getDeclaredField("age");

            // Make the private field accessible
            field.setAccessible(true);

            // Retrieve the current value of 'age'
            int currentAge = (int) field.get(person);
            System.out.println("Original Age: " + currentAge);

            // Modify the value of 'age'
            field.set(person, 40);

            // Retrieve the modified value
            int newAge = (int) field.get(person);
            System.out.println("Updated Age: " + newAge);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

