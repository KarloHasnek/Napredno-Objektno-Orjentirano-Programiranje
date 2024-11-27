package pckg_strategy_file_writing;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamStrategy implements WriteStrategy{
    @Override
    public void writeToFile(String content, String filePath) {
        try (FileOutputStream fos = new FileOutputStream(filePath, true)) {
            System.out.println("Writing:" + content + " to file: " + filePath);
            fos.write(content.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
