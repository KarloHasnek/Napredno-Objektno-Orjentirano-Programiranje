package lod_pckg;

public class OrderNew {

    private Product product;

    public OrderNew(Product product) {
        this.product = product;
    }

    public double getPrice() {
        return this.product.getPrice();
    }
}
