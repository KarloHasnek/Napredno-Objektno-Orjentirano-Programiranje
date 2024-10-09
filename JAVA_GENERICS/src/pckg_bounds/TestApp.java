package pckg_bounds;

public class TestApp {

    public static void main(String[] args) {
        Integer[] intArr = {1, 2, 3};
        BestUser [] users = {new BestUser("Besty"), new BestUser("Plain"), new BestUser("Newbie")};

        SimpleClass<BestUser> bestUserSimpleClass = new SimpleClass<BestUser>(users);

        bestUserSimpleClass.performSomething();
    }
}
