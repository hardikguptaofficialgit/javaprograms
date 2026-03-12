import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegistrationForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Registration Form");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel title = new JLabel("Registration Form");
        title.setBounds(170, 20, 200, 30);
        panel.add(title);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(50, 70, 100, 25);
        panel.add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setBounds(150, 70, 200, 25);
        panel.add(nameField);

        JLabel addressLabel = new JLabel("Address:");
        addressLabel.setBounds(50, 110, 100, 25);
        panel.add(addressLabel);

        JTextArea addressArea = new JTextArea();
        addressArea.setBounds(150, 110, 200, 60);
        panel.add(addressArea);

        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(50, 190, 100, 25);
        panel.add(genderLabel);

        JRadioButton male = new JRadioButton("Male");
        male.setBounds(150, 190, 80, 25);
        JRadioButton female = new JRadioButton("Female");
        female.setBounds(230, 190, 100, 25);

        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);

        panel.add(male);
        panel.add(female);

        JLabel hobbyLabel = new JLabel("Hobbies:");
        hobbyLabel.setBounds(50, 230, 100, 25);
        panel.add(hobbyLabel);

        JCheckBox reading = new JCheckBox("Reading");
        reading.setBounds(150, 230, 100, 25);
        JCheckBox sports = new JCheckBox("Sports");
        sports.setBounds(250, 230, 100, 25);

        panel.add(reading);
        panel.add(sports);

        JButton submit = new JButton("Submit");
        submit.setBounds(180, 280, 100, 30);
        panel.add(submit);

        ImageIcon icon = new ImageIcon("image.jpg"); // place image in project folder
        JLabel imageLabel = new JLabel(icon);
        imageLabel.setBounds(370, 50, 100, 100);
        panel.add(imageLabel);

        frame.add(panel);
        frame.setVisible(true);
        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String address = addressArea.getText();
                String gender = "";

                if (male.isSelected()) {
                    gender = "Male";
                } else if (female.isSelected()) {
                    gender = "Female";
                }

                String hobbies = "";
                if (reading.isSelected()) hobbies += "Reading ";
                if (sports.isSelected()) hobbies += "Sports ";

                JOptionPane.showMessageDialog(frame,
                        "Name: " + name +
                                "\nAddress: " + address +
                                "\nGender: " + gender +
                                "\nHobbies: " + hobbies);
            }
        });
    }
}