package org.example.menu;

import org.example.droids.StandardDroid;
import org.example.fights.TeamFight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class StartTeamFight implements Menu{
    /**
     * This section of menu that start team fight
     * @param droids - in this particular implementation must be at least clean HashMap<String, ArrayList<StandardDroid>>
     *               instance
     * @param scanner - in this particular implementation must be at least regular Scanner instance
     * @return - return true and prolong cycle while
     */
    @Override
    public boolean sectionOfMenu(HashMap<String, ArrayList<StandardDroid>> droids, Scanner scanner) throws Exception {
        TeamFight teamFight = new TeamFight();
        System.out.println("CHOOSE YOUR CHAMPIONS:");

        teamFight.choseTheDroids(scanner, droids);
        HashMap<String, StandardDroid> teamWinner = teamFight.makeFight();
        System.out.println("HERE WE GOOOOOO!!!!!! HERE IS OUR CHAMPIONS:");
        System.out.println(teamWinner);
        return true;
    }
}
