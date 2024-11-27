package pckg_strategy_file_writing;

import pckg_strategy_file_reading.BufferedReaderStrategy;
import pckg_strategy_file_reading.ReadStrategy;

public class ControllerContent {

    private WriteStrategy writeStrategy;
    private ReadStrategy readStrategy;

    public ControllerContent() {
        this.writeStrategy = new FileWriterStrategy();
        this.readStrategy = new BufferedReaderStrategy();
        System.out.println("Default strategy is FileWriterStrategy");
        System.out.println("Default strategy is BufferedReaderStrategy");
    }

    public void setWriteStrategy(WriteStrategy writeStrategy) {
        this.writeStrategy = writeStrategy;
        System.out.println("Strategy changed to: " + writeStrategy.getClass().getSimpleName());
    }

    public void setReadStrategy(ReadStrategy readStrategy) {
        this.readStrategy = readStrategy;
        System.out.println("Strategy changed to: " + readStrategy.getClass().getSimpleName());
    }

    public void writeToFile(String content, String filePath) {
        if (writeStrategy != null) {
            writeStrategy.writeToFile(content, filePath);
            System.out.println("Content written to file: " + filePath);
        }
    }

    public void readFromFile(String filePath) {
        if (readStrategy != null) {
            readStrategy.readFromFile(filePath);
        }
    }
}
