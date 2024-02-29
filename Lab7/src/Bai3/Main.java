package Bai3;

public class Main {
    public static void main(String[] args) {
        SinhVienIT svIT = new SinhVienIT("Nguyen Van A", 8.0, 7.5, 8.5);
        SinhVienBiz svBiz = new SinhVienBiz("Tran Thi B", 7.5, 8.0);

        svIT.xuat();
        System.out.println("Điểm TB: " + svIT.getDiem());
        System.out.println("Học lực: " + svIT.getHocLuc());

        svBiz.xuat();
        System.out.println("Điểm TB: " + svBiz.getDiem());
        System.out.println("Học lực: " + svBiz.getHocLuc());
    }
}
