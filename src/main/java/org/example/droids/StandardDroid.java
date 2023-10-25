package org.example.droids;

import java.util.HashMap;


public class StandardDroid {
    public static final int minchanceToMiss = 20;
    public static final int minchanceToCritHit = 70;
    protected String name;
    protected int health;
    protected int damage;
    protected int hitChance;
    protected int critChance;

    public StandardDroid() {
        this.hitChance = (int) (Math.random() * 5 + 1 + 5);
        this.health = (int) (Math.random() * 5 + 1 + 5);
        this.damage = (int) (Math.random() * 5 + 1 + 5);
        this.critChance = (int) (Math.random() * 5 + 1 + 5);

    }

    public boolean myTurnInFight1vs1(StandardDroid standardDroid){
        if (health<=0) {
            return false;
        }else if (Math.random()*100 + hitChance <= minchanceToMiss){
            System.out.println(name + " is missed");
            return true;
        }else if (Math.random()*100 + critChance >= minchanceToCritHit){
            standardDroid.minusHealth(damage*2);
            System.out.println("WOW!!!!" + name + " IT'S A CRITICAL HIT!!! HE DID " + damage*2 + " DAMAGE " + "and " +
                    standardDroid.getHealth() + "HP left");
            return true;
        }else {
            standardDroid.minusHealth(damage);
            System.out.println(name + " DID " + damage + " DAMAGE " + "and " + standardDroid.getHealth() + "HP left");
            return true;
        }
    }



    public void myTurnInTeamFight(HashMap<String, StandardDroid> alliedTeam, HashMap<String, StandardDroid> enemyTeam,
                                  String teamColor){
        if (enemyTeam.get("HealDroid").getHealth()>0) {
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
    protected void myHitInTeamFight(StandardDroid droid, HashMap<String,
            StandardDroid> alliedTeam, String teamColor){
        if (droid.getHealth()>0) {
            if (Math.random() * 100 + hitChance <= minchanceToMiss) {
                System.out.println(name + " FROM TEAM " + teamColor + " is missed");
            } else if (Math.random() * 100 + critChance >= minchanceToCritHit) {
                droid.minusHealth(damage * 2);
                System.out.println("WOW!!!!" + name + " FROM TEAM " + teamColor
                        + " IT'S A CRITICAL HIT!!! HE DID " + damage*2 + " DAMAGE " + "and " +
                        droid.getHealth() + "HP left");
            } else {
                droid.minusHealth(damage);
                System.out.println(name + " FROM TEAM " + teamColor + " DID "
                        + damage + " DAMAGE " + "and " + droid.getHealth() + "HP left");
            }
        }
    }
    public void plusHP(int pointsHP){
        health += pointsHP;
    }
    @Override
    public String toString() {
        return "\n" + name +
                ": health=" + health +
                ", damage=" + damage +
                ", hitChance=" + hitChance +
                ", critChance=" + critChance;
    }

    public String getName() {
        return name;
    }

    public StandardDroid setName(String name) {
        this.name = name;
        System.out.println("WE CREATE DROID " + name.toUpperCase() + " " + this.getClass());

        return this;
    }
    public StandardDroid minusHealth(int health) {
        this.health -= health;
        return this;
    }

    public int getHealth() {
        return health;
    }

}
