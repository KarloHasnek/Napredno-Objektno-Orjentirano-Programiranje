package opc_pckg;

public class Payment {

    public void payWithCreditCard(double amount) {
        System.out.println("Credit card payment." + amount );
    }

    public void payWithPayPal(double amount) {
        System.out.println("PayPal payment." + amount );
    }
}
