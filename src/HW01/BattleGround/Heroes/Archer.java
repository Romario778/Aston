package HW01.BattleGround.Heroes;

public class Archer extends Hero {
    public Archer(String name) {
        super(name);
        setDamage(10 + (int) (Math.random() * 20));
        setHealth(120);
    }
}
