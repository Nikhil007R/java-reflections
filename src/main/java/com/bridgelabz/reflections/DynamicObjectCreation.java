package com.bridgelabz.reflections;

class Student {
    public Student() {
        System.out.println("Student object created!");
    }

    void display() {
        System.out.println("Welcome to Reflection in Java!");
    }
}

public class DynamicObjectCreation {
    public static void main(String[] args) {
        try {
            // Get Class object for Student
            Class<?> cls = Class.forName("Student");

            // Create an instance dynamically (without new keyword)
            Object obj = cls.getDeclaredConstructor().newInstance();

            // Optionally cast and use
            if (obj instanceof Student) {
                Student s = (Student) obj;
                s.display();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

