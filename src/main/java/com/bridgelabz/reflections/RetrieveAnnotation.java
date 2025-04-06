package com.bridgelabz.reflections;

@Author(name = "John Doe")
class Book{

}

public class RetrieveAnnotation {
    public static void main(String[] args) {
        // Get class object
        Class<Book> cls = Book.class;

        // Check if annotation is present
        if (cls.isAnnotationPresent(Author.class)) {
            // Get the annotation
            Author author = cls.getAnnotation(Author.class);
            System.out.println("Author: " + author.name());
        } else {
            System.out.println("No Author annotation found.");
        }
    }
}

