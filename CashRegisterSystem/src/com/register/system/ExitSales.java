package com.register.system;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ExitSales {

    private JFrame frame;

    public void exit() {
        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(
                frame, "Do you want to Exit ? ", "Sales Management",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            System.exit(0);
        }
    }
}
