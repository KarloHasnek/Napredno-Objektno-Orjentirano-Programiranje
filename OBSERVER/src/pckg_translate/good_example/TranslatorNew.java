package pckg_translate.good_example;

public class TranslatorNew {

    private Translate translator;

    public void setTranslator(Translate translator) {
        this.translator = translator;
    }

    public void translateThisText(String text){
        translator.translate(text);
    }
}
