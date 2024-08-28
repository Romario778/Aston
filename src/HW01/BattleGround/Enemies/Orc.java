package HW01.BattleGround.Enemies;

public class Orc extends Enemy {
    public Orc() {
        setHealth(450);
        setDamage(30 + (int)(Math.random() * 25));
    }
}
