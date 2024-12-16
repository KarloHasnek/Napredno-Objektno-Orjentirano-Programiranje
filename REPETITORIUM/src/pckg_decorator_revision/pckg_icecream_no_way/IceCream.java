package pckg_decorator_revision.pckg_icecream_no_way;

public class IceCream {

    protected int amount;
    protected static final double unitPrice = 2;

    protected IceCream(int amount ) {
        this.amount = amount;
    }

    protected double calculatePrice() {
        return this.amount * IceCream.unitPrice;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "@" + this.hashCode();
    }
}
