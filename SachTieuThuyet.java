package BaiTapTuan9;

public class SachTieuThuyet extends Sach {
    private String theLoai;
    private boolean laSachSeries;

    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan,
                          String theLoai, boolean laSachSeries) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public boolean isLaSachSeries() {
        return laSachSeries;
    }

    public void setLaSachSeries(boolean laSachSeries) {
        this.laSachSeries = laSachSeries;
    }
    
    //Ghi đè phương thức tinhGiaBan
    @Override
    public double tinhGiaBan() {
        double gia = getGiaCoBan();
        if( laSachSeries ) gia = gia +15000;
        return gia;
    }

    @Override
    public String toString() {
        return super.toString() +
               ", The loai: " + theLoai +
               ", La sach series: " + (laSachSeries ? "Co" : "Khong") +
                ", Gia ban: " + tinhGiaBan();
    }
    
    //Triển khai giao diện IKiemKe
    @Override
    public boolean kiemTraTonKho (int soLuongToiThieu){
        return getSoLuong() >= soLuongToiThieu;
    }
    @Override
    public void capNhatViTri(String viTriMoi){
        System.out.println("Da chuyen sach " + getTieuDe()+ " den khu vuc " + viTriMoi);
    }
}
