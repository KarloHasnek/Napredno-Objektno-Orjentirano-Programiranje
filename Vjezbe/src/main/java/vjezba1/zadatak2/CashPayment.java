package vjezba1.zadatak2;

public class CashPayment implements PaymentMethod{
    @Override
    public void pay(float amount) {
        System.out.println("Paying " + amount + " with cash.");
    }
}
