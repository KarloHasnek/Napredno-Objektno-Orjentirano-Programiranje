package pckg_ducks;

public class App {

    public static void main(String[] args) {

        DuckClientSimulator client = new DuckClientSimulator();
        client.startSimulation();
        client.setDuck(new MallardDuck());
        client.getDuck().setQuackable(new QuackLoud());
        client.getDuck().setFlyable(new FlyWithWings());
        client.startSimulation();
        client.setDuck(new NotADuck());
        client.getDuck().setQuackable(new QuackMute());
        client.getDuck().setFlyable(new FlyWithRocket());
        client.startSimulation();

    }
}
