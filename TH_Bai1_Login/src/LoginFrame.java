import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTenDangNhap;
	private JTextField txtMatKhau;

	public LoginFrame() {
		setTitle("ĐĂNG NHẬP HỆ THỐNG QUẢN LÝ BÁN HÀNG");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 552, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TÊN ĐĂNG NHẬP:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(39, 24, 133, 42);
		contentPane.add(lblNewLabel);
		
		JLabel lblMtKhu = new JLabel("MẬT KHẨU:");
		lblMtKhu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMtKhu.setBounds(39, 92, 133, 42);
		contentPane.add(lblMtKhu);
		
		txtTenDangNhap = new JTextField();
		txtTenDangNhap.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtTenDangNhap.setBounds(182, 24, 280, 42);
		contentPane.add(txtTenDangNhap);
		txtTenDangNhap.setColumns(10);
		
		txtMatKhau = new JTextField();
		txtMatKhau.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtMatKhau.setColumns(10);
		txtMatKhau.setBounds(182, 92, 280, 42);
		contentPane.add(txtMatKhau);
		
		JButton btnDangNhap = new JButton("ĐĂNG NHẬP");
		btnDangNhap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XuLyDangNhap();
			}
		});
		btnDangNhap.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnDangNhap.setBounds(172, 161, 126, 49);
		contentPane.add(btnDangNhap);
	}
	void XuLyDangNhap() {
		//Lấy về tên đang nhập và mật khẩu
		String strTen = txtTenDangNhap.getText();
		String strMK = txtMatKhau.getText();
		if(strTen.equals("63CNTT") && strMK.equals("123")) {
			//Hiện trang chủ
			HomeFrame homePage = new HomeFrame();
			homePage.setVisible(true);
			//Ẩn form đăng nhập
			this.setVisible(false);
		}
		else { //Báo lỗi
			//Xóa dữ liệu đăng nhập
			txtTenDangNhap.setText("");
			txtMatKhau.setText("");
			//Hiện thông báo
			JOptionPane hopThoai = new JOptionPane();
			hopThoai.showMessageDialog(this, "Đăng nhập thất bại");
		}
	}
}
