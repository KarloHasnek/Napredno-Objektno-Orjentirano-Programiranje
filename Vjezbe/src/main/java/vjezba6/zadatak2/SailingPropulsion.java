package vjezba6.zadatak2;

public class SailingPropulsion extends PropulsionSystem {

    public SailingPropulsion() {
    }

    @Override
    public void description() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "SailinPropulsion [only on wind]";
    }
}