package pckg_gui_calculator.strategy_save;

import java.util.List;

public interface SaveDataStrategy<E> {

    void saveDataToFile(String filePath, List<E> data);
}
