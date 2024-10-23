package pckg_gui_calculator.strategy_save;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class SaveText implements SaveDataStrategy<String>{
    @Override
    public void saveDataToFile(String filePath, List<String> data) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(new File(filePath)))) {
            for (String element : data) {
                writer.write(element);
                writer.newLine();
            }
            System.out.println("Data saved to file: " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
