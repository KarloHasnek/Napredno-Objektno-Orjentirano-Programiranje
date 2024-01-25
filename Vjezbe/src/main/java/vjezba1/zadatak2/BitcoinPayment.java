package vjezba1.zadatak2;

public class BitcoinPayment implements PaymentMethod{
    @Override
    public void pay(float amount) {
        System.out.println("Paying " + amount + " with Bitcoin.");
    }
}
