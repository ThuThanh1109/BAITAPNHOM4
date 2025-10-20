package baitaptuan7;

public abstract class Sach {
    protected String maSach;
    protected String tieuDe;
    protected int namXuatBan;
    protected int soLuong;
    protected double giaCoBan;

    public Sach(String maSach, String tieuDe, int namXuatBan, int soLuong, double giaCoBan) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
        this.giaCoBan = giaCoBan;
    }

    // Phương thức trừu tượng để tính giá bán
    public abstract double tinhGiaBan();

    // Getter, Setter
    public String getMaSach() { return maSach; }
    public String getTieuDe() { return tieuDe; }
    public int getNamXuatBan() { return namXuatBan; }
    public int getSoLuong() { return soLuong; }
    public double getGiaCoBan() { return giaCoBan; }

    public void setSoLuong(int soLuong) { this.soLuong = soLuong; }

    @Override
    public String toString() {
        return String.format("%-8s | %-25s | Năm: %-4d | SL: %-3d | Giá cơ bản: %.0f",
                maSach, tieuDe, namXuatBan, soLuong, giaCoBan);
    }
}
