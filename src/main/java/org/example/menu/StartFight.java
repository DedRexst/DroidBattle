package org.example.menu;

import org.example.droids.StandardDroid;
import org.example.fights.Fight1VS1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class StartFight implements Menu{
    /**
     * This section of menu that start fight 1vs1
     * @param droids - in this particular implementation must be at least clean HashMap<String, ArrayList<StandardDroid>>
     *               instance
     * @param scanner - in this particular implementation must be at least regular Scanner instance
     * @return - return true and prolong cycle while
     */
    @Override
    public boolean sectionOfMenu(HashMap<String, ArrayList<StandardDroid>> droids, Scanner scanner) {
        Fight1VS1 fight = new Fight1VS1();
        fight.makeFight(fight.choseDroidsForFight(droids,scanner));
        return true;
    }
}
