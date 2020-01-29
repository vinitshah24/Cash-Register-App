package com.register.system;

import java.awt.event.KeyEvent;

public class SalesTax {

    public double taxRate = .80;

    public double stax(double amount) {
        double tax = amount - (amount * taxRate);
        return tax;
    }

    // Preventing the user from entering character
    public void checkInput(KeyEvent e) {
        char input = e.getKeyChar();

        // If input is not a digit, back space or delete
        if (!Character.isDigit(input)
                || input == KeyEvent.VK_BACK_SPACE
                || input == KeyEvent.VK_DELETE) {
            e.consume(); // This will block it
        }
    }
}
