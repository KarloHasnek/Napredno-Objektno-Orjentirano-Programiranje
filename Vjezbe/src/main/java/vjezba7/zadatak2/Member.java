package vjezba7.zadatak2;

public class Member {

    private String name;
    private Membership membership;

    public Member(String name, Membership membership) {
        this.name = name;
        this.membership = membership;
    }

    public String getName() {
        return name;
    }

    public String getMembershipType() {
        return membership.getType();
    }

    public double getMembershipDiscount() {
        return membership.getDiscount();
    }

    public void changeMembership(Membership newMembership) {
        this.membership = newMembership;
    }
}
