package vjezba5.zadatak1;

public class SecondRangKnight extends KnightDecorator {
    public SecondRangKnight(Knight knight) {
        super(knight);
        description = "Second Rank Knight";
        powerLevel = 10;
    }

    public void attack() {
        System.out.println("Second Rank Knight attacks with a mace and a shield.");
    }

    public int getPowerLevel() {
        return knight.getPowerLevel() + powerLevel;
    }

    public void avoidBattle() {
        System.out.println("Second Rank Knight avoids battle by running and jumping over obstacles.");
    }
}