package vjezba7.zadatak3;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        List<Master> list = new ArrayList<>();

        list.add(new NoviceMaster("Karlo"));
        list.add(new ExperiencedMaster("Andrija"));
        list.add(new SupremeMaster("Teo"));
        list.add(new Apprentice("Josip"));

        list.forEach(mst -> mst.askforAdvice());
        list.forEach(mst -> {
            try {
                mst.giveAdvice();
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        });

    }

}
