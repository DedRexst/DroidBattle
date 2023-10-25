package org.example.menu;

import org.example.droids.StandardDroid;
import org.example.factory.DroidFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CreateDroid implements Menu{

    /**
     * This section of menu uses to create droids
     * @param droids - in this particular implementation must be at least clean HashMap<String, ArrayList<StandardDroid>>
     *               instance
     * @param scanner - in this particular implementation must be at least regular Scanner instance
     * @return - return true and prolong cycle while
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    @Override
    public boolean sectionOfMenu(HashMap<String, ArrayList<StandardDroid>> droids, Scanner scanner) throws IllegalAccessException, InstantiationException {
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
        } catch (ClassNotFoundException e) {
            System.err.println("SORRY BUT YOU MUST ENTER SOME OF THIS CLASS OF DROID\n" +
                    "StandardDroid\n" +
                    "FireDroid\n" +
                    "HealDroid\n" +
                    "StoneDroid\n" +
                    "AirDroid" +
                    "\nENTER TYPE OF THE DROID");
        }
        return true;
    }
}
