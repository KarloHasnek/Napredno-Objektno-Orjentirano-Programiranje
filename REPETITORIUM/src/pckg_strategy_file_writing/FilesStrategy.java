package pckg_strategy_file_writing;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;


public class FilesStrategy implements WriteStrategy{

    @Override
    public void writeToFile(String content, String filePath) {
        try {
            Files.write(Paths.get(filePath), content.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
