package Bai3;

class SinhVienPoly {
    protected String hoTen;
    protected String nganh;

    public SinhVienPoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    public double getDiem() {
        return 0.0;
    }

    public String getHocLuc() {
        // Phương thức này có thể được triển khai tùy theo yêu cầu
        return "N/A";
    }

    public void xuat() {
        System.out.println("Tên: " + hoTen);
        System.out.println("Ngành: " + nganh);
    }
}
