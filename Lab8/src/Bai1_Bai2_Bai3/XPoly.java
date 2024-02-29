package Bai1_Bai2_Bai3;

public final class XPoly {
    // Phương thức tĩnh để tính tổng các tham số truyền vào
    public static final double sum(double... x) {
        double total = 0.0;
        for (double num : x) {
            total += num;
        }
        return total;
    }
    
 // Phương thức tĩnh để tìm số nhỏ nhất từ tham số biến đổi
    public static final double min(double... x) {
        if (x.length == 0) {
            throw new IllegalArgumentException("Không có phần tử nào trong mảng.");
        }
        double min = x[0];
        for (int i = 1; i < x.length; i++) {
            if (x[i] < min) {
                min = x[i];
            }
        }
        return min;
    }

    // Phương thức tĩnh để tìm số lớn nhất từ tham số biến đổi
    public static final double max(double... x) {
        if (x.length == 0) {
            throw new IllegalArgumentException("Không có phần tử nào trong mảng.");
        }
        double max = x[0];
        for (int i = 1; i < x.length; i++) {
            if (x[i] > max) {
                max = x[i];
            }
        }
        return max;
    }
    
 // Phương thức tĩnh để chuyển đổi các ký tự đầu tiên của mỗi từ sang ký tự hoa
    public static final String toUpperFirstChar(String s) {
        String[] words = s.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (!words[i].isEmpty()) { // Kiểm tra nếu từ không rỗng
                char firstChar = words[i].charAt(0);
                String upperFirstChar = String.valueOf(firstChar).toUpperCase();
                words[i] = upperFirstChar + words[i].substring(1);
            }
        }

        return String.join(" ", words);
    }

    // Đoạn mã thử nghiệm
    public static void main(String[] args) {
        // Tính tổng các số
        double total = XPoly.sum(1.5, 2.3, 4.7);
        System.out.println("Tổng của 1.5, 2.3 và 4.7 là: " + total);

        // Tìm số nhỏ nhất
        double minNumber = XPoly.min(2.5, 3.1, 5.9, 6.2);
        System.out.println("Số nhỏ nhất trong 2.5, 3.1, 5.9 và 6.2 là: " + minNumber);

        // Tìm số lớn nhất
        double maxNumber = XPoly.max(2.5, 3.1, 5.9, 6.2);
        System.out.println("Số lớn nhất trong 2.5, 3.1, 5.9 và 6.2 là: " + maxNumber);

        // Chuyển đổi các ký tự đầu tiên của mỗi từ sang ký tự hoa
        String convertedString = XPoly.toUpperFirstChar("nguyen van teo");
        System.out.println("Chuỗi sau khi chuyển đổi: " + convertedString);
    }
}
