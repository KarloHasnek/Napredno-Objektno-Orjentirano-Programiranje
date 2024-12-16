package pckg_decorator_revision.pckg_icecream_no_way;

public class VanillaIceCream extends IceCream{

    public VanillaIceCream(int amount) {
        super(amount);
    }

    @Override
    public String toString() {
        return "VanillaIceCream{" +
                "amount=" + amount +
                '}';
    }
}
