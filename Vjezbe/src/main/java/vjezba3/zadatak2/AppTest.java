package vjezba3.zadatak2;

public class AppTest {

    public static void main(String[] args) {
        NoviSoftver noviSoftver = new NoviSoftver();
        noviSoftver.ispisGrafike();

        StariSoftver stariSoftver = new StariSoftver();
        Grafika adapter = new Adapter(stariSoftver);
        adapter.ispisGrafike();
    }
}
