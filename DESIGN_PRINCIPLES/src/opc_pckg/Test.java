package opc_pckg;

public class Test {

    public static void main(String[] args) {

        PaymentInt payment = new CreditCardPayment();
        WebShop webShop = new WebShop(payment);
        webShop.performPayment(1, 100);
    }
}
