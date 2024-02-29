import java.util.ArrayList;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();
        
        // Nhập danh sách số thực từ bàn phím
        System.out.println("Nhập danh sách số thực (Nhập 'N' để kết thúc): ");
        while (true) {
            double x = scanner.nextDouble();
            list.add(x);
            System.out.print("Nhập thêm (Y/N)? ");
            if (scanner.next().equalsIgnoreCase("N")) {
                break;
            }
        }

        // Xuất danh sách và tính tổng
        System.out.println("Danh sách số thực:");
        double sum = 0;
        for (double num : list) {
            System.out.println(num);
            sum += num;
        }
        System.out.println("Tổng của danh sách: " + sum);
    }
}
