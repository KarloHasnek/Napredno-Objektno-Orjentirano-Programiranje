package pckg_abstract_factory.factory;

import pckg_abstract_factory.components.*;

public class WINFactory implements GUIFactory{

    private Button button;
    private Checkbox checkbox;
    private ComboBox comboBox;

    @Override
    public Button createButton() {return new WINButton();}

    @Override
    public Checkbox createCheckbox() {
        return new WINCheckBox();
    }

    @Override
    public ComboBox createComboBox() {return new WINComboBox();}

    @Override
    public void createGUI() {
        button = createButton();
        checkbox = createCheckbox();
        comboBox = createComboBox();
        System.out.println("Creating GUI for: " + this.getClass().getSimpleName());
    }
}
