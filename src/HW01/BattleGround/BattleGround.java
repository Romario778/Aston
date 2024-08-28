package HW01.BattleGround;

import HW01.BattleGround.Enemies.Enemy;
import HW01.BattleGround.Enemies.Orc;
import HW01.BattleGround.Heroes.Archer;
import HW01.BattleGround.Heroes.Hero;
import HW01.BattleGround.Heroes.Mage;
import HW01.BattleGround.Heroes.Warrior;


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
