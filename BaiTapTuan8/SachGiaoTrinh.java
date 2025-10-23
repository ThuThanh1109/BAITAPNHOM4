package BaiTapTuan8;

public class SachGiaoTrinh extends Sach {
    private String monHoc;
    private String capDo;

    // Constructor đầy đủ
    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong,
                         double giaCoBan, String monHoc, String capDo) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }
    
    // Getter & Setter
    public String getMonHoc() {
        return monHoc;
    }

    public void setMonHoc(String monHoc) {
        this.monHoc = monHoc;
    }

    public String getCapDo() {
        return capDo;
    }

    public void setCapDo(String capDo) {
        this.capDo = capDo;
    }
    
    //Ghi đè phương thức tinhGiaBan
    @Override
    public double tinhGiaBan(){
        return  getGiaCoBan() +((2025 - getNamXuatBan()) * 5000); 
    }

    // Ghi đè phương thức toString
     @Override
    public String toString() {
        return super.toString() +
               ", Mon hoc: " + monHoc +
               ", Cap do: " + capDo +
                ", Gia ban: " + tinhGiaBan();
    }
    
    //Triển khai giao diện IKiemKe
    @Override
    public boolean kiemTraTonKho (int soLuongToiThieu){
        return getSoLuong() >= soLuongToiThieu;
    } 
    @Override
    public void capNhatViTri (String viTriMoi){
        System.out.println("Da chuyen sach " + getTieuDe() + "den khu vuc " + viTriMoi);
    }
}
