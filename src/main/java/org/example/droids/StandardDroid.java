package org.example.droids;

public class StandartDroid {
    protected String name;
    protected int health;
    protected int damage;

    public StandartDroid(String name) {
        this.name = name;
        this.damage = (int) (Math.random()*10);
        this.health = (int) (Math.random()*10);
    }
}
