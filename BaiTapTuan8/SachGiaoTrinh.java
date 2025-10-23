package BaiTapTuan8;

public class SachGiaoTrinh extends Sach {
    private String monHoc;

    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan, String monHoc) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.monHoc = monHoc;
    }

    @Override
    public double tinhGiaBan() {
        return giaCoBan * 1.1; // ví dụ: 10% lợi nhuận
    }

    @Override
    public String toString() {
        return super.toString() + ", Môn học: " + monHoc + ", Giá bán: " + tinhGiaBan();
    }
}
