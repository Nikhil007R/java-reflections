package com.bridgelabz.reflections;

import java.lang.reflect.Method;

class Calculator {
    private int multiply(int a, int b) {
        return a * b;
    }
}

public class InvokePrivateMethod {
    public static void main(String[] args) {
        try {
            // Create an instance of Calculator
            Calculator calc = new Calculator();

            // Get the Class object
            Class<?> cls = calc.getClass();

            // Get the private method multiply(int, int)
            Method method = cls.getDeclaredMethod("multiply", int.class, int.class);

            // Make the method accessible
            method.setAccessible(true);

            // Invoke the method with arguments
            int result = (int) method.invoke(calc, 6, 7);

            // Display the result
            System.out.println("Multiplication Result: " + result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

