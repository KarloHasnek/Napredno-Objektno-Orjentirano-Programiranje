package pckg_icecream;

public class ChocolateIcreCream extends AbstractIceCream {

    protected ChocolateIcreCream(String name, double unitPrice, int amount) {
        super(name, unitPrice, amount);
    }

    @Override
    protected double calculatePrice() {
        double price = unitPrice * amount;
        System.out.println("Price for " + getClass().getSimpleName() + " is: " + price);
        return price;
    }
}
