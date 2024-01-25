package vjezba1.zadatak2;

public class CardPayment implements PaymentMethod{
    @Override
    public void pay(float amount) {
        System.out.println("Paying " + amount + " with card.");
    }
}
