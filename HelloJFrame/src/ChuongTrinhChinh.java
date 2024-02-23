import javax.swing.JFrame;
import javax.swing.WindowConstants;
public class ChuongTrinhChinh {
	public static void main (String[] args) {
		JFrame f = new JFrame (); //Tạo một thể hiện (đối tượng) của lớp 
		f.setTitle("Ví dụ JFrame"); //Tiêu đề cửa sổ
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		f.setSize(300, 200); //Cửa sổ kích thước
		f.show(); //Hiện cửa sổ 
	}
}
