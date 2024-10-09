package pckg_class_param;

public class MainTest {

    public static void main(String[] args) {
        Package<String> stringPackage = new Package<>(String.class);
        stringPackage.addNewContentToPckg("String1");
        stringPackage.addNewContentToPckg("String2");
        stringPackage.addNewContentToPckg("String2");
        stringPackage.listPackageContent();
    }
}
