package pckg_icecream;

public abstract class IceCreamDecorator extends AbstractIceCream {

    protected AbstractIceCream iceCream;

    protected IceCreamDecorator(String name, double unitPrice, int amount, AbstractIceCream iceCream) {
        super(name, unitPrice, amount);
        this.iceCream = iceCream;
    }

    protected abstract double decoratedPrice();

    @Override
    protected double calculatePrice() {
        double price = this.iceCream.calculatePrice() + unitPrice * amount;
        System.out.println(getClass().getSimpleName() + " decorates: " + this.iceCream.getClass().getSimpleName());
        return price;
    }
}
