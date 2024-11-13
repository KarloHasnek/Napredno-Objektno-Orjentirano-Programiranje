package pckg_translate.good_example;

public class EnTranslate implements Translate{
    @Override
    public void translate(String text) {
        System.out.println(getClass().getSimpleName() + " performing translation...");
        System.out.println("Translating this:\n" + text + "\nto English...");
    }
}
