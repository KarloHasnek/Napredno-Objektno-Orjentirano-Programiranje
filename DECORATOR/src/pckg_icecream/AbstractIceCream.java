package pckg_icecream;

public abstract class AbstractIceCream {

    protected String name;
    protected double unitPrice;
    protected int amount;

    protected AbstractIceCream(String name, double unitPrice, int amount) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.amount = amount;
    }

    protected abstract double calculatePrice();

    public void description(){
        System.out.println(getClass().getSimpleName() +  ":");
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "AbsIceCream{" +
                "name='" + name + '\'' +
                ", price=" + unitPrice +
                ", amount=" + amount +
                '}';
    }
}
