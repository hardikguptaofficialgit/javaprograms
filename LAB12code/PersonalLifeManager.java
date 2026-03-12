import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class PersonalLifeManager extends JFrame {

    CardLayout cardLayout;
    JPanel mainPanel;

    public PersonalLifeManager() {
        setTitle("Personal Life Manager - Productivity Dashboard");
        setSize(900,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        mainPanel.add(createDashboard(), "Dashboard");
        mainPanel.add(createTaskManager(), "Tasks");
        mainPanel.add(createHabitTracker(), "Habits");
        mainPanel.add(createExpenseTracker(), "Expenses");
        mainPanel.add(createMoodTracker(), "Mood");
        mainPanel.add(createQuoteGenerator(), "Quotes");

        add(mainPanel);
        setVisible(true);
    }

    JPanel createDashboard() {
        JPanel panel = new JPanel(new GridLayout(3,2,20,20));
        panel.setBorder(BorderFactory.createEmptyBorder(50,50,50,50));

        JButton taskBtn = new JButton("Task Manager");
        JButton habitBtn = new JButton("Habit Tracker");
        JButton expenseBtn = new JButton("Expense Tracker");
        JButton moodBtn = new JButton("Mood Tracker");
        JButton quoteBtn = new JButton("Quote Generator");

        taskBtn.addActionListener(e -> cardLayout.show(mainPanel,"Tasks"));
        habitBtn.addActionListener(e -> cardLayout.show(mainPanel,"Habits"));
        expenseBtn.addActionListener(e -> cardLayout.show(mainPanel,"Expenses"));
        moodBtn.addActionListener(e -> cardLayout.show(mainPanel,"Mood"));
        quoteBtn.addActionListener(e -> cardLayout.show(mainPanel,"Quotes"));

        panel.add(taskBtn);
        panel.add(habitBtn);
        panel.add(expenseBtn);
        panel.add(moodBtn);
        panel.add(quoteBtn);

        return panel;
    }

    JPanel createTaskManager() {
        JPanel panel = new JPanel(new BorderLayout());

        DefaultListModel<String> model = new DefaultListModel<>();
        JList<String> taskList = new JList<>(model);

        JTextField taskField = new JTextField();

        JButton addBtn = new JButton("Add Task");
        JButton completeBtn = new JButton("Mark Completed");
        JButton deleteBtn = new JButton("Delete Task");
        JButton backBtn = new JButton("Back");

        JPanel top = new JPanel(new BorderLayout());
        top.add(taskField,BorderLayout.CENTER);
        top.add(addBtn,BorderLayout.EAST);

        JPanel bottom = new JPanel();
        bottom.add(completeBtn);
        bottom.add(deleteBtn);
        bottom.add(backBtn);

        addBtn.addActionListener(e -> {
            if(!taskField.getText().isEmpty()) {
                model.addElement(taskField.getText());
                taskField.setText("");
            }
        });

        completeBtn.addActionListener(e -> {
            int index = taskList.getSelectedIndex();
            if(index!=-1) {
                String task = model.get(index);
                model.set(index,"✔ " + task);
            }
        });

        deleteBtn.addActionListener(e -> {
            int index = taskList.getSelectedIndex();
            if(index!=-1) model.remove(index);
        });

        backBtn.addActionListener(e -> cardLayout.show(mainPanel,"Dashboard"));

        panel.add(top,BorderLayout.NORTH);
        panel.add(new JScrollPane(taskList),BorderLayout.CENTER);
        panel.add(bottom,BorderLayout.SOUTH);

        return panel;
    }

    JPanel createHabitTracker() {
        JPanel panel = new JPanel(new BorderLayout());

        String[] habits = {"Exercise","Reading","Meditation","Study"};
        JCheckBox[] boxes = new JCheckBox[habits.length];

        JPanel center = new JPanel(new GridLayout(4,1));
        for(int i=0;i<habits.length;i++){
            boxes[i] = new JCheckBox(habits[i]);
            center.add(boxes[i]);
        }

        JLabel status = new JLabel("Completion Status: 0/4");

        JButton update = new JButton("Update Status");
        JButton back = new JButton("Back");

        update.addActionListener(e -> {
            int count = 0;
            for(JCheckBox b : boxes)
                if(b.isSelected()) count++;
            status.setText("Completion Status: "+count+"/4");
        });

        back.addActionListener(e -> cardLayout.show(mainPanel,"Dashboard"));

        JPanel bottom = new JPanel();
        bottom.add(update);
        bottom.add(back);

        panel.add(center,BorderLayout.CENTER);
        panel.add(status,BorderLayout.NORTH);
        panel.add(bottom,BorderLayout.SOUTH);

        return panel;
    }

    JPanel createExpenseTracker() {
        JPanel panel = new JPanel(new BorderLayout());

        String[] columns = {"Amount","Category"};
        DefaultTableModel model = new DefaultTableModel(columns,0);
        JTable table = new JTable(model);

        JTextField amountField = new JTextField(10);
        String[] categories = {"Food","Transport","Shopping","Other"};
        JComboBox<String> categoryBox = new JComboBox<>(categories);

        JLabel totalLabel = new JLabel("Total: 0");

        JButton addBtn = new JButton("Add Expense");
        JButton backBtn = new JButton("Back");

        addBtn.addActionListener(e -> {
            try {
                double amount = Double.parseDouble(amountField.getText());
                String category = (String)categoryBox.getSelectedItem();
                model.addRow(new Object[]{amount,category});

                double total = 0;
                for(int i=0;i<model.getRowCount();i++)
                    total += (double)model.getValueAt(i,0);

                totalLabel.setText("Total: " + total);
                amountField.setText("");
            } catch(Exception ex) {}
        });

        backBtn.addActionListener(e -> cardLayout.show(mainPanel,"Dashboard"));

        JPanel top = new JPanel();
        top.add(new JLabel("Amount"));
        top.add(amountField);
        top.add(categoryBox);
        top.add(addBtn);

        JPanel bottom = new JPanel();
        bottom.add(totalLabel);
        bottom.add(backBtn);

        panel.add(top,BorderLayout.NORTH);
        panel.add(new JScrollPane(table),BorderLayout.CENTER);
        panel.add(bottom,BorderLayout.SOUTH);

        return panel;
    }

    JPanel createMoodTracker() {
        JPanel panel = new JPanel(new BorderLayout());

        DefaultListModel<String> model = new DefaultListModel<>();
        JList<String> moodList = new JList<>(model);

        JButton happy = new JButton("😀 Happy");
        JButton neutral = new JButton("😐 Neutral");
        JButton sad = new JButton("😔 Sad");
        JButton back = new JButton("Back");

        happy.addActionListener(e -> model.addElement("Happy"));
        neutral.addActionListener(e -> model.addElement("Neutral"));
        sad.addActionListener(e -> model.addElement("Sad"));

        back.addActionListener(e -> cardLayout.show(mainPanel,"Dashboard"));

        JPanel top = new JPanel();
        top.add(happy);
        top.add(neutral);
        top.add(sad);

        panel.add(top,BorderLayout.NORTH);
        panel.add(new JScrollPane(moodList),BorderLayout.CENTER);
        panel.add(back,BorderLayout.SOUTH);

        return panel;
    }

    JPanel createQuoteGenerator() {
        JPanel panel = new JPanel(new BorderLayout());

        String[] quotes = {
                "Stay consistent.",
                "Small steps every day.",
                "Discipline beats motivation.",
                "Focus on progress.",
                "Work hard in silence."
        };

        JLabel quoteLabel = new JLabel("Click button for a quote",SwingConstants.CENTER);

        JButton generate = new JButton("Generate Quote");
        JButton back = new JButton("Back");

        Random random = new Random();

        generate.addActionListener(e -> {
            int index = random.nextInt(quotes.length);
            quoteLabel.setText(quotes[index]);
        });

        back.addActionListener(e -> cardLayout.show(mainPanel,"Dashboard"));

        JPanel bottom = new JPanel();
        bottom.add(generate);
        bottom.add(back);

        panel.add(quoteLabel,BorderLayout.CENTER);
        panel.add(bottom,BorderLayout.SOUTH);

        return panel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(PersonalLifeManager::new);
    }
}