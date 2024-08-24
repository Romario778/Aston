package BattleGround.Enemies;

import BattleGround.Heroes.Hero;

public class Orc extends Enemy {
    public Orc() {
        setHealth(450);
        setDamage(30 + (int)(Math.random() * 25));
    }
}
