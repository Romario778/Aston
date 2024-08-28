package HW01.BattleGround.Heroes;

public class Mage extends Hero {
    public Mage(String name) {
        super(name);
        setDamage((int) (Math.random() * 50));
        setHealth(100);
    }
}
