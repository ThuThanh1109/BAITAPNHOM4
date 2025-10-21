package baitaptuan8;
public class SachGiaoTrinh extends Sach 
{
    private String monHoc;

    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia,
                         double giaCoBan, int soLuong, String viTri, String monHoc) 
    {
        super(maSach, tieuDe, tacGia, giaCoBan, soLuong, viTri);
        this.monHoc = monHoc;
    }

    public String getMonHoc() 
    { 
        return monHoc; 
    }
    public void setMonHoc(String monHoc) 
    { 
        this.monHoc = monHoc; 
    }

    @Override
    public double tinhGiaBan() 
    {
        return giaCoBan * 1.10; // +10% thuế
    }

    @Override
    public String toString() {
        return "[Giao trinh] " + super.toString() + " | Mon hoc: " + monHoc + " | Gia ban: " + tinhGiaBan();
    }
}
