package vjezba7.zadatak2;

public class DiamondMembership implements Membership {
    @Override
    public String getType() {
        return "Diamond";
    }

    @Override
    public double getDiscount() {
        return 0.25; // 25% popust za dijamantne članove
    }
}
