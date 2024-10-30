package pckg_gui_calculator.load_strategy;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LoadTextStrategy implements LoadDataStrategy<String> {
    @Override
    public List<String> loadData(String filePath) {
        List<String> loadedData = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                loadedData.add(line);
            }
            System.out.println("Data loaded successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return loadedData;
    }
}
