package vjezba5.zadatak1;

public class RPGGame {
    public static void main(String[] args) {

        Knight knight1 = new SimpleKnight();
        Knight knight2 = new FirstRangKnight(knight1);
        Knight knight3 = new SecondRangKnight(knight1);

        System.out.println(knight1.getDescription() + " Power Level: " + knight1.getPowerLevel());
        knight1.attack();
        knight1.avoidBattle();

        System.out.println(knight2.getDescription() + " Power Level: " + knight2.getPowerLevel());
        knight2.attack();
        knight2.avoidBattle();

        System.out.println(knight3.getDescription() + " Power Level: " + knight3.getPowerLevel());
        knight3.attack();
        knight3.avoidBattle();
    }
}
