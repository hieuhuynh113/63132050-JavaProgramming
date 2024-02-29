import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập họ và tên: ");
        String hoTen = scanner.nextLine();

        // Tách họ
        int indexSpace = hoTen.indexOf(' ');
        String ho = hoTen.substring(0, indexSpace).toUpperCase();

        // Tách tên
        int lastIndexSpace = hoTen.lastIndexOf(' ');
        String ten = hoTen.substring(lastIndexSpace + 1).toUpperCase();

        // Tách tên đệm
        String tenDem = hoTen.substring(indexSpace + 1, lastIndexSpace);

        System.out.println("Họ: " + ho);
        System.out.println("Tên đệm: " + tenDem);
        System.out.println("Tên: " + ten);

        scanner.close();
    }
}
