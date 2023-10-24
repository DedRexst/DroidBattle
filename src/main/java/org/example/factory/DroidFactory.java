package org.example;

import org.example.droids.StandardDroid;

public class DroidFactory {
    public static StandardDroid createInstance(String className) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String basePackage = "org.example.droids.";
        Class<?> myClass = Class.forName(basePackage + className);
        return (StandardDroid) myClass.newInstance();
    }
}
