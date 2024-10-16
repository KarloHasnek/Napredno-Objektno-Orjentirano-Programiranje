package pckg_ducks;

public abstract class Duck {

    protected Flyable flyBehaviour;
    protected Quackable quackBehaviour;

    public void setFlyable(Flyable flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackable(Quackable quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    protected abstract void display();
    protected abstract void swim();

    public void performFly() {
        flyBehaviour.fly();
    }

    public void performQuack() {
        quackBehaviour.quack();
    }
}
