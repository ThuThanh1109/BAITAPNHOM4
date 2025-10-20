
package baitaptuan7;
public abstract class Sach 
{
    protected String maSach;
    protected String tieuDe;
    protected String tacGia;
    protected int namXuatBan;
    protected int soLuong;
    protected double giaCoBan;

    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
        this.giaCoBan = giaCoBan;
    }

    // Getter/Setter
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

    public int getNamXuatBan() 
    { 
        return namXuatBan; 
    }
    public void setNamXuatBan(int namXuatBan) 
    { 
        this.namXuatBan = namXuatBan; 
    }

    public int getSoLuong() 
    { 
        return soLuong; 
    }
    public void setSoLuong(int soLuong) 
    { 
        this.soLuong = soLuong; 
    }

    public double getGiaCoBan() 
    { 
        return giaCoBan; 
    }
    public void setGiaCoBan(double giaCoBan) 
    { 
        this.giaCoBan = giaCoBan; 
    }

    // ✅ Phương thức trừu tượng
    public abstract double tinhGiaBan();

    @Override
    public String toString() 
    {
        return "Ma sach: " + maSach +
               ", Tieu de: " + tieuDe +
               ", Tac gia: " + tacGia +
               ", Nam xuat ban: " + namXuatBan +
               ", So luong: " + soLuong +
               ", Gia co ban: " + giaCoBan;
    }
}

