package formchuvihinhtron;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class form extends JFrame implements ActionListener {
    private JTextField inputField;
    private JLabel resultLabel;

    public form() {
        setTitle("Tính chu vi hình tròn");
        setSize(400,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JLabel promptLabel = new JLabel("Nhập bán kính:");
        add(promptLabel);

        inputField = new JTextField(10);
        add(inputField);

        JButton calculateButton = new JButton("Tính chu vi");
        calculateButton.addActionListener(this);
        add(calculateButton);

        resultLabel = new JLabel("Chu vi: ");
        add(resultLabel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int radius = Integer.parseInt(inputField.getText());
            double circumference = 2 * Math.PI * radius;
            resultLabel.setText("Chu vi: " + circumference);
        } catch (NumberFormatException ex) {
            resultLabel.setText("Vui lòng nhập số nguyên hợp lệ.");
        }
    }

    public static void main(String[] args) {
        form frame = new form();
        frame.setVisible(true);
    }
}