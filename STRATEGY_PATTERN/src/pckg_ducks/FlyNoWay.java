package pckg_ducks;

public class FlyNoWay implements Flyable{
    @Override
    public void fly() {
        System.out.println("I can't fly!!!");
    }
}
