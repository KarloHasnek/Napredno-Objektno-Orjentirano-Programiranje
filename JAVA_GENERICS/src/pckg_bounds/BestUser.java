package pckg_bounds;

public class BestUser extends User{

    protected BestUser(String name) {
        super(name);
    }

    @Override
    public void performSomething() {
        super.performSomething();
        System.out.println("This is the best user");
    }
}
