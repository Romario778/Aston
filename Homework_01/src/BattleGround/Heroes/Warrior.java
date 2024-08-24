package BattleGround.Heroes;

import BattleGround.Enemies.Enemy;

public class Warrior extends Hero {
    public Warrior(String name) {
        super(name);
        setDamage(15 + (int) (Math.random() * 5));
        setHealth(150);
    }
}
