package lod_pckg;

public class Customer {

    private Order order;

    public Customer(Order order) {
        this.order = order;
    }

    public Order getOrder() {
        return this.order;
    }
}
