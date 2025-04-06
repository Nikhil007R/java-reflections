package com.bridgelabz.reflections;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Custom annotation with a 'name' property
@Retention(RetentionPolicy.RUNTIME) // Make it available at runtime

public @interface Author {
    String name();
}
