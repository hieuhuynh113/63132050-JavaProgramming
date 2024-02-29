import java.util.*;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> arr = new ArrayList<Integer>();
        System.out.print("Nhập số lượng mảng : ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++){
            int arrs = scanner.nextInt();
            arr.add(arrs);
        }
        System.out.print("Mảng in ra : ");
        for (int i = 0; i < n; i++){
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
        Collections.sort(arr);
        System.out.print("Mảng sau khi sắp xếp : ");
        for (int i = 0; i < n; i++){
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
        System.out.println(String.format("Giá trị nhỏ nhất là : %s ",Collections.min(arr)));
        int tong = 0;
        int count = 0;
        for (int x : arr){
            if (x % 3 == 0){
                tong+=x;
                count+=1;
            }
        }
        System.out.println(String.format("Trung bình cộng các số chia hết cho 3 : %s",tong/count));
    }
}