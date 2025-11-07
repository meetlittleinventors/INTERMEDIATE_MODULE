import java.util.*;

class Character {
    String name;
    int health;
    int attackPower;

    Character(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    void attack(Character opponent) {
        System.out.println(name + " attacks " + opponent.name + " for " + attackPower + " damage!");
        opponent.health -= attackPower;
        if (opponent.health < 0) opponent.health = 0;
    }

    void heal() {
        int healAmount = 15;
        health += healAmount;
        System.out.println(name + " heals for " + healAmount + " HP!");
    }

    void showStats() {
        System.out.println(name + " → Health: " + health);
    }

    boolean isAlive() {
        return health > 0;
    }
}

public class BattleSimulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== TEXT-BASED RPG BATTLE SIMULATOR =====");
        System.out.print("Enter your player name: ");
        String playerName = sc.nextLine();

        Character player = new Character(playerName, 100, 20);
        Character enemy = new Character("Goblin", 80, 15);

        System.out.println("\nBattle begins between " + player.name + " and " + enemy.name + "!");
        System.out.println("------------------------------------------");

        while (player.isAlive() && enemy.isAlive()) {
            System.out.println("\nYour Turn!");
            player.showStats();
            enemy.showStats();

            System.out.println("\nChoose action:");
            System.out.println("1. Attack");
            System.out.println("2. Heal");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                player.attack(enemy);
            } else if (choice == 2) {
                player.heal();
            } else {
                System.out.println("Invalid choice! You missed your turn.");
            }

            // Check if enemy is defeated
            if (!enemy.isAlive()) {
                System.out.println("\n🎉 " + player.name + " wins the battle!");
                break;
            }

            // Enemy's turn
            System.out.println("\nEnemy's Turn!");
            enemy.attack(player);

            // Check if player is defeated
            if (!player.isAlive()) {
                System.out.println("\n💀 " + enemy.name + " wins the battle!");
                break;
            }
        }

        System.out.println("\n===== Battle Over =====");
        player.showStats();
        enemy.showStats();
        sc.close();
    }
}
