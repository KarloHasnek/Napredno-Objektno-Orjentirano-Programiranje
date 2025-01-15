package opc_pckg;

public class PayPalPayment implements PaymentInt{

    @Override
    public void performPayment(double price) {
        System.out.println("PayPal payment." + price );
    }
}
