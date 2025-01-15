package lod_pckg;

public class Order {

    private Product product;

    public Order(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return this.product;
    }
}
