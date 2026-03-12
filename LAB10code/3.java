import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ListColorChanger {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Color Changer");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        String colors[] = {"Red", "Green", "Blue", "Yellow"};
        JList<String> list = new JList<>(colors);
        list.setBounds(30, 30, 100, 80);
        panel.add(list);

        JButton button = new JButton("Change Color");
        button.setBounds(150, 50, 150, 30);
        panel.add(button);

        button.addActionListener(e -> {
            String selected = list.getSelectedValue();
            if (selected != null) {
                switch (selected) {
                    case "Red": panel.setBackground(Color.RED); break;
                    case "Green": panel.setBackground(Color.GREEN); break;
                    case "Blue": panel.setBackground(Color.BLUE); break;
                    case "Yellow": panel.setBackground(Color.YELLOW); break;
                }
            }
        });

        frame.add(panel);
        frame.setVisible(true);
    }
}