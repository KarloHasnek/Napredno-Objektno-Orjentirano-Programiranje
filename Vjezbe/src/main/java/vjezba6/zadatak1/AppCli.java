package vjezba6.zadatak1;

import java.io.File;

public class AppCli {

    public static void main(String[] args) {

        File file = new File("C://Documents/fileName.txt");
        File fle = new File("tableData.csv");
        BatchProcessor bp = new BatchProcessor();
        bp.processBatch(file);
        bp.processBatch(fle);
    }

}