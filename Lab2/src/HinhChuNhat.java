import java.util.Scanner;

public class HinhChuNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập chiều dài của hình chữ nhật: ");
        double dai = scanner.nextDouble();
        
        System.out.print("Nhập chiều rộng của hình chữ nhật: ");
        double rong = scanner.nextDouble();
        
        double chuVi = (dai + rong) * 2;
        double dienTich = dai * rong;
        double canhNhoNhat = Math.min(dai, rong);
        
        System.out.println("Chu vi của hình chữ nhật: " + chuVi);
        System.out.println("Diện tích của hình chữ nhật: " + dienTich);
        System.out.println("Cạnh nhỏ nhất của hình chữ nhật: " + canhNhoNhat);
    }
}