public class Main {
    public static void main(String[] args) {
        // Tạo sản phẩm có giảm giá
        SanPham sp1 = new SanPham("Sản phẩm 1", 100, 10);
        
        // Tạo sản phẩm không có giảm giá
        SanPham sp2 = new SanPham("Sản phẩm 2", 200);

        // Xuất thông tin sản phẩm
        sp1.xuat();
        sp2.xuat();

        // Sử dụng getter và setter
        sp1.setDonGia(150); // Cập nhật đơn giá của sản phẩm 1
        System.out.println("Đơn giá của sản phẩm 1 sau khi cập nhật: " + sp1.getDonGia());
    }
}