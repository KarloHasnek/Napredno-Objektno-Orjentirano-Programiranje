package pckg_strategy_file_reading;

import pckg_strategy_file_writing.ControllerContent;

public class TestContentReader {

    public static void main(String[] args) {

        String filePath = "test.txt";
        ControllerContent controllerContent = new ControllerContent();
        controllerContent.readFromFile(filePath);
    }
}
