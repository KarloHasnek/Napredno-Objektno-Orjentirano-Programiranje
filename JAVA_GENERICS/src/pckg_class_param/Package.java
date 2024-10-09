package pckg_class_param;

import java.util.ArrayList;

public class Package <T> {

//    final referenca, ali da je primitivan tip podatka onda final oznacava finalnu vrijednost.
//    ako je lista final onda mozemo mijenjati njen sadrzaj, ali ne i settati novu listu.
    private final ArrayList<T> pckgContent;
    private Class<T> classType;

    public Package(Class<T> type) {
        this.classType = type;
        this.pckgContent = new ArrayList<>();
        System.out.println("Created package: " + classType);
    }

//    public void setPckgContent(ArrayList<T> newContent) {
//        this.pckgContent = newContent;
//    }

    public void addNewContentToPckg(T newContent) {
        if (pckgContent.contains(newContent)) {
            System.out.println("content already exists.");
        } else if (newContent.getClass().equals(classType)) {
            pckgContent.add(newContent);
            System.out.println("Content" + newContent + " added to package.");
        } else {
            System.out.println("Invalid content type.");
        }
    }

    public void listPackageContent() {
        if (pckgContent.isEmpty()) {
            System.out.println("Package is empty.");
        } else {
            for (T el: pckgContent) {
                System.out.println(el);
            }
        }
    }
}
