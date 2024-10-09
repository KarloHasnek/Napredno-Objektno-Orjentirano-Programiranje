package pckg_intro;

import java.util.HashMap;

public class AppMap {

    public static void main(String[] args) {

        HashMap<Integer, String> mapa1 = new HashMap<>();
        HashMap<User, String> mapa2 = new HashMap<>();

        mapa1.put(10, "a");
        mapa1.put(20, "b");
        mapa2.put(new User("user1"), "a");
        mapa2.put(new User("user2"), "b");

        AUX_CLS.listMapElements(mapa1);
        AUX_CLS.listMapElements(mapa2);
    }
}
