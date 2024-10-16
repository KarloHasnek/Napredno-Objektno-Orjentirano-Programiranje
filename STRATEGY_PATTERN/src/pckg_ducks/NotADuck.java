package pckg_ducks;

public class NotADuck extends Duck{
    @Override
    protected void display() {
        System.out.println("I am a penguin");
    }

    @Override
    protected void swim() {
        System.out.println("I am swimming fast!");
    }
}
