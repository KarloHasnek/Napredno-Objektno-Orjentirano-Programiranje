package vjezba4.zadatak2.zadatak3;

import vjezba4.zadatak2.CheckingAccount;
import vjezba4.zadatak2.ForeignCurrencyAccount;

import javax.swing.*;

public class TabPanel extends JTabbedPane {
    public TabPanel() {
        addTab("Checking Account", new AccountPanel(new CheckingAccount()));
        addTab("Foreign Currency Account", new AccountPanel(new ForeignCurrencyAccount()));
    }
}