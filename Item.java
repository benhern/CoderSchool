public class Item {

    int healAmount;

    public Item(int heal) {
        healAmount = heal;
    }

    public int useItem() {
        System.out.println("You used a healing potion!");
        return healAmount;
    }

}
