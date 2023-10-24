package org.example.fights;

import org.example.droids.StandardDroid;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TeamFight {
    private HashMap<String, StandardDroid> redTeam;
    private HashMap<String, StandardDroid> blueTeam;

    public TeamFight() {
        this.blueTeam = new HashMap<>();
        this.redTeam = new HashMap<>();
    }

    public  HashMap<String, StandardDroid> makeFight(){
        redTeam.get("HealDroid").minusHealth(1);
        redTeam.get("StoneDroid").minusHealth(1);
        redTeam.get("StandardDroid").minusHealth(1);
        redTeam.get("FireDroid").minusHealth(1);
        redTeam.get("AirDroid").minusHealth(1);
        String r = "red";
        String b = "blue";
        do {
            redTeam.get("AirDroid").myTurnInTeamFight(redTeam, blueTeam, r);
            blueTeam.get("AirDroid").myTurnInTeamFight(blueTeam, redTeam, b);

            redTeam.get("FireDroid").myTurnInTeamFight(redTeam, blueTeam, r);
            blueTeam.get("FireDroid").myTurnInTeamFight(blueTeam, redTeam, b);

            redTeam.get("StandardDroid").myTurnInTeamFight(redTeam, blueTeam, r);
            blueTeam.get("StandardDroid").myTurnInTeamFight(blueTeam, redTeam, b);

            redTeam.get("HealDroid").myTurnInTeamFight(redTeam, blueTeam, r);
            blueTeam.get("HealDroid").myTurnInTeamFight(blueTeam, redTeam,b);

            redTeam.get("StoneDroid").myTurnInTeamFight(redTeam, blueTeam,r);
            blueTeam.get("StoneDroid").myTurnInTeamFight(blueTeam, redTeam,b);
        }while ((redTeam.get("AirDroid").getHealth()>0 && redTeam.get("StandardDroid").getHealth()>0
                && redTeam.get("StoneDroid").getHealth()>0 && redTeam.get("FireDroid").getHealth()>0
                && redTeam.get("HealDroid").getHealth()>0) ||
                (blueTeam.get("AirDroid").getHealth()>0 && blueTeam.get("StandardDroid").getHealth()>0
                && blueTeam.get("StoneDroid").getHealth()>0 && blueTeam.get("FireDroid").getHealth()>0
                && blueTeam.get("HealDroid").getHealth()>0));
        if ((redTeam.get("AirDroid").getHealth()>0 && redTeam.get("StandardDroid").getHealth()>0
                && redTeam.get("StoneDroid").getHealth()>0 && redTeam.get("FireDroid").getHealth()>0
                && redTeam.get("HealDroid").getHealth()>0)){
            return redTeam;
        }else return blueTeam;
    }


    private HashMap<String, ArrayList<StandardDroid>> choseTheOneDroid(HashMap<String, ArrayList<StandardDroid>> droidsListForChose, Scanner scanner,
                                  HashMap<String, StandardDroid> inWhichTeamYouWantAddDroid) throws Exception {
        HashMap<String, ArrayList<StandardDroid>> droidsListForChoseNextTeam = (HashMap<String, ArrayList<StandardDroid>>) droidsListForChose.clone();
        for (int i = 0; i < 5; i++) {
            System.out.println(droidsListForChose);
            System.out.println("ENTER DROID CLASS");
            String classOfDroid = scanner.nextLine();
            System.out.println("ENTER DROID NAME");
            String nameOFTheDroid = scanner.nextLine();
            ArrayList<StandardDroid> standardDroids = droidsListForChose.get(classOfDroid);
            if (standardDroids==null){
                throw new Exception("Sorry but droid with this class or name don`t exist");
            }else {
                for (int j = 0; j < standardDroids.size(); j++) {
                    if (standardDroids.get(j).getName().equals(nameOFTheDroid)) {
                        inWhichTeamYouWantAddDroid.put(classOfDroid, standardDroids.get(j));
                        droidsListForChoseNextTeam.get(classOfDroid).remove(standardDroids.get(j));
                        droidsListForChose.remove(classOfDroid);
                    }
                }
            }
        }
        System.out.println(inWhichTeamYouWantAddDroid);
        return droidsListForChoseNextTeam;
    }
    public void choseTheDroids(Scanner scanner,
                               HashMap<String, ArrayList<StandardDroid>> droidsListForChose) throws Exception {
        for (int i = 0; i < 2; i++) {
            HashMap<String, ArrayList<StandardDroid>> temporaryDroidsForChoose = (HashMap<String, ArrayList<StandardDroid>>) droidsListForChose.clone();
            if (i<1) {
                System.out.println("CHOSE CHAMPIONS FOR RED TEAM");
                temporaryDroidsForChoose = choseTheOneDroid(temporaryDroidsForChoose, scanner, redTeam);
            }else {
                System.out.println("CHOSE CHAMPIONS FOR BLUE TEAM");
                choseTheOneDroid(temporaryDroidsForChoose, scanner, blueTeam);
            }
        }
        System.out.println("This is team red: " + redTeam);
        System.out.println("This is team blue: " + blueTeam);
    }

    public HashMap<String, StandardDroid> getRedTeam() {
        return redTeam;
    }

    public HashMap<String, StandardDroid> getBlueTeam() {
        return blueTeam;
    }
}
