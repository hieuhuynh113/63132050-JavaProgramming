import java.util.Scanner;
import java.util.regex.*;

public class QuanLySinhVien {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        SinhVien[] danhSachSinhVien = new SinhVien[5];

        System.out.println("Nhập thông tin 5 sinh viên:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ":");
            danhSachSinhVien[i] = nhapSinhVien();
        }

        System.out.println("Thông tin các sinh viên có trong danh sách:");
        for (SinhVien sv : danhSachSinhVien) {
            System.out.println("Họ tên: " + sv.hoTen);
            System.out.println("Email: " + sv.email);
            System.out.println("Số điện thoại: " + sv.soDienThoai);
            System.out.println("CMND: " + sv.cmnd);
            System.out.println();
        }
    }

    static SinhVien nhapSinhVien() {
        String hoTen;
        String email;
        String soDienThoai;
        String cmnd;

        System.out.print("Nhập họ tên: ");
        hoTen = scanner.nextLine();

        do {
            System.out.print("Nhập email: ");
            email = scanner.nextLine();
            if (!kiemTraEmail(email)) {
                System.out.println("Email không hợp lệ! Vui lòng nhập lại.");
            }
        } while (!kiemTraEmail(email));

        do {
            System.out.print("Nhập số điện thoại: ");
            soDienThoai = scanner.nextLine();
            if (!kiemTraSoDienThoai(soDienThoai)) {
                System.out.println("Số điện thoại không hợp lệ! Vui lòng nhập lại.");
            }
        } while (!kiemTraSoDienThoai(soDienThoai));

        do {
            System.out.print("Nhập CMND: ");
            cmnd = scanner.nextLine();
            if (!kiemTraCMND(cmnd)) {
                System.out.println("CMND không hợp lệ! Vui lòng nhập lại.");
            }
        } while (!kiemTraCMND(cmnd));

        return new SinhVien(hoTen, email, soDienThoai, cmnd);
    }

    static boolean kiemTraEmail(String email) {
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    static boolean kiemTraSoDienThoai(String soDienThoai) {
        String regex = "^\\d{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(soDienThoai);
        return matcher.matches();
    }

    static boolean kiemTraCMND(String cmnd) {
        String regex = "^\\d{9}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(cmnd);
        return matcher.matches();
    }
}