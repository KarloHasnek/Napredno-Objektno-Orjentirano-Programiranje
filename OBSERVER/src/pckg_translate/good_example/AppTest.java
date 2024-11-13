package pckg_translate.good_example;

public class AppTest {

    public static void main(String[] args) {

        TranslatorNew translator = new TranslatorNew();
        translator.setTranslator(new EnTranslate());
        translator.translateThisText("Some example for English...");
        translator.setTranslator(new FrTranslate());
        translator.translateThisText("Some example for French...");

    }
}
