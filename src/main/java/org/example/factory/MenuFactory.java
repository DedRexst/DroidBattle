package org.example.factory;

import org.example.menu.Menu;

public class MenuFactory {
    public static Menu createInstance(String className) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String basePackage = "org.example.menu.";
        Class<?> myClass = Class.forName(basePackage + className);
        return (Menu) myClass.newInstance();
    }
}
