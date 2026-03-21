import java.util.Scanner;

public class AdventureGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Player player = new Player(100);
        Attack sword = new Attack(25);
        Item potion = new Item(20);

        int enemyHealth = 60;

        System.out.println("Welcome to the Adventure Game!");
        System.out.println("An enemy appears!");

        while (enemyHealth > 0 && player.getHealth() > 0) {

            System.out.println("\nYour Health: " + player.getHealth());
            System.out.println("Enemy Health: " + enemyHealth);

            System.out.println("\nChoose an action:");
            System.out.println("1. Attack");
            System.out.println("2. Use Potion");
            System.out.println("3. Run Away");

            int choice = scanner.nextInt();

            if (choice == 1) {

                enemyHealth = enemyHealth - sword.useAttack();

            } 
            else if (choice == 2) {

                player.heal(potion.useItem());

            } 
            else if (choice == 3) {

                System.out.println("You ran away!");
                break;

            } 
            else {

                System.out.println("Invalid choice.");

            }

            if (enemyHealth > 0) {

                int enemyDamage = 15;
                System.out.println("Enemy attacks you!");
                player.takeDamage(enemyDamage);

            }
        }

        if (player.getHealth() <= 0) {
            System.out.println("\nYou were defeated...");
        } 
        else if (enemyHealth <= 0) {
            System.out.println("\nYou defeated the enemy! Victory!");
        }

        scanner.close();
    }
}
