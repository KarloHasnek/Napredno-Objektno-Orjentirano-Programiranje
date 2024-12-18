package pckg_abstract_factory.components;

public class WINCheckBox implements Checkbox{

    @Override
    public void renderElement() {
        System.out.println("Rendering" + getClass().getSimpleName());
    }
}
