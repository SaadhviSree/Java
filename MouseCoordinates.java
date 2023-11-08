package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseCoordinates {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mouse Coordinates Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        final JLabel coordinatesLabel = new JLabel("Mouse Coordinates: ");
        frame.add(coordinatesLabel, BorderLayout.SOUTH);

        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                coordinatesLabel.setText("Mouse Coordinates: X=" + x + ", Y=" + y);
            }
        });

        frame.setVisible(true);
    }
}
