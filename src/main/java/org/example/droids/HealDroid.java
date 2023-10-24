package org.example.droids;

import java.util.HashMap;

public class HealDroid extends StandardDroid{
    protected int healPoints;
    public HealDroid() {
        super();
        this.hitChance = (int) (Math.random() * 5 + 1 + 5);
        this.health = (int) (Math.random() * 5 + 1 + 10);
        this.damage = (int) (Math.random() * 5 + 1 + 1);
        this.critChance = (int) (Math.random() * 5 + 1 + 2);
        this.healPoints = (int) (Math.random() * 10 + 1 + 5);
    }

    @Override
    public boolean myTurnInFight1vs1(StandardDroid standardDroid) {
        if (health<10){
            plusHP(healPoints);
            System.out.println(name + " HEAL HIM SELF");
            return true;
        }else return super.myTurnInFight1vs1(standardDroid);
    }

    @Override
    protected void myHitInTeamFight(StandardDroid droid, HashMap<String, StandardDroid> alliedTeam, String teamColor) {
        super.myHitInTeamFight(droid, alliedTeam, teamColor);
    }

    @Override
    public String toString() {
        return super.toString() + ", healPoints=" + healPoints;
    }

    @Override
    public void myTurnInTeamFight(HashMap<String, StandardDroid> alliedTeam, HashMap<String, StandardDroid> enemyTeam, String teamColor) {
        boolean heal = false;
        if (alliedTeam.get("HealDroid").getHealth()>0) {
            alliedTeam.get("HealDroid").plusHP(healPoints);
            System.out.println(name + " FROM TEAM " + teamColor + " HEAL HIM SELF" );
        }else if (alliedTeam.get("FireDroid").getHealth()>0) {
            alliedTeam.get("FireDroid").plusHP(healPoints);
            System.out.println(name + " FROM TEAM " + teamColor + " HEAL HIS COMRADE " + alliedTeam.get("FireDroid").getName() + " FireDroid");
        }else if (alliedTeam.get("StandardDroid").getHealth()>0) {
            alliedTeam.get("StandardDroid").plusHP(healPoints);
            System.out.println(name + " FROM TEAM " + teamColor + " HEAL HIS COMRADE " + alliedTeam.get("StandardDroid").getName() + " StandardDroid");
        }else if (alliedTeam.get("AirDroid").getHealth()>0) {
            alliedTeam.get("AirDroid").plusHP(healPoints);
            System.out.println(name + " FROM TEAM " + teamColor + " HEAL HIS COMRADE " + alliedTeam.get("AirDroid").getName() + " AirDroid");
        }else if (alliedTeam.get("StoneDroid").getHealth()>0) {
            alliedTeam.get("StoneDroid").plusHP(healPoints);
            System.out.println(name + " FROM TEAM " + teamColor + " HEAL HIS COMRADE " + alliedTeam.get("StoneDroid").getName() + " StoneDroid");
        }else if (enemyTeam.get("HealDroid").getHealth()>0) {
            myHitInTeamFight(enemyTeam.get("HealDroid"), alliedTeam,  teamColor);
        }else if (enemyTeam.get("FireDroid").getHealth()>0) {
            myHitInTeamFight(enemyTeam.get("FireDroid"), alliedTeam, teamColor);
        }else if (enemyTeam.get("StandardDroid").getHealth()>0) {
            myHitInTeamFight(enemyTeam.get("StandardDroid"), alliedTeam, teamColor);
        }else if (enemyTeam.get("AirDroid").getHealth()>0) {
            myHitInTeamFight(enemyTeam.get("AirDroid"), alliedTeam, teamColor);
        }else if (enemyTeam.get("StoneDroid").getHealth()>0) {
            myHitInTeamFight(enemyTeam.get("StoneDroid"), alliedTeam, teamColor);
        }
    }
}
