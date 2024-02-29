// Xây dựng lớp Vuong kế thừa từ lớp ChuNhat và ghi đè phương thức xuat()
// để xuất thông tin cạnh, diện tích và chu vi của hình vuông.
class Vuong extends ChuNhat {
    // Hàm tạo với 1 tham số
    public Vuong(double canh) {
        // Gọi lại hàm tạo của lớp Cha và truyền cạnh của hình vuông cho 2 tham số chiều dài và chiều rộng
        super(canh, canh);
    }

    // Ghi đè phương thức xuất để xuất thông tin của hình vuông
    @Override
    public void xuat() {
        
        System.out.println("Diện tích: " + getDienTich()); // Gọi phương thức getDienTich() của lớp Cha
        System.out.println("Chu vi: " + getChuVi()); // Gọi phương thức getChuVi() của lớp Cha
    }
}