package pckg_decorator_icecream;

public class HazelnutDecorator extends IceCreamDecorator{

    protected HazelnutDecorator(int amount, IceCream iceCream) {
        super(amount, iceCream);
    }

    @Override
    protected double calculatePrice() {
        return this.iceCream.calculatePrice() + this.amount * IceCreamDecorator.unitPrice;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " decorates -> " + this.iceCream;
    }
}
