package pckg_ducks;

public class RubberDuck extends Duck{

    @Override
    protected void display() {
        System.out.println("I am a Rubber duck");
    }

    @Override
    protected void swim() {
        System.out.println("I am swimming");
    }
}
