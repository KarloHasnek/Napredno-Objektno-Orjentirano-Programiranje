package pckg_abstract_factory.components;

public class MACCheckBox implements Checkbox{

    @Override
    public void renderElement() {
        System.out.println("Rendering " + getClass().getSimpleName());
    }
}
