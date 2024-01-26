package vjezba2.zadatak4;

import java.time.LocalTime;

public class FrontendProgrammer implements Observer{

    private String name;

    public FrontendProgrammer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void update(String code, LocalTime lastPush, String name) {
        System.out.println("----------MESSAGE FOR FRONTEND PROGRAMMER----------");
        System.out.println("Programmer: " + name + " pushed new code at: " + lastPush + ".\nNew code is: " + code);
    }
}
