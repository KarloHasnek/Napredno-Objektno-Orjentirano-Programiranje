package lod_pckg;

public class Test {

    public static void main(String[] args) {

        Product product = new Product(250);
        Order order = new Order(product);
        Customer customer = new Customer(order);

        double price = customer.getOrder().getProduct().getPrice();
        System.out.println("Price old: " + price);

//      -----------------------------------------------------------------

        Product product2 = new Product(300);
        OrderNew orderNew = new OrderNew(product2);
        CustomerNew customerNew = new CustomerNew(orderNew);

        double priceNew = customerNew.getOrderPrice();
        System.out.println("Price new: " + priceNew); 
    }
}
