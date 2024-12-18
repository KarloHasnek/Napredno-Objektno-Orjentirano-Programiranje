package pckg_abstract_factory.factory;

import pckg_abstract_factory.components.*;

public class MACFactory implements GUIFactory{

    Button button;
    Checkbox checkbox;
    ComboBox comboBox;

    @Override
    public Button createButton() {
        return new MACButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WINCheckBox();
    }

    @Override
    public ComboBox createComboBox() {
        return new MACComboBox();
    }

    @Override
    public void createGUI() {
        button = createButton();
        checkbox = createCheckbox();
        comboBox = createComboBox();
        System.out.println("Creating GUI for: " + this.getClass().getSimpleName());
    }
}
