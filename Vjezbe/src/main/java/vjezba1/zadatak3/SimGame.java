package vjezba1.zadatak3;

public class SimGame {

    public static void main(String[] args) {

        Hero hero = new Hero();
        hero.setAndApplyAbility(new DoubleStrengthStrategy());
        System.out.println(hero);
        hero.setAndApplyAbility(new FastRunningStrategy());
        System.out.println(hero);
        hero.setAndApplyAbility(new FlyingStrategy());
        System.out.println(hero);
        hero.setAndApplyAbility(new SuperVisionStrategy());
        System.out.println(hero);
    }
}
