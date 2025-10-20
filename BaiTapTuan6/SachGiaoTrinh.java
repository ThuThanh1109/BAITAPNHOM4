package baitaptuan6;
public class SachGiaoTrinh extends Sach {
    private String monHoc;
    private String capDo;

    // constructor phù hợp với lớp cha
    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong,
                         String monHoc, String capDo) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong); // gọi đúng constructor lớp cha
        this.monHoc = monHoc;
        this.capDo = capDo;
    }

    @Override
    public String toString() {
        return "Ma sach: " + getMaSach() +
               ", Tieu de: " + getTieuDe() +
               ", Tac gia: " + getTacGia() +
               ", Nam xuat ban " + getNamXuatBan() +
               ", So luong: " + getSoLuong() +
               ", Mon hoc: " + monHoc +
               ", Cap do: " + capDo;
    }
}
