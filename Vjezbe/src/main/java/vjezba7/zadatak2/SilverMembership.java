package vjezba7.zadatak2;

public class SilverMembership implements Membership {
    @Override
    public String getType() {
        return "Silver";
    }

    @Override
    public double getDiscount() {
        return 0.10; // 10% popust za srebrne članove
    }
}