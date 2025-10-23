
package baitaptuan8;

public class SachGiaoTrinh extends Sach {
    private String monHoc;

    public SachGiaoTrinh(String tieuDe, String tacGia, double giaCoBan, int soLuong, String viTri, String monHoc) {
        super(tieuDe, tacGia, giaCoBan, soLuong, viTri);
        this.monHoc = monHoc;
    }

    @Override
    public double tinhGiaBan() {
        return giaCoBan * 1.1; // cộng 10%
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
        return "[Giao trinh] " + super.toString() + ", Mon hoc: " + monHoc + ", Gia ban: " + formatCurrency(tinhGiaBan());
    }
}
