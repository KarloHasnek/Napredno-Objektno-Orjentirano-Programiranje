package pckg_decorator_revision.pckg_decorator_icecream;

public abstract class IceCream {

    protected static final double unitPrice = 2;
    protected int amount;

    protected IceCream(int amount ) {
        this.amount = amount;
    }

    protected abstract double calculatePrice();
}
