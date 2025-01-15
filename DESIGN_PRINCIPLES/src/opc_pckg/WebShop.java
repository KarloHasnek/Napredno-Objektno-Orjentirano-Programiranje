package opc_pckg;

public class WebShop {

//    private Payment payment;
    private PaymentInt payment;

    public WebShop(PaymentInt payment) {
        this.payment = payment;
    }

    public void performPayment(int paymentChoice, double price) {
        switch (paymentChoice) {
            case 1:
                payment.performPayment(price);
            case 2:
                payment.performPayment(price);
            default:
                throw new IllegalArgumentException("Invalid payment choice.");
        }
    }
}
