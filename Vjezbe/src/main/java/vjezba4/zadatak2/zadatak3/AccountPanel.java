package vjezba4.zadatak2.zadatak3;

import vjezba4.zadatak2.Account;
import vjezba4.zadatak2.DepositMoney;
import vjezba4.zadatak2.WithdrawMoney;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AccountPanel extends JPanel {
    private Account account;

    public AccountPanel(Account account) {
        this.account = account;
        setLayout(new GridLayout(2, 2));
        add(new JLabel("Amount:"));
        JTextField amountField = new JTextField();
        add(amountField);
        JButton depositButton = new JButton("Deposit");
        depositButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double amount = Double.parseDouble(amountField.getText());
                DesktopApp invoker = (DesktopApp) SwingUtilities.getWindowAncestor(AccountPanel.this);
                invoker.executeCommand(new DepositMoney(account, amount));
            }
        });
        add(depositButton);
        JButton withdrawButton = new JButton("Withdraw");
        withdrawButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double amount = Double.parseDouble(amountField.getText());
                DesktopApp invoker = (DesktopApp) SwingUtilities.getWindowAncestor(AccountPanel.this);
                invoker.executeCommand(new WithdrawMoney(account, amount));
            }
        });
        add(withdrawButton);
    }
}