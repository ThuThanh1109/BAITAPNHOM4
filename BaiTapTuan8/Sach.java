package baitaptuan8;
public abstract class Sach implements IGiaBan, IKiemKe 
{
    protected String maSach;
    protected String tieuDe;
    protected String tacGia;
    protected double giaCoBan;
    protected int soLuong;
    protected String viTri;

    public Sach(String maSach, String tieuDe, String tacGia, double giaCoBan, int soLuong, String viTri) 
    {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.giaCoBan = giaCoBan;
        this.soLuong = soLuong;
        this.viTri = viTri;
    }

    public String getMaSach() 
    { 
        return maSach; 
    }
    public void setMaSach(String maSach) 
    { 
        this.maSach = maSach; 
    }

    public String getTieuDe() 
    {
        return tieuDe; 
    }
    public void setTieuDe(String tieuDe) 
    { 
        this.tieuDe = tieuDe; 
    }

    public String getTacGia() 
    { 
        return tacGia; 
    }
    public void setTacGia(String tacGia) 
    { 
        this.tacGia = tacGia; 
    }

    public double getGiaCoBan() 
    { 
        return giaCoBan; 
    }
    public void setGiaCoBan(double giaCoBan) 
    { 
        this.giaCoBan = giaCoBan; 
    }

    public int getSoLuong() 
    { 
        return soLuong; 
    }
    public void setSoLuong(int soLuong) 
    { 
        this.soLuong = soLuong; 
    }

    public String getViTri() 
    { 
        return viTri; 
    }
    public void setViTri(String viTri) 
    { 
        this.viTri = viTri; 
    }

    @Override
    public abstract double tinhGiaBan();

    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) 
    {
        return this.soLuong >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) 
    {
        this.viTri = viTriMoi;
        System.out.println("Da chuyen sach \"" + this.tieuDe + "\" den khu vuc: " + viTriMoi);
    }

    @Override
    public String toString() 
    {
        return String.format("Ma sach: %s | Tieu de: %s | Tac gia: %s | Gia co ban: %.2f | So luong: %d | Vi tri: %s",
                maSach, tieuDe, tacGia, giaCoBan, soLuong, viTri);
    }
}

