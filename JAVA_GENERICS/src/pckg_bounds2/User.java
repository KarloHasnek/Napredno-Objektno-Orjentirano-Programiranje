package pckg_bounds2;

public class User implements Comparable<User> {

    private int id;
    private static int cntID = 0;
    private String name;


    public User(String name) {
        this.id = ++cntID;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(User o) {

        int returnValue = 0;

        if (this.name.length() > o.name.length()) {
            System.out.println("First user has longer name than second user");
            returnValue = 1;
        } else if (this.name.length() < o.name.length()) {
            System.out.println("Second user has longer name than first user");
            returnValue = -1;
        } else {
            System.out.println("Both users have the same name length");
            returnValue = 0;
        }

        return returnValue;
    }


//
//    @Override
//    public int compareTo(User o) {
//
//        int returnValue = 0;
//
//        if (this.id > o.id) {
//            System.out.println("First user has greater id than second user");
//            returnValue = 1;
//        } else if (this.id < o.id) {
//            System.out.println("Second user has greater id than first user");
//            returnValue = -1;
//        } else {
//            System.out.println("Both users have the same id");
//            returnValue = 0;
//        }
//
//        return returnValue;
//    }
}
