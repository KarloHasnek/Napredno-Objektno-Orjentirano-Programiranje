package pckg_gui_calculator.load_strategy;

import java.util.List;

public interface LoadDataStrategy<E> {

    List<E> loadData(String filePath);

}
