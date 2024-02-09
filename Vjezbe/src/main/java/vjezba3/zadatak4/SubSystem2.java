package vjezba3.zadatak4;

class SubSystem2 {
    public void setMode(String mode) {
        System.out.println("Postavljanje načina rada: " + mode);
    }

    public void setTemperature(float v) {
        System.out.println("Postavljanje temperature na: " + v);
    }

    public void fanSpeed(int i) {
        System.out.println("Postavljanje brzine ventilatora na: " + i);
    }
}