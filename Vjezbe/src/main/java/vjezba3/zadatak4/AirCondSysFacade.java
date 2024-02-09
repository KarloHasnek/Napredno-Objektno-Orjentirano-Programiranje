package vjezba3.zadatak4;

class AirCondSystemFacade {
    private SubSystem1 subSystem1;
    private SubSystem2 subSystem2;
    private SubSystem3 subSystem3;
    private SubSystemEnergy subSystemEnergy;
    private SubsystemTimer subsystemTimer;

    public AirCondSystemFacade(SubSystem1 subSystem1, SubSystem2 subSystem2, SubSystem3 subSystem3,
                               SubSystemEnergy subSystemEnergy, SubsystemTimer subsystemTimer) {
        this.subSystem1 = subSystem1;
        this.subSystem2 = subSystem2;
        this.subSystem3 = subSystem3;
        this.subSystemEnergy = subSystemEnergy;
        this.subsystemTimer = subsystemTimer;
    }

    // Metoda za pokretanje klimatizacijskog sustava
    public void startAirconditioningSystem() {
        subSystem1.setMode("Cool");
        subSystem2.setTemperature(20.0f);
        subSystem2.fanSpeed(3);
        subSystem3.turnIonizer(true);
        subSystemEnergy.on();
        subSystemEnergy.mode("High");
        subSystemEnergy.start();
        subsystemTimer.program(1);
        subsystemTimer.on(true);
        System.out.println("Klimatizacijski sustav je pokrenut.");
    }

    // Metoda za gašenje klimatizacijskog sustava
    public void stopAirconditioningSystem() {
        subSystem1.setMode("Off");
        subSystem2.setTemperature(25.0f);
        subSystem3.turnIonizer(false);
        subSystemEnergy.mode("Low");
        subSystemEnergy.start();
        subsystemTimer.on(false);
        System.out.println("Klimatizacijski sustav je ugašen.");
    }
}
