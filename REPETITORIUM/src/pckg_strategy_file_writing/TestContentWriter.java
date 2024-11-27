package pckg_strategy_file_writing;

public class TestContentWriter {

    public static void main(String[] args) {
        ControllerContent controllerContent = new ControllerContent();
        String content = "This is a test content!\nTest line 2";
        String additionalContent = "This is an additional content!\nAdditional line 2";
        String filePath = "test.txt";
        controllerContent.writeToFile(content, filePath);
        controllerContent.setWriteStrategy(new BufferedWriterStrategy());
        controllerContent.writeToFile(additionalContent, filePath);
    }
}
