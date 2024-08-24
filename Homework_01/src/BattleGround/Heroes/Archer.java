package BattleGround.Heroes;

import BattleGround.Enemies.Enemy;

public class Archer extends Hero {
    public Archer(String name) {
        super(name);
        setDamage(10 + (int) (Math.random() * 20));
        setHealth(120);
    }
}
