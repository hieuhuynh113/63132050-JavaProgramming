package ntu.MSSV_63132050;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfaceBMI {

    private JFrame frame;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JLabel lblNewLabel_5;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    InterfaceBMI window = new InterfaceBMI();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public InterfaceBMI() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 470, 708);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(Color.GREEN);
        panel.setBounds(0, 0, 458, 80);
        frame.getContentPane().add(panel);
        panel.setLayout(null);

        JLabel lblNewLabel = new JLabel("Body Mass Index");
        lblNewLabel.setBounds(139, 21, 187, 25);
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblNewLabel.setForeground(new Color(255, 0, 0));
        panel.add(lblNewLabel);

        JPanel panel_1 = new JPanel();
        panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
        panel_1.setBackground(new Color(0, 255, 0));
        panel_1.setBounds(0, 90, 458, 280);
        frame.getContentPane().add(panel_1);
        panel_1.setLayout(null);

        JLabel lblNewLabel_1 = new JLabel("Height(m):");
        lblNewLabel_1.setForeground(new Color(255, 0, 0));
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblNewLabel_1.setBounds(48, 24, 107, 27);
        panel_1.add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("Weight(kg):");
        lblNewLabel_2.setForeground(new Color(255, 0, 0));
        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblNewLabel_2.setBounds(48, 74, 107, 27);
        panel_1.add(lblNewLabel_2);

        JLabel lblNewLabel_3 = new JLabel("BMI");
        lblNewLabel_3.setForeground(new Color(255, 0, 0));
        lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblNewLabel_3.setBounds(48, 130, 107, 27);
        panel_1.add(lblNewLabel_3);

        textField = new JTextField();
        textField.setBounds(178, 24, 201, 26);
        panel_1.add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(178, 77, 201, 27);
        panel_1.add(textField_1);

        textField_2 = new JTextField();
        textField_2.setEditable(false); // Make it non-editable
        textField_2.setColumns(10);
        textField_2.setBounds(112, 131, 101, 26);
        panel_1.add(textField_2);

        JButton btnNewButton = new JButton("Exit");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // Exit the application
            }
        });
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
        btnNewButton.setBounds(294, 195, 85, 35);
        panel_1.add(btnNewButton);

        JButton btnClear = new JButton("Clear");
        btnClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(""); // Clear height field
                textField_1.setText(""); // Clear weight field
                textField_2.setText(""); // Clear BMI field
                lblNewLabel_5.setText(""); // Clear BMI description
            }
        });
        btnClear.setFont(new Font("Tahoma", Font.PLAIN, 13));
        btnClear.setBounds(199, 195, 85, 35);
        panel_1.add(btnClear);

        JButton btnCalculate = new JButton("Calculate");
        btnCalculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double height = Double.parseDouble(textField.getText());
                double weight = Double.parseDouble(textField_1.getText());
                double bmi = weight / (height * height);
                textField_2.setText(String.format("%.2f", bmi)); // Display BMI

                // Display BMI description
                if (bmi < 18.5) {
                    lblNewLabel_5.setText("Nhẹ cân");
                    textField_2.setBackground(Color.BLUE);
                } else if (bmi > 18.5 && bmi < 24.9) {
                    lblNewLabel_5.setText("Bình thường");
                    textField_2.setBackground(Color.LIGHT_GRAY);
                } else if (bmi > 24.9 && bmi < 29.9) {
                    lblNewLabel_5.setText("Thừa cân");
                    textField_2.setBackground(Color.YELLOW);
                } else {
                    lblNewLabel_5.setText("Béo phì");
                    textField_2.setBackground(Color.RED);
                }
            }
        });
        btnCalculate.setFont(new Font("Tahoma", Font.PLAIN, 13));
        btnCalculate.setBounds(104, 195, 85, 35);
        panel_1.add(btnCalculate);

        lblNewLabel_5 = new JLabel("");
        lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblNewLabel_5.setBounds(263, 130, 116, 27);
        panel_1.add(lblNewLabel_5);

        JLabel lblNewLabel_4 = new JLabel("");
        lblNewLabel_4.setIcon(new ImageIcon("C:\\Download\\bmi (2) (1).jpg"));
        lblNewLabel_4.setBounds(0, 397, 458, 264);
        frame.getContentPane().add(lblNewLabel_4);
    }
}
