package pckg_ducks;

public class DuckClientSimulator {

    private Duck duck;

    public DuckClientSimulator() {
        this.duck = new RubberDuck();
        this.duck.setFlyable(new FlyNoWay());
        this.duck.setQuackable(new QuackRubber());
    }

    public Duck getDuck() {
        return this.duck;
    }

    public void setDuck(Duck duck) {
        this.duck = duck;
    }

    @Override
    public String toString() {
        return "Client{" +
                "duck=" + duck +
                '}';
    }

    public void startSimulation() {
        System.out.println("Starting simulation for: " + this.duck.getClass().getSimpleName());
        duck.display();
        duck.swim();
        duck.performFly();
        duck.performQuack();
    }
}
