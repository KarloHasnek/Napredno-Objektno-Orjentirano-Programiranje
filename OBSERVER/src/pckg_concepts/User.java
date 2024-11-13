package pckg_concepts;

public class User implements ServiceSignIn {

    private int id;
    private static int cntID = 100;
    private String name;

    public User(String name) {
        this.id = cntID++;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public void provideSignInInfo(String username, String password) {
        System.out.println(username);
        System.out.println(password);
    }
}
