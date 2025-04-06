package com.bridgelabz.reflections;

import java.lang.reflect.Method;
import java.util.Scanner;

class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}

public class DynamicMethodCalling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Create instance of MathOperations
            MathOperations obj = new MathOperations();
            Class<?> cls = obj.getClass();

            // Get method name and arguments from user
            System.out.print("Enter method to invoke (add, subtract, multiply): ");
            String methodName = scanner.nextLine();

            System.out.print("Enter first number: ");
            int a = scanner.nextInt();

            System.out.print("Enter second number: ");
            int b = scanner.nextInt();

            // Get method by name and parameter types
            Method method = cls.getMethod(methodName, int.class, int.class);

            // Invoke the method with parameters
            Object result = method.invoke(obj, a, b);

            // Display result
            System.out.println("Result: " + result);

        } catch (NoSuchMethodException e) {
            System.out.println("Method not found!");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
