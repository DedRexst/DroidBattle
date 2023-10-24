package org.example.droids;

import java.util.HashMap;

public class StoneDroid extends StandardDroid{
    public StoneDroid() {
        super();
        this.health = (int) (Math.random() * 20 + 1 + 15);
        this.damage = (int) (Math.random() * 2 + 1 + 2);
    }

    @Override
    public void myTurnInTeamFight(HashMap<String, StandardDroid> alliedTeam, HashMap<String, StandardDroid> enemyTeam, String teamColor) {
        if (enemyTeam.get("FireDroid").getHealth()>0) {
            myHitInTeamFight(enemyTeam.get("FireDroid"), alliedTeam, teamColor);
        }else if (enemyTeam.get("StandardDroid").getHealth()>0) {
            myHitInTeamFight(enemyTeam.get("StandardDroid"), alliedTeam, teamColor);
        }else if (enemyTeam.get("AirDroid").getHealth()>0) {
            myHitInTeamFight(enemyTeam.get("AirDroid"), alliedTeam, teamColor);
        }else if (enemyTeam.get("HealDroid").getHealth()>0) {
            myHitInTeamFight(enemyTeam.get("HealDroid"), alliedTeam,  teamColor);
        }else if (enemyTeam.get("StoneDroid").getHealth()>0) {
            myHitInTeamFight(enemyTeam.get("StoneDroid"), alliedTeam, teamColor);
        }
    }
}
