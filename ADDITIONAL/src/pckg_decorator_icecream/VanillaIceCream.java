package pckg_decorator_icecream;

public class VanillaIceCream extends IceCream {

    protected VanillaIceCream(int amount) {
        super(amount);
    }

    @Override
    protected double calculatePrice() {
        return this.amount * IceCream.unitPrice;
    }

    @Override
    public String toString() {
        return "VanillaIceCream" + "@" + this.hashCode();
    }
}
