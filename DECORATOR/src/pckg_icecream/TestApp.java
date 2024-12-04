package pckg_icecream;

public class TestApp {

    public static void main(String[] args) {

        ChocolateIcreCream choco1 = new ChocolateIcreCream("Chocolate", 2.0, 2);
//        choco1.description();
//        choco1.calculatePrice();
        HoneyDecorator honey1 = new HoneyDecorator("Honey", 1.0, 1, choco1);
        double price = honey1.decoratedPrice();
//        System.out.println(price);
//        HazelnutDecorator hazelnut1 = new HazelnutDecorator("Hazelnut", 1.5, 1, honey1);
////        System.out.println("Decorated price\n");
//        price = hazelnut1.decoratedPrice();
//        System.out.println("\nfinal price: " + price);

        AbstractIceCream sladoled = new HazelnutDecorator("Hazelnut", 1.5, 1, new HoneyDecorator("Honey", 1.0, 1, new ChocolateIcreCream("Chocolate", 2.0, 2)));
        price = sladoled.calculatePrice();
        System.out.println("\nfinal price: " + price);
    }
}
