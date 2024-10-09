package pckg_intro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class AUX_CLS {

    public static void listStrings(ArrayList<String> lista) {
        for (String str: lista) {
            System.out.println(str);
        }
    }

    public static void listIntegers(ArrayList<Integer> lista) {
        for (Integer intEl: lista) {
            System.out.println(intEl);
        }
    }

    public static void listUsers(ArrayList<User> lista) {
        for (User user: lista) {
            System.out.println(user);
        }
    }

    public static <E> void listElements(ArrayList<E> lista) {
        if (lista.isEmpty()) {
            System.out.println("List is empty.");
            return;
        } else {
            for (E el: lista) {
                System.out.println(el);
            }
        }
    }

    public static <Q> void listElements2(ArrayList<Q> lista) {
        Iterator<Q> iter = lista.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

    public static <K, V> void listMapElements(HashMap<K, V> map) {
        if (map.isEmpty()){
            System.out.println("mapa je prazna...");
        } else {
            System.out.println("Map details:" + Integer.toHexString(map.hashCode()));
            for (Map.Entry<K,V> entry: map.entrySet()) {
                System.out.println("Key: " + entry.getKey());
                System.out.println("Value: " + entry.getValue());
            }
        }
    }
}
