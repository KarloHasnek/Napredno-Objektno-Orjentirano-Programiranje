package vjezba3.zadatak4;

class SubSystemEnergy {
    public void on() {
        System.out.println("Uključivanje energetskog sustava");
    }

    public void mode(String mode) {
        System.out.println("Postavljanje energetskog načina na: " + mode);
    }

    public void start() {
        System.out.println("Pokretanje energetskog sustava");
    }
}
