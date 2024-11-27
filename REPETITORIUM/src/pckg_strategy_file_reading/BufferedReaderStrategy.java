package pckg_strategy_file_reading;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderStrategy implements ReadStrategy{
    @Override
    public void readFromFile(String filePath) {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));){
            String line;
            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
    } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
