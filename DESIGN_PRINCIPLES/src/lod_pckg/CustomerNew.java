package lod_pckg;

public class CustomerNew {

    private OrderNew order;

    public CustomerNew(OrderNew order) {
        this.order = order;
    }

    public double getOrderPrice() {
        return this.order.getPrice();
    }
}
