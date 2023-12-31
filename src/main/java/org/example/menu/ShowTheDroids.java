package org.example.menu;

import org.example.droids.StandardDroid;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ShowTheDroids implements Menu{
    /**
     *
     * This section of menu need to show all droids who was made
     * @param droids - in this particular implementation might be null
     * @param scanner - in this particular implementation might be null
     * @return - return true and prolong cycle while
     */
    @Override
    public boolean sectionOfMenu(HashMap<String, ArrayList<StandardDroid>> droids, Scanner scanner) {
        System.out.println(droids);
        return true;
    }
}
