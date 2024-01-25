package vjezba1.zadatak2;

public class ShoeStore {

    private PaymentMethod paymentMethod;

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void buyShoes(float amount) {
        paymentMethod.pay(amount);
    }
}
