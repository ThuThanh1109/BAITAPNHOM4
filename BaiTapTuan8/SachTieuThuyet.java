package BaiTapTuan8;

public class SachTieuThuyet extends Sach {
    private String theLoai;

    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan, String theLoai) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.theLoai = theLoai;
    }

    @Override
    public double tinhGiaBan() {
        return giaCoBan * 1.2; // ví dụ: 20% lợi nhuận
    }

    @Override
    public String toString() {
        return super.toString() + ", Thể loại: " + theLoai + ", Giá bán: " + tinhGiaBan();
    }
}
