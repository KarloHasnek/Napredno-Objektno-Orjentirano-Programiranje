package vjezba2.zadatak4;

import java.time.LocalTime;

public interface Observer {

    String getName();

    void update(String code, LocalTime lastPush, String name);
}
