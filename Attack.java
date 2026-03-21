public class Attack {

    int damage;

    public Attack(int damageAmount) {
        damage = damageAmount;
    }

    public int useAttack() {
        System.out.println("You attack the enemy for " + damage + " damage!");
        return damage;
    }

}
