package baitaptuan8;

import java.text.DecimalFormat;

public abstract class Sach implements IGiaBan, IKiemKe {
    protected String tieuDe;
    protected String tacGia;
    protected double giaCoBan;
    protected int soLuong;
    protected String viTri;

    public Sach(String tieuDe, String tacGia, double giaCoBan, int soLuong, String viTri) {
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.giaCoBan = giaCoBan;
        this.soLuong = soLuong;
        this.viTri = viTri;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public double getGiaCoBan() {
        return giaCoBan;
    }

    public void setGiaCoBan(double giaCoBan) {
        this.giaCoBan = giaCoBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    // Hàm format tiền 
    protected String formatCurrency(double value) {
        DecimalFormat df = new DecimalFormat("#,###");
        return df.format(Math.round(value));
    }

    @Override
    public String toString() {
        return "Tieu de: " + tieuDe +
               ", Tac gia: " + tacGia +
               ", Gia co ban: " + formatCurrency(giaCoBan) +   
               ", So luong: " + soLuong +
               ", Vi tri: " + viTri;
    }
}
