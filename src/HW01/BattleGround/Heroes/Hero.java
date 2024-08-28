package HW01.BattleGround.Heroes;


import BattleGround.Mortal;
import HW01.BattleGround.Enemies.Enemy;

public abstract class Hero implements Mortal {
    private String name; // Имя героя
    private int health;
    private int damage; // Наносимый героем урон

    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public boolean isAlive() {
        return getHealth() > 0;
    }

    //Получает урон
    public void takeDamage(int damage) {
        health -= damage;
    }

    //Наносим урон
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(getDamage());
        System.out.println(getName() + " attacks enemy! Enemy health amount: " + enemy.getHealth() + ". Damage amount: " + getDamage());
    }
}
