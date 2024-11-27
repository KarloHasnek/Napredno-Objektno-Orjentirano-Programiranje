package pckg_strategy_file_writing;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterStrategy implements WriteStrategy{

    @Override
    public void writeToFile(String content, String filePath) {
        try (FileWriter fileWriter = new FileWriter(filePath, true);) {
            fileWriter.write(content);
            fileWriter.write(System.lineSeparator());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
