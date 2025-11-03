package BaiTapTuan9;

public class SachThamKhao extends Sach {
    private String linhVuc;

    public SachThamKhao(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan,
                          String linhVuc) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.linhVuc = linhVuc;
    }
    
    public String getLinhVuc() {
        return linhVuc;
    }

    public void setLinhVuc(String linhVuc) {
        this.linhVuc = linhVuc;
    }
    
     @Override
    public double tinhGiaBan() {
        // Sách tham khảo bán cao hơn 20% giá cơ bản
        return getGiaCoBan() * 1.2;
    }

    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return getSoLuong() >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        System.out.println("Da chuyen sach " + getTieuDe() + " den " + viTriMoi);
    }

    @Override
    public String toString() {
        return super.toString() + ", Linh vuc: " + linhVuc + ", Gia ban: " + tinhGiaBan();
    }
    
}
