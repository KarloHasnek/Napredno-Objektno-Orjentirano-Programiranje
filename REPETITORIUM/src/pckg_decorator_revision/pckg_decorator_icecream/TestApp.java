package pckg_decorator_revision.pckg_decorator_icecream;

public class TestApp {

    public static void main(String[] args) {

        IceCream vanillaIceCream = new DarkChocolateDecorator(1, new HazelnutDecorator(1, new VanillaIceCream(3)));
        double finalPrice = vanillaIceCream.calculatePrice();
        System.out.println(vanillaIceCream);
        System.out.println(finalPrice + "€");
    }
}
