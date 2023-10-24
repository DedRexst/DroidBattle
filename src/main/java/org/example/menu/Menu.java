package org.example.menu;

import org.example.droids.StandardDroid;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public interface Menu {
    boolean sectionOfMenu(HashMap<String, ArrayList<StandardDroid>> droids, Scanner scanner) throws Exception;
}
