package pckg_abstract_factory.components;

public class MACComboBox implements ComboBox{

    @Override
    public void renderElement() {
        System.out.println("Rendering " + getClass().getSimpleName());
    }
}
