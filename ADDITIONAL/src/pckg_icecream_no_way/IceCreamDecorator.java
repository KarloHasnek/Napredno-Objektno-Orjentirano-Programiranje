package pckg_icecream_no_way;

public class IceCreamDecorator extends IceCream {

    protected static final double unitPrice = 0.5;
    private IceCream iceCream;

    public IceCreamDecorator(int amount, IceCream iceCream) {
        super(amount);
        this.iceCream = iceCream;
    }

    @Override
    public double calculatePrice() {
        return this.iceCream.calculatePrice() + this.amount * IceCreamDecorator.unitPrice;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " -> " + iceCream.toString();
    }
}
