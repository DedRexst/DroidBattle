package org.example.fights;

import org.example.droids.StandardDroid;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Fight1VS1 {
    public HashMap<String, StandardDroid> choseDroidsForFight(HashMap<String, ArrayList<StandardDroid>> droids, Scanner scanner){
        System.out.println("CHOOSE YOUR CHAMPIONS:");
        System.out.println(droids);
        HashMap<String, StandardDroid> selectedDroids = new HashMap();
        for (int i = 0; i < 2; i++) {
            System.out.println("ENTER DROID CLASS");
            String classOfDroid = scanner.nextLine();
            System.out.println("ENTER DROID NAME");
            String nameOFTheDroid = scanner.nextLine();
            for (StandardDroid s :
                    droids.get(classOfDroid)) {
                if (s.getName().equals(nameOFTheDroid)) {
                    selectedDroids.put("" + i,s);
                }
            }
        }
        return selectedDroids;
    }
    public void makeFight(HashMap<String, StandardDroid> selectedDroids){
        while (selectedDroids.get("0").getHealth() > 0 &&
                selectedDroids.get("1").getHealth() > 0 ){
            selectedDroids.get("0").myTurnInFight1vs1(selectedDroids.get("1"));
            selectedDroids.get("1").myTurnInFight1vs1(selectedDroids.get("0"));
        }
        if (selectedDroids.get("0").getHealth() <= 0 && selectedDroids.get("1").getHealth() <= 0){
            System.out.println("ITS EVEN");
        }else if (selectedDroids.get("0").getHealth() <= 0){
            System.out.println(selectedDroids.get("1").getName() + " won");
        }else if (selectedDroids.get("1").getHealth() <= 0){
            System.out.println(selectedDroids.get("0").getName() + " won");
        }
    }
}
