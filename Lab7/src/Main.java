import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double daiCN, rongCN, canhHV;

        // Nhập chiều dài, chiều rộng của hình chữ nhật và cạnh của hình vuông
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều dài của hình chữ nhật: ");
        daiCN = scanner.nextDouble();
        System.out.print("Nhập chiều rộng của hình chữ nhật: ");
        rongCN = scanner.nextDouble();
        System.out.print("Nhập cạnh của hình vuông: ");
        canhHV = scanner.nextDouble();
        scanner.close();

        // Tạo các đối tượng ChuNhat và Vuong
        ChuNhat cn1 = new ChuNhat(daiCN, rongCN);
        Vuong vu1 = new Vuong(canhHV);

        // Gọi phương thức xuat() để xuất thông tin
        System.out.println("Thông tin của hình chữ nhật:");
        cn1.xuat();
        System.out.println("Thông tin của hình vuông:");
        vu1.xuat();
    }
}