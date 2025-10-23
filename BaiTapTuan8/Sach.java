package BaiTapTuan8;

public abstract class Sach implements IGiaBan, IKiemKe {
    protected String maSach;
    protected String tieuDe;
    protected String tacGia;
    protected int namXuatBan;
    protected int soLuong;
    protected double giaCoBan;

    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
        this.giaCoBan = giaCoBan;
    }

    // Getters & Setters
    public String getMaSach() { return maSach; }
    public String getTieuDe() { return tieuDe; }
    public String getTacGia() { return tacGia; }
    public int getNamXuatBan() { return namXuatBan; }
    public int getSoLuong() { return soLuong; }
    public double getGiaCoBan() { return giaCoBan; }

    public void setSoLuong(int soLuong) { this.soLuong = soLuong; }
    public void setGiaCoBan(double giaCoBan) { this.giaCoBan = giaCoBan; }

    // Abstract methods to override
    @Override
    public abstract double tinhGiaBan();

    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return this.soLuong >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        System.out.println("Đã chuyển sách \"" + tieuDe + "\" đến khu vực: " + viTriMoi);
    }

    @Override
    public String toString() {
        return "Mã: " + maSach + ", Tiêu đề: " + tieuDe + ", Tác giả: " + tacGia +
               ", Năm XB: " + namXuatBan + ", SL: " + soLuong + ", Giá cơ bản: " + giaCoBan;
    }
}
