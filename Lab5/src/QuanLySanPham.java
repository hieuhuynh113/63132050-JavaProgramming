import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class QuanLySanPham {
    static Scanner scanner = new Scanner(System.in);
    static List<SanPham> danhSachSanPham = new ArrayList<>();

    public static void main(String[] args) {
        menu();
    }

    static void menu() {
        while (true) {
            System.out.println("MENU:");
            System.out.println("1. Nhập danh sách sản phẩm từ bàn phím");
            System.out.println("2. Sắp xếp giảm dần theo giá và xuất ra màn hình");
            System.out.println("3. Tìm và xóa sản phẩm theo tên nhập từ bàn phím");
            System.out.println("4. Xuất giá trung bình của các sản phẩm");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Đọc kí tự Enter

            switch (choice) {
                case 1:
                    nhap();
                    break;
                case 2:
                    sapxep();
                    break;
                case 3:
                    xoa();
                    break;
                case 4:
                    xuatGiaTrungBinh();
                    break;
                case 0:
                    System.out.println("Đã thoát chương trình.");
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }

    static void nhap() {
        System.out.print("Nhập số lượng sản phẩm: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Đọc kí tự Enter

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập tên sản phẩm " + (i + 1) + ": ");
            String ten = scanner.nextLine();
            System.out.print("Nhập giá sản phẩm " + (i + 1) + ": ");
            double gia = scanner.nextDouble();
            scanner.nextLine(); // Đọc kí tự Enter

            SanPham sp = new SanPham(ten, gia);
            danhSachSanPham.add(sp);
        }
    }

    static void xuat() {
        System.out.println("Danh sách sản phẩm:");
        for (SanPham sp : danhSachSanPham) {
            System.out.println("Tên: " + sp.ten + ", Giá: " + sp.donGia);
        }
    }

    static void sapxep() {
        Comparator<SanPham> comp = new Comparator<SanPham>() {
            @Override
            public int compare(SanPham o1, SanPham o2) {
                return o2.donGia.compareTo(o1.donGia);
            }
        };
        Collections.sort(danhSachSanPham, comp);
        xuat();
    }

    static void xoa() {
        System.out.print("Nhập tên sản phẩm cần xóa: ");
        String tenCanXoa = scanner.nextLine();

        Iterator<SanPham> iterator = danhSachSanPham.iterator();
        while (iterator.hasNext()) {
            SanPham sp = iterator.next();
            if (sp.ten.equals(tenCanXoa)) {
                iterator.remove();
                System.out.println("Đã xóa sản phẩm " + sp.ten);
            }
        }
    }

    static void xuatGiaTrungBinh() {
        if (danhSachSanPham.isEmpty()) {
            System.out.println("Danh sách sản phẩm rỗng.");
            return;
        }

        double tongGia = 0;
        for (SanPham sp : danhSachSanPham) {
            tongGia += sp.donGia;
        }
        double giaTrungBinh = tongGia / danhSachSanPham.size();
        System.out.println("Giá trung bình của các sản phẩm là: " + giaTrungBinh);
    }
}