package pckg_decorator_revision.pckg_decorator_icecream;

public class DarkChocolateDecorator extends IceCreamDecorator {

    protected DarkChocolateDecorator(int amount, IceCream iceCream) {
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
