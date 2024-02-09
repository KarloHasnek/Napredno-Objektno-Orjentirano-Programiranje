package vjezba7.zadatak2;

public class GoldMembership implements Membership {
    @Override
    public String getType() {
        return "Gold";
    }

    @Override
    public double getDiscount() {
        return 0.15; // 15% popust za zlatne članove
    }
}