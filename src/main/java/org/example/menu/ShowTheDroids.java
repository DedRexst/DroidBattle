package org.example.menu;

import org.example.droids.StandardDroid;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ShowTheDroids implements Menu{
    @Override
    public boolean sectionOfMenu(HashMap<String, ArrayList<StandardDroid>> droids, Scanner scanner) {
        System.out.println(droids);
        return true;
    }
}
