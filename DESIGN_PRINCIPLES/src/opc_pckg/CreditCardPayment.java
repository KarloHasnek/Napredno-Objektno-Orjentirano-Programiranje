package opc_pckg;

public class CreditCardPayment implements PaymentInt{
    @Override
    public void performPayment(double price) {
        System.out.println("Credit card payment." + price );
    }
}
