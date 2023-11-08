package swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickButtonLab {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Display Lab in Text Field");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 100);

        JPanel panel = new JPanel();
        frame.add(panel);

        JTextField textField = new JTextField(15);
        panel.add(textField);

        JButton button = new JButton("Display Lab");
        panel.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("OOPSLab");
            }
        });

        frame.setVisible(true);
    }
}
