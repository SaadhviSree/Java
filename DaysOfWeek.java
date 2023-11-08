package swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DaysOfWeek {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Day Selection App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();
        frame.add(panel);

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        JList<String> dayList = new JList<>(days);
        dayList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        JTextArea selectedDaysText = new JTextArea(5, 20);
        selectedDaysText.setEditable(false);

        JButton showSelectedButton = new JButton("Show Selected Days");

        showSelectedButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] selectedDays = dayList.getSelectedValuesList().toArray(new String[0]);
                String selectedDaysTextString = "Selected Days: ";
                for (String day : selectedDays) {
                    selectedDaysTextString += day + " ";
                }
                selectedDaysText.setText(selectedDaysTextString);
            }
        });

        panel.add(new JScrollPane(dayList));
        panel.add(showSelectedButton);
        panel.add(selectedDaysText);

        frame.setVisible(true);
    }
}

