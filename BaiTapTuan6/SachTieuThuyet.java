package baitaptuan6;
public class SachTieuThuyet extends Sach {
    private String theLoai;
    private boolean laSachSeries;

    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong,
                          String theLoai, boolean laSachSeries) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong); // gọi constructor lớp cha
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }

    @Override
    public String toString() {
        return "Ma sach: " + getMaSach() +
               ", Tieu de: " + getTieuDe() +
               ", Tac gia: " + getTacGia() +
               ", Nam xuat ban " + getNamXuatBan() +
               ", So luong: " + getSoLuong() +
               ", The loai: " + theLoai +
               ", La series: " + (laSachSeries ? "Co" : "Khong");
    }
}

