package pckg_abstract_factory.components;

public class MACButton implements Button {

    @Override
    public void renderElement() {
        System.out.println("Rendering " + getClass().getSimpleName());
    }
}
