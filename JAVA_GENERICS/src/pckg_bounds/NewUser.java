package pckg_bounds;

public class NewUser extends User {

    protected NewUser(String name) {
        super(name);
    }

    @Override
    public void performSomething() {
        super.performSomething();
        System.out.println("This is the new user");
    }
}
