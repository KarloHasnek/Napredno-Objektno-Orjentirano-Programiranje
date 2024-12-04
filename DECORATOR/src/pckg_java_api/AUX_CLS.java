package pckg_java_api;

import java.io.*;

public class AUX_CLS {

    public static void writeTextToFile(String filePath, String text) {
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filePath)))){
            bw.write(text);
            bw.write(System.lineSeparator());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
