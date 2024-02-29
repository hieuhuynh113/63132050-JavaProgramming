import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySanPham {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<SanPham> danhSachSanPham = new ArrayList<>();

        // Nhập thông tin cho 5 sản phẩm
        for (int i = 0; i < 5; i++) {
            System.out.println("Nhập thông tin sản phẩm thứ " + (i + 1) + ":");
            System.out.print("Tên sản phẩm: ");
            String tenSp = scanner.nextLine();
            System.out.print("Giá sản phẩm: ");
            double donGia = Double.parseDouble(scanner.nextLine());
            System.out.print("Hãng sản phẩm: ");
            String hang = scanner.nextLine();

            SanPham sp = new SanPham(tenSp, donGia, hang);
            danhSachSanPham.add(sp);
        }

        // Xuất thông tin các sản phẩm có hãng là "Nokia"
        System.out.println("Các sản phẩm có hãng là Nokia:");
        for (SanPham sp : danhSachSanPham) {
            if (sp.hang.equalsIgnoreCase("Nokia")) {
                System.out.println("Tên: " + sp.tenSp + ", Giá: " + sp.donGia + ", Hãng: " + sp.hang);
            }
        }

        scanner.close();
    }
}