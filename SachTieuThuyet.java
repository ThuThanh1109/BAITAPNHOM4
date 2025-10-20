package baitaptuan7;

public class SachTieuThuyet extends Sach implements IKiemKe {
    private String tacGia;
    private boolean laSeries;
    private String viTri;

    public SachTieuThuyet(String maSach, String tieuDe, int namXuatBan, int soLuong,
                          double giaCoBan, String tacGia, boolean laSeries) {
        super(maSach, tieuDe, namXuatBan, soLuong, giaCoBan);
        this.tacGia = tacGia;
        this.laSeries = laSeries;
        this.viTri = "Chưa xác định";
    }

    @Override
    public double tinhGiaBan() {
        // Nếu là series => lời 20%, ngược lại 10%
        return laSeries ? giaCoBan * 1.2 : giaCoBan * 1.1;
    }

    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return soLuong >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        this.viTri = viTriMoi;
        System.out.println("→ Vị trí mới của tiểu thuyết '" + tieuDe + "': " + viTri);
    }

    @Override
    public String toString() {
        return "[Tiểu Thuyết] " + super.toString() +
               String.format(" | Tác giả: %-15s | Series: %-5s | Giá bán: %.0f",
                             tacGia, laSeries ? "Có" : "Không", tinhGiaBan());
    }
}
