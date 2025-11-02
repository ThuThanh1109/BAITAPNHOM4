package BaiTapTuan9;

import java.util.ArrayList;
import java.util.*;

public class QuanLySachImpl implements IQuanLySach {
    private ArrayList<Sach> danhSach = new ArrayList<>();

    @Override
    public void themSach(Sach sach) {
        danhSach.add(sach);
        System.out.println("Da them sach: " + sach.getTieuDe());
    }

    @Override
    public Sach timKiemSach(String maSach) {
        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) return s;
        }
        return null;
    }

    @Override
    public boolean xoaSach(String maSach) {
        Sach s = timKiemSach(maSach);
        if (s != null) {
            danhSach.remove(s);
            System.out.println("Da xoa sach co ma: " + maSach);
            return true;
        }
        return false;
    }

    @Override
    public void hienThiDanhSach() {
        System.out.println("===== DANH SACH SACH =====");
        for (Sach s : danhSach) {
            System.out.println(s);
        }
    }
    
    //Phần làm thêm
    //Tìm sách theo tác giả
    @Override
    public ArrayList<Sach> timSachTheoTacGia(String tacGia) {
        ArrayList<Sach> ketQua = new ArrayList<>();
        for (Sach s : danhSach) {
            if (s.getTacGia().equalsIgnoreCase(tacGia)) {
                ketQua.add(s);
            }
        }
        return ketQua;
    }
    //Tính tổng giá trị của sách trong kho
     @Override
    public double tinhTongGiaTriKho() {
        double tong = 0;
        for (Sach s : danhSach) {
            tong += s.tinhGiaBan() * s.getSoLuong();
        }
        return tong;
    }
    //Sắp xếp sách theo mã sách
    @Override
    public void sapXepTheoMa() {  
        Collections.sort(danhSach, (Sach s1, Sach s2) -> s1.getMaSach().compareToIgnoreCase(s2.getMaSach()));
        System.out.println("Da sap xep sach theo ma sach!");
    }
}
