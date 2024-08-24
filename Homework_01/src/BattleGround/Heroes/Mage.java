package BattleGround.Heroes;

import BattleGround.Enemies.Enemy;

public class Mage extends Hero {
    public Mage(String name) {
        super(name);
        setDamage((int) (Math.random() * 50));
        setHealth(100);
    }
}
