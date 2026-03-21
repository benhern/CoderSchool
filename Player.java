public class Player {

    int health;

    public Player(int startingHealth) {
        health = startingHealth;
    }

    public void takeDamage(int damage) {
        health = health - damage;
        System.out.println("You took " + damage + " damage!");
    }

    public void heal(int amount) {
        health = health + amount;
        System.out.println("You healed " + amount + " health!");
    }

    public int getHealth() {
        return health;
    }

}
