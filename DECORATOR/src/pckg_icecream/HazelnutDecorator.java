package pckg_icecream;

public class HazelnutDecorator extends IceCreamDecorator{

    protected HazelnutDecorator(String name, double unitPrice, int amount, AbstractIceCream iceCream) {
        super(name, unitPrice, amount, iceCream);
    }

    @Override
    protected double decoratedPrice() {
        double price = this.calculatePrice();

        return price;
    }
}
