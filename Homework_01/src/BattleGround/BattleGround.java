package BattleGround;

import BattleGround.Enemies.Enemy;
import BattleGround.Enemies.Orc;
import BattleGround.Heroes.Archer;
import BattleGround.Heroes.Hero;
import BattleGround.Heroes.Mage;
import BattleGround.Heroes.Warrior;

public class BattleGround {
    public static void main(String[] args) {
        Enemy orc = new Orc();

        Hero archer = new Archer("Legolas");
        Hero mage = new Mage("Gandalf");
        Hero warrior = new Warrior("Aragon");

        while (true) {
            if (orc.isAlive()) {
                if (archer.isAlive()) {
                    archer.attackEnemy(orc);
                }
                if (mage.isAlive()) {
                    mage.attackEnemy(orc);
                }
                if (warrior.isAlive()) {
                    warrior.attackEnemy(orc);
                }
            } else {
                System.out.println("The heroes won!");
                break;
            }

            if (warrior.isAlive()) {
                if (orc.isAlive()) {
                    orc.attackHero(warrior);
                }
            } else {
                if (orc.isAlive()) {
                    orc.attackHero(archer);
                }
            }
            if (!archer.isAlive()) {
                if (orc.isAlive()) {
                    orc.attackHero(mage);
                }
            }
            if (!mage.isAlive()) {
                System.out.println("Orc wins!");
                break;
            }
        }
    }
}
