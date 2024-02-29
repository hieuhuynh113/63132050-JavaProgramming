class ChuNhat {
    private double rong;
    private double dai;

    // Hàm tạo với 2 tham số
    public ChuNhat(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    // Phương thức tính chu vi
    public double getChuVi() {
        return (dai + rong) * 2;
    }

    // Phương thức tính diện tích
    public double getDienTich() {
        return dai * rong;
    }

    // Phương thức xuất thông tin
    public void xuat() {
        System.out.println("Chiều dài: " + dai);
        System.out.println("Chiều rộng: " + rong);
        System.out.println("Diện tích: " + getDienTich());
        System.out.println("Chu vi: " + getChuVi());
    }
}

