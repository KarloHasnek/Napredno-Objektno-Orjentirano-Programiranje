package pckg_strategy_file_writing;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class FilesStrategy implements WriteStrategy{

    @Override
    public void writeToFile(String content, String filePath) {
        try {
            Files.write(Paths.get(filePath), content.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
