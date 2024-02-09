package vjezba3.zadatak2;

public class Adapter implements Grafika {
    private StariSoftver stariSoftver;

    public Adapter(StariSoftver stariSoftver) {
        this.stariSoftver = stariSoftver;
    }

    @Override
    public void ispisGrafike() {
        stariSoftver.plotGraphics();
        stariSoftver.plotGraphics();
    }
}