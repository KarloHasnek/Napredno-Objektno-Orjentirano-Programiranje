package pckg_ducks;

public class QuackMute implements Quackable{
    @Override
    public void quack() {
        System.out.println("...[no quack]...");
    }
}
