package pckg_icecream_no_way;

public class TestApp {

    public static void main(String[] args) {

        IceCream iceCream = new DarkChocolateDecorator(1, new HazelnutDecorator(1, new VanillaIceCream(1)));
        System.out.println(iceCream + " -> " + iceCream.calculatePrice() + " €");
    }
}
