package vjezba7.zadatak2;

public class BronzeMembership implements Membership {
    @Override
    public String getType() {
        return "Bronze";
    }

    @Override
    public double getDiscount() {
        return 0.05; // 5% popust za brončane članove
    }
}