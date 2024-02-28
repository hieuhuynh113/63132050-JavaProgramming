import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManHinhPhuongTrinhBac2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtC;
	private JTextField txtResult;
	public ManHinhPhuongTrinhBac2() {
		setTitle("Phương trình bậc 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 525, 310);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Giải phương trình bậc 2");
		lblNewLabel.setForeground(new Color(0, 0, 153));
		lblNewLabel.setFont(new Font("Nunito", Font.BOLD, 20));
		lblNewLabel.setBounds(159, 10, 238, 40);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nhập giá trị cho phương trình");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(46, 53, 269, 40);
		contentPane.add(lblNewLabel_1);
		
		txtA = new JTextField();
		txtA.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtA.setBounds(46, 96, 96, 19);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel(" x^2 + ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(144, 99, 50, 13);
		contentPane.add(lblNewLabel_2);
		
		txtB = new JTextField();
		txtB.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtB.setBounds(192, 98, 96, 19);
		contentPane.add(txtB);
		txtB.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel(" x + ");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_1.setBounds(287, 101, 50, 13);
		contentPane.add(lblNewLabel_2_1);
		
		txtC = new JTextField();
		txtC.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtC.setColumns(10);
		txtC.setBounds(319, 98, 96, 19);
		contentPane.add(txtC);
		
		JLabel lblNewLabel_2_1_1 = new JLabel(" = 0");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_1_1.setBounds(418, 101, 50, 13);
		contentPane.add(lblNewLabel_2_1_1);
		
		JButton btnGiai = new JButton("GIẢI");
		btnGiai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				handlePT();
			}
		});
		btnGiai.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnGiai.setBounds(222, 141, 109, 51);
		contentPane.add(btnGiai);
		
		JLabel lblNewLabel_3 = new JLabel("Kết quả: ");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(46, 220, 66, 43);
		contentPane.add(lblNewLabel_3);
		
		txtResult = new JTextField();
		txtResult.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtResult.setEditable(false);
		txtResult.setBounds(122, 227, 346, 33);
		contentPane.add(txtResult);
		txtResult.setColumns(10);
	}
	private void handlePT() {
		double a = Double.parseDouble(txtA.getText());
		double b = Double.parseDouble(txtB.getText());
		double c = Double.parseDouble(txtB.getText());
		if (a == 0) {
			if(b == 0) {
				if (c == 0) {
					txtResult.setText("Phương trình vô số nghiệm");
				}
				else txtResult.setText("Phương trình vô nghiệm");
			}
			else {
				double x = (- c) / b;
				txtResult.setText("x = " + x);
			}
		}
		else {
			double delta = Math.pow(b, 2) - 4 * a * c;
			if(delta < 0) {
				txtResult.setText("Phương trình vô nghiệm");
				return;
			}
			if(delta == 0) {
				double x = -b / (2 * a) ;
				txtResult.setText("x = " + x );
				return;
			}
			if(delta > 0) {
				double x1 = (-b + Math.sqrt(delta)) / (2 * a);
				double x2 = (-b - Math.sqrt(delta)) / (2 * a);
				txtResult.setText("x1 = " + x1 + " và x2 = " + x2);
				return;
			}
		}
	}
}