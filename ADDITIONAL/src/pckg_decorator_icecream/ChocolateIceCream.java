package pckg_decorator_icecream;

public class ChocolateIceCream extends IceCream {

    protected ChocolateIceCream(int amount) {
        super(amount);
    }

    @Override
    protected double calculatePrice() {
        return this.amount * IceCream.unitPrice;
    }

    @Override
    public String toString() {
        return "ChocolateIceCream" + "@" + this.hashCode();
    }
}
