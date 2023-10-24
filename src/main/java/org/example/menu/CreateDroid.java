package org.example.menu;

import org.example.droids.StandardDroid;
import org.example.factory.DroidFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CreateDroid implements Menu{

    @Override
    public boolean sectionOfMenu(HashMap<String, ArrayList<StandardDroid>> droids, Scanner scanner) {
        System.out.println("ENTER DROID NAME:");
        String name = scanner.nextLine();
        System.out.println("StandardDroid\n" +
                "FireDroid\n" +
                "HealDroid\n" +
                "StoneDroid\n" +
                "AirDroid" +
                "\nENTER TYPE OF THE DROID");
        try {
            String typeOfDroid = scanner.nextLine();
            droids.get(typeOfDroid).add(DroidFactory.createInstance(typeOfDroid).setName(name));
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
        return true;
    }
}
