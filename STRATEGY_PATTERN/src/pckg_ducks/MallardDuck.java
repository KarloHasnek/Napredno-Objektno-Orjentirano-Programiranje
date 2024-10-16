package pckg_ducks;

public class MallardDuck extends Duck{

    @Override
    protected void display() {
        System.out.println("I am a Mallard duck");
    }

    @Override
    protected void swim() {
        System.out.println("I am swimming");
    }
}
