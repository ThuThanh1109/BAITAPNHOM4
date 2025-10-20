package baitaptuan7;

public class SachGiaoTrinh extends Sach implements IKiemKe {
    private String monHoc;
    private String viTri;

    public SachGiaoTrinh(String maSach, String tieuDe, int namXuatBan, int soLuong, double giaCoBan, String monHoc) {
        super(maSach, tieuDe, namXuatBan, soLuong, giaCoBan);
        this.monHoc = monHoc;
        this.viTri = "Chưa xác định";
    }

    @Override
    public double tinhGiaBan() {
        // Giá bán = giá cơ bản * 1.05 (5% lời)
        return giaCoBan * 1.05;
    }

    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return soLuong >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        this.viTri = viTriMoi;
        System.out.println("→ Vị trí mới của " + tieuDe + ": " + viTri);
    }

    @Override
    public String toString() {
        return "[Giáo Trình] " + super.toString() +
               String.format(" | Môn: %-15s | Giá bán: %.0f", monHoc, tinhGiaBan());
    }
}
