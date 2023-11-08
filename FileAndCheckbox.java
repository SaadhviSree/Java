package swing;

import java.io.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FileAndCheckbox {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Checkbox Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        JPanel panel = new JPanel();

        // Check if the file exists and is not empty
        try {
            File file = new File("example.txt"); // Replace with your file path
            if (!file.exists() || file.length() == 0) {
                throw new IOException("File does not exist or is empty.");
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        JCheckBox[] checkboxes = new JCheckBox[10];
        for (int i = 0; i < checkboxes.length; i++) {
            checkboxes[i] = new JCheckBox("Checkbox " + (i + 1));
            panel.add(checkboxes[i]);
        }

        // Create a button to display checked checkboxes
        JButton showButton = new JButton("Show Checked Checkboxes");
        panel.add(showButton);

        frame.add(panel);
        frame.setVisible(true);

        showButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder result = new StringBuilder("Checked Checkboxes: ");
                for (int i = 0; i < checkboxes.length; i++) {
                    if (checkboxes[i].isSelected()) {
                        result.append("Checkbox ").append(i + 1).append(", ");
                    }
                }
                JOptionPane.showMessageDialog(frame, result.toString(), "Checked Checkboxes", JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }
}
