package org.example.menu;

import org.example.factory.DroidFactory;
import org.example.droids.*;
import org.example.factory.MenuFactory;
import org.example.fights.TeamFight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MainMenu {
    public static void loopMainMenu() throws Exception {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        HashMap<String, ArrayList<StandardDroid>> droids = new HashMap<>();
        droids.put("StandardDroid", new ArrayList<>());
        droids.put("FireDroid", new ArrayList<>());
        droids.put("HealDroid", new ArrayList<>());
        droids.put("StoneDroid", new ArrayList<>());
        droids.put("AirDroid", new ArrayList<>());
        droids.get("StandardDroid").add(new StandardDroid().setName("biba"));
        droids.get("StandardDroid").add(new StandardDroid().setName("boba"));
        droids.get("FireDroid").add(new FireDroid().setName("lolik"));
        droids.get("FireDroid").add(new FireDroid().setName("bolik"));
        droids.get("HealDroid").add(new HealDroid().setName("dolik"));
        droids.get("HealDroid").add(new HealDroid().setName("alik"));
        droids.get("StoneDroid").add(new StoneDroid().setName("halik"));
        droids.get("StoneDroid").add(new StoneDroid().setName("calik"));
        droids.get("AirDroid").add(new AirDroid().setName("lalik"));
        droids.get("AirDroid").add(new AirDroid().setName("nalik"));
        while (run == true) {

            try {
                // Ваш код, який може спричинити ClassNotFoundException
            System.out.println("CreateDroid\n" +
                        "ShowTheDroids\n" +
                        "StartFight\n" +
                        "StartTeamFight\n" +
                        "StartTeamFight" +
                        "\nENTER COMMAND TO ENTER SOME INTERFACE");
                        run = MenuFactory.createInstance(scanner.nextLine()).sectionOfMenu(droids, scanner);
            } catch (ClassNotFoundException e) {
                System.err.println("SORRY BUTT YOU MUST ENTER SOME OF THIS COMMANDS:\n" +
                        "CreateDroid\n" +
                        "ShowTheDroids\n" +
                        "StartFight\n" +
                        "StartTeamFight\n" +
                        "StartTeamFight" +
                        "\nENTER COMMAND TO ENTER SOME INTERFACE");
            }
        }
//            String input = scanner.nextLine().toUpperCase();
//            if (input.equals("CREATE DROID")){
//                System.out.println("ENTER DROID NAME:");
//                String name = scanner.nextLine();
//                System.out.println("StandardDroid\n" +
//                        "FireDroid\n" +
//                        "HealDroid\n" +
//                        "StoneDroid\n" +
//                        "AirDroid" +
//                        "\nENTER TYPE OF THE DROID");
//                try {
//                    String typeOfDroid = scanner.nextLine();
//                droids.get(typeOfDroid).add(DroidFactory.createInstance(typeOfDroid).setName(name));
//                } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
//                    e.printStackTrace();
//                }
//            }else if (input.equals("SHOW THE DROIDS")) {
//                System.out.println(droids);
//            }else if (input.equals("START FIGHT")){
//                System.out.println("CHOOSE YOUR CHAMPIONS:");
//                System.out.println(droids);
//                HashMap<String, StandardDroid> selectedDroids = new HashMap();
//                for (int i = 0; i < 2; i++) {
//                    System.out.println("ENTER DROID CLASS");
//                    String classOfDroid = scanner.nextLine();
//                    System.out.println("ENTER DROID NAME");
//                    String nameOFTheDroid = scanner.nextLine();
//                    for (StandardDroid s :
//                            droids.get(classOfDroid)) {
//                        if (s.getName().equals(nameOFTheDroid)) {
//                            selectedDroids.put("" + i,s);
//                        }
//                    }
//                }
//                while (selectedDroids.get("0").getHealth() > 0 &&
//                        selectedDroids.get("1").getHealth() > 0 ){
//                    selectedDroids.get("0").myTurnInFight1vs1(selectedDroids.get("1"));
//                    selectedDroids.get("1").myTurnInFight1vs1(selectedDroids.get("0"));
//                }
//                if (selectedDroids.get("0").getHealth() <= 0 && selectedDroids.get("1").getHealth() <= 0){
//                    System.out.println("ITS EVEN");
//                }else if (selectedDroids.get("0").getHealth() <= 0){
//                    System.out.println(selectedDroids.get("1").getName() + " won");
//                }else if (selectedDroids.get("1").getHealth() <= 0){
//                    System.out.println(selectedDroids.get("0").getName() + " won");
//                }
//            }else if (input.equals("START TEAM FIGHT")){
//                TeamFight teamFight = new TeamFight();
//                System.out.println("CHOOSE YOUR CHAMPIONS:");
//
//                teamFight.choseTheDroids(scanner, droids);
//                HashMap<String, StandardDroid> teamWinner = teamFight.makeFight();
//                System.out.println("HERE WE GOOOOOO!!!!!! HERE IS OUR CHAMPIONS:");
//                System.out.println(teamWinner);
//            }else if (input.equals("STOP THE PROGRAM")){
//                System.out.println("PROGRAM RUN OUT");
//                run = false;
//            }
//        }
    }
}
