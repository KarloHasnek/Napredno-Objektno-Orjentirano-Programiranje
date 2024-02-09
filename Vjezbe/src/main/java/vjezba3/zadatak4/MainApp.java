package vjezba3.zadatak4;

public class MainApp {
    public static void main(String[] args) {

        // Stvaranje instanci podsustava
        SubSystem1 subSystem1 = new SubSystem1();
        SubSystem2 subSystem2 = new SubSystem2();
        SubSystem3 subSystem3 = new SubSystem3();
        SubSystemEnergy subSystemEnergy = new SubSystemEnergy();
        SubsystemTimer subsystemTimer = new SubsystemTimer();

        // Stvaranje instance fasade s navedenim podsustavima
        AirCondSystemFacade facade = new AirCondSystemFacade(subSystem1, subSystem2, subSystem3, subSystemEnergy, subsystemTimer);

        // Pokretanje klimatizacijskog sustava pomoću fasade
        facade.startAirconditioningSystem();

        // Gašenje klimatizacijskog sustava pomoću fasade
        facade.stopAirconditioningSystem();
    }
}
