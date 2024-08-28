package HW01.BattleGround.Heroes;

public class Warrior extends Hero {
    public Warrior(String name) {
        super(name);
        setDamage(15 + (int) (Math.random() * 5));
        setHealth(150);
    }
}
