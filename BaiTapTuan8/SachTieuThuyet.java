package baitaptuan8;
public class SachTieuThuyet extends Sach 
{
    private String theLoai;

    public SachTieuThuyet(String maSach, String tieuDe, String tacGia,
                          double giaCoBan, int soLuong, String viTri, String theLoai) 
    {
        super(maSach, tieuDe, tacGia, giaCoBan, soLuong, viTri);
        this.theLoai = theLoai;
    }

    public String getTheLoai() 
    { 
        return theLoai; 
    }
    public void setTheLoai(String theLoai) 
    { 
        this.theLoai = theLoai; 
    }

    @Override
    public double tinhGiaBan() 
    {
        return giaCoBan * 1.20; // +20% phụ phí
    }

    @Override
    public String toString() 
    {
        return "[Tieu thuyet] " + super.toString() + " | The loai: " + theLoai + " | Gia ban: " + tinhGiaBan();
    }
}
