package org.example.menu;

import org.example.droids.StandardDroid;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class StopTheProgram implements Menu{
    /**
     * This section of menu need to stop the program
     * @param droids - in this particular implementation might be null
     * @param scanner - in this particular implementation might be null
     * @return - return false and stop cycle while
     */
    @Override
    public boolean sectionOfMenu(HashMap<String, ArrayList<StandardDroid>> droids, Scanner scanner) throws Exception {
        return false;
    }
}
