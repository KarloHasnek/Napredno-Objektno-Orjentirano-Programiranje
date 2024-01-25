package vjezba1.zadatak2;


public class AppTest {

    public static void main(String[] args) {

        ShoeStore store = new ShoeStore();
        store.setPaymentMethod(new CardPayment());
        store.buyShoes(100);
        store.setPaymentMethod(new CashPayment());
        store.buyShoes(150);
        store.setPaymentMethod(new PayPalPayment());
        store.buyShoes(200);
        store.setPaymentMethod(new BitcoinPayment());
        store.buyShoes(250);
    }
}
