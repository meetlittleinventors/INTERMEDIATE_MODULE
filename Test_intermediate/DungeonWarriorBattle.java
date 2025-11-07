import java.util.*;

class Warrior {
    String name;
    int health;
    int attackPower;

    Warrior(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    void attack(Warrior enemy) {
        int damage = new Random().nextInt(attackPower);
        enemy.health -= damage;
        System.out.println(name + " attacks " + enemy.name + " for " + damage + " damage!");
    }

    boolean isAlive() {
        return health > 0;
    }
}

public class DungeonWarriorBattle {
    public static void main(String[] args) {
        Warrior player = new Warrior("Hero", 100, 25);
        Warrior monster = new Warrior("Monster", 80, 20);

        System.out.println("⚔️ Dungeon Battle Begins! ⚔️");

        while (player.isAlive() && monster.isAlive()) {
            player.attack(monster);
            if (!monster.isAlive()) break;
            monster.attack(player);

            System.out.println("Hero Health: " + player.health + " | Monster Health: " + monster.health);
            System.out.println("--------------------------------");
        }

        if (player.isAlive())
            System.out.println("🎉 You Win!");
        else
            System.out.println("💀 You Lose!");
    }
}
