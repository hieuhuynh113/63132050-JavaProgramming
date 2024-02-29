import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Nhập danh sách họ và tên");
            System.out.println("2. Xuất danh sách vừa nhập");
            System.out.println("3. Xuất danh sách ngẫu nhiên");
            System.out.println("4. Sắp xếp giảm dần và xuất danh sách");
            System.out.println("5. Tìm và xóa họ tên nhập từ bàn phím");
            System.out.println("6. Kết thúc");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline left-over

            switch (choice) {
                case 1:
                    System.out.print("Nhập họ và tên: ");
                    names.add(scanner.nextLine());
                    break;
                case 2:
                    System.out.println(names);
                    break;
                case 3:
                    Collections.shuffle(names);
                    System.out.println(names);
                    break;
                case 4:
                    Collections.sort(names, Collections.reverseOrder());
                    System.out.println(names);
                    break;
                case 5:
                    System.out.print("Nhập họ và tên cần xóa: ");
                    String name = scanner.nextLine();
                    if (names.remove(name)) {
                        System.out.println(name + " đã được xóa.");
                    } else {
                        System.out.println(name + " không tồn tại trong danh sách.");
                    }
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        } while (choice != 6);
        scanner.close();
    }
}
