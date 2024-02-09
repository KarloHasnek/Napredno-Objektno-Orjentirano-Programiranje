package vjezba7.zadatak2;

public class PlatinumMembership implements Membership {
    @Override
    public String getType() {
        return "Platinum";
    }

    @Override
    public double getDiscount() {
        return 0.20; // 20% popust za platinaste članove
    }
}