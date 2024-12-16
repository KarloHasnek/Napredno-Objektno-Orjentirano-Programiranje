package pckg_decorator_revision.pckg_decorator_icecream;

public abstract class IceCreamDecorator extends IceCream {

    protected IceCream iceCream;
    protected static final double unitPrice = 0.5;

    protected IceCreamDecorator(int amount, IceCream iceCream) {
        super(amount);
        this.iceCream = iceCream;
    }

}
