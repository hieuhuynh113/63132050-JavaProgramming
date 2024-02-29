import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai4 {
    public static String checkHocLuc(float diem){
        String hocLuc;
        if (diem < 5 && diem > 0){
            hocLuc = "Yếu";
        }else if (diem >= 5 && diem < 6.5){
            hocLuc = "Trung bình";
        }else if(diem >= 6.5 && diem < 7.5){
            hocLuc = "Khá";
        }
        else if (diem >= 7.5 && diem < 9){
            hocLuc = "Giỏi";

        }else if(diem >= 9 && diem <=10) {
            hocLuc = "Xuất sắc";
        }else {
            hocLuc = "Nhập sai giá trị";
        }
        return hocLuc;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng sinh viên : ");
        int n = scanner.nextInt();
        List<String> arrHoTen = new ArrayList<String>();
        List<Float> arrDiem = new ArrayList<Float>();
        for (int i = 0; i < n; i++){
            System.out.print("Nhập tên sinh viên : ");
            String ten = scanner.next();
            System.out.print("Nhập điểm : ");
            float diem = scanner.nextFloat();
            arrHoTen.add(ten);
            arrDiem.add(diem);
        }
        for (int i = 0; i < n; i++){
            System.out.println(String.format("Tên sinh viên : %s | Điểm : %.1f | Học lực : %s",arrHoTen.get(i),arrDiem.get(i),checkHocLuc(arrDiem.get(i))));
        }



    }
}