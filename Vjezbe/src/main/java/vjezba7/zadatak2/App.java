package vjezba7.zadatak2;

public class App {

    public static void main(String[] args) {

        Member goldMember = new Member("Karlo", new GoldMembership());
        Member silverMember = new Member("Andrija", new SilverMembership());
        Member bronzeMember = new Member("Teo", new BronzeMembership());

        Member platinumMember = new Member("Josip", new PlatinumMembership());
        Member diamondMember = new Member("Zvone", new DiamondMembership());

        printMemberDetails(bronzeMember);

        bronzeMember.changeMembership(new SilverMembership());

        printMemberDetails(bronzeMember);
        printMemberDetails(silverMember);
        printMemberDetails(goldMember);
        printMemberDetails(platinumMember);
        printMemberDetails(diamondMember);
    }

    private static void printMemberDetails(Member member) {
        System.out.println("------------ Member Details ------------");
        System.out.println("Member: " + member.getName());
        System.out.println("Membership Type: " + member.getMembershipType());
        System.out.println("Membership Discount: " + member.getMembershipDiscount() * 100 + "%");
        System.out.println("----------------------------------------");
    }
}
