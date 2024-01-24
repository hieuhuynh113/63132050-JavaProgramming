import java.util.Scanner;

public class MenuApplication {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("+---------------------------------------------------+");
            System.out.println("1. Giải phương trình bậc nhất");
            System.out.println("2. Giải phương trình bậc 2");
            System.out.println("3. Tính tiền điện");
            System.out.println("4. Kết thúc");
            System.out.println("+---------------------------------------------------+");
            System.out.print("Chọn chức năng: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    giaiPTB1();
                    break;
                case 2:
                    giaiPTB2();
                    break;
                case 3:
                    tinhTienDien();
                    break;
                case 4:
                    System.out.println("Ứng dụng đã kết thúc.");
                    return;
                default:
                    System.out.println("Chức năng không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }

    public static void giaiPTB1() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Giải phương trình bậc nhất.");
        // Thêm mã giải phương trình bậc nhất ở đây

        System.out.println("------------------------------------------");
    }

    public static void giaiPTB2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Giải phương trình bậc hai.");
        // Thêm mã giải phương trình bậc hai ở đây

        System.out.println("------------------------------------------");
    }

    public static void tinhTienDien() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tính tiền điện.");
        // Thêm mã tính tiền điện ở đây

        System.out.println("------------------------------------------");
    }
}