package vjezba6.zadatak1;

import java.io.File;
import java.util.List;

public class BatchProcessor {

    public void processBatch(File file) {
        String nme = file.getName();
        String ext = getFileExtension(nme);
        FileParser parser = null;
        switch(ext) {
            case "txt": parser = new TextFileParser(); break;
            case "csv": parser = new CSVFileParser(); break;
            case "json": parser = new JSONFileParser(); break;
            default: System.out.println("There is no parser for that file type...");
        }
        List<Record> records = parser.parse(file);
        processRecords(records);
        writeSummary();
        closeFile(file);
    }

    private String getFileExtension(String file) {
        if(file.contains(".")) {
            String ext = file.substring(file.lastIndexOf(".") + 1);
            return ext;
        } else {
            return null;
        }
    }

    private void processRecords(List<Record> records) {
        System.out.println("Processing all records...");
    }

    private void writeSummary() {
        System.out.println("Writing summary related to parsing process ...");
    }

    private void closeFile(File file) {
        System.out.println("Closed file -> " + file.toString());
    }
}
