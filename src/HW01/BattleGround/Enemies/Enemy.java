package HW01.BattleGround.Enemies;


import BattleGround.Mortal;
import HW01.BattleGround.Heroes.Hero;

public abstract class Enemy implements Mortal {
    private int health;
    private int damage;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    //Получает урон
    public void takeDamage(int damage) {
        health -= damage;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    //Наносим урон
    public void attackHero(Hero hero) {
        hero.takeDamage(getDamage());
        System.out.println("Orc attacks " + hero.getName() + "! Hero health amount: " + hero.getHealth() + ". Damage amount: " + getDamage());
    }

    // Проверяем остаток здоровье
    @Override
    public boolean isAlive() {
        return health > 0;
    }
}
