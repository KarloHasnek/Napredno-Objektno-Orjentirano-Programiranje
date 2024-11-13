package pckg_meteo_1;

public interface Observer {

    void update(float t, float h, float p);
    void register(Observable observable);
    void unregister(Observable observable);
}
