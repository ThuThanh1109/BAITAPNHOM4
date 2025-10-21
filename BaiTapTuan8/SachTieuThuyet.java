
package baitaptuan8;

public class SachTieuThuyet extends Sach {
    private String theLoai;

    public SachTieuThuyet(String tieuDe, String tacGia, double giaCoBan, int soLuong, String viTri, String theLoai) {
        super(tieuDe, tacGia, giaCoBan, soLuong, viTri);
        this.theLoai = theLoai;
    }

    @Override
    public double tinhGiaBan() {
        return giaCoBan * 1.2; // cộng 20%
    }

    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return soLuong >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        this.viTri = viTriMoi;
        System.out.println("Da chuyen sach \"" + tieuDe + "\" đen khu vuc: " + viTriMoi);
    }

    @Override
    public String toString() {
        return "[Tieu thuyet] " + super.toString() + ", The loai: " + theLoai + ", Gia ban: " + formatCurrency(tinhGiaBan());
    }
}
