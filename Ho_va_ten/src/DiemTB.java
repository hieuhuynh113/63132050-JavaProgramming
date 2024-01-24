import java.util.Scanner;

public class DiemTB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập họ và tên sinh viên: ");
        String hoTen = scanner.nextLine();
        
        System.out.print("Nhập điểm trung bình: ");
        double diemTrungBinh = scanner.nextDouble();
        
        System.out.printf("%s %.2f điểm", hoTen, diemTrungBinh);
    }
}