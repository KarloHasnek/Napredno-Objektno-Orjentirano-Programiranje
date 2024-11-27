package pckg_arraylist_command_problem;

public class User {

    private String username;
    private int id;
    private static int cntID = 100;

    public User(String username) {
        this.username = username;
        this.id = cntID++;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", id=" + id +
                '}';
    }
}
