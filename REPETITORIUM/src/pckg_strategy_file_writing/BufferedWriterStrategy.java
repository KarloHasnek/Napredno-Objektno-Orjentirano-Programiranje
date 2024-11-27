package pckg_strategy_file_writing;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterStrategy implements WriteStrategy{

    @Override
    public void writeToFile(String content, String filePath) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath, true));) {
            bufferedWriter.write(content);
            bufferedWriter.newLine();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
