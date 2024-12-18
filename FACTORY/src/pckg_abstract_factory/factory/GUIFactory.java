package pckg_abstract_factory.factory;


import pckg_abstract_factory.components.Button;
import pckg_abstract_factory.components.Checkbox;
import pckg_abstract_factory.components.ComboBox;

public interface GUIFactory {

    Button createButton();
    Checkbox createCheckbox();
    ComboBox createComboBox();

    void createGUI();
}
