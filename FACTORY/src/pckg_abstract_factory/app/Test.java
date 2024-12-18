package pckg_abstract_factory.app;

import pckg_abstract_factory.factory.MACFactory;
import pckg_abstract_factory.factory.WINFactory;

public class Test {

    public static void main(String[] args) {
        Application testApp = new Application(new WINFactory());
        testApp.performSomethingForUser();

        Application testApp2 = new Application(new MACFactory());
        testApp2.performSomethingForUser();
    }
}
