package vjezba2.zadatak4;

import java.time.LocalTime;

public class BackendProgrammer implements Observer {

    private String name;

    public BackendProgrammer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void update(String code, LocalTime lastPush, String name) {
        System.out.println("----------MESSAGE FOR BACKEND PROGRAMMER----------");
        System.out.println("Programmer: " + name + " pushed new code at: " + lastPush + ".\nNew code is: " + code);
    }
}
