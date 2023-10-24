package org.example.droids;

import java.util.HashMap;

public class FireDroid extends StandardDroid{
    public FireDroid() {
        super();
        this.hitChance = (int) (Math.random() * 5 + 1 + 5);
        this.health = (int) (Math.random() * 5 + 1 + 5);
        this.damage = (int) (Math.random() * 10 + 1 + 10);
        this.critChance = (int) (Math.random() * 5 + 1 + 4);
    }

    @Override
    public boolean myTurnInFight1vs1(StandardDroid standardDroid) {
        return super.myTurnInFight1vs1(standardDroid);
    }

    @Override
    public void myTurnInTeamFight(HashMap<String, StandardDroid> alliedTeam, HashMap<String, StandardDroid> enemyTeam, String teamColor) {
        if (enemyTeam.get("HealDroid").getHealth()>0) {
            myHitInTeamFight(enemyTeam.get("HealDroid"), alliedTeam,  teamColor);
        }else if (enemyTeam.get("StoneDroid").getHealth()>0) {
            myHitInTeamFight(enemyTeam.get("StoneDroid"), alliedTeam, teamColor);
        }else if (enemyTeam.get("FireDroid").getHealth()>0) {
            myHitInTeamFight(enemyTeam.get("FireDroid"), alliedTeam, teamColor);
        }else if (enemyTeam.get("StandardDroid").getHealth()>0) {
            myHitInTeamFight(enemyTeam.get("StandardDroid"), alliedTeam, teamColor);
        }else if (enemyTeam.get("AirDroid").getHealth()>0) {
            myHitInTeamFight(enemyTeam.get("AirDroid"), alliedTeam, teamColor);
        }
    }
}
