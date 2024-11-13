package pckg_translate.bad_example;

public class Translator {

    private int choice;
    private final EnglishTranslator englishTranslator;
    private final FrenchTranslator frenchTranslator;

    public Translator() {
        System.out.println("Croatian to English and Croatian to French translator");
        englishTranslator = new EnglishTranslator();
        frenchTranslator = new FrenchTranslator();
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }

    public void translate(String text) {
        switch (choice) {
            case 1:
                englishTranslator.translateText(text);
                break;
            case 2:
                frenchTranslator.translate(text);
                break;
            default:
                System.out.println("Invalid choice! Expected argument 1 or 2.\nExiting...");
        }
    }
}
