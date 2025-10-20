package BaiTapTuan6;

import java.util.ArrayList;

public class QuanLySach {
    private ArrayList<Sach> danhSachSach;

    public QuanLySach() {
        danhSachSach = new ArrayList<>();
    }

    // Thêm sách mới
    public void themSach(Sach sach) {
        danhSachSach.add(sach);
        System.out.println("Da them thanh cong");
    }

    // Hiển thị danh sách sách
    public void hienThiDanhSach() {
        System.out.println("==== Danh sach sach =====");
        for (Sach s : danhSachSach) {
            System.out.println(s.toString());
        }
    }

    // Tìm kiếm sách theo mã
    public Sach timKiemTheoMa(String maSach) {
        for (Sach s : danhSachSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                return s;
            }
        }
        return null;
    }

    // Xóa sách theo mã
    public boolean xoaSach(String maSach) {
        Sach sach = timKiemTheoMa(maSach);
        if (sach != null) {
            danhSachSach.remove(sach);
            System.out.println("Da xoa sach co ma: " + maSach);
            return true;
        }
        System.out.println("Khong tim thay sach co ma: " + maSach);
        return false;
    }

    // Cập nhật số lượng sách
    public boolean capNhatSoLuong(String maSach, int soLuongMoi) {
        Sach sach = timKiemTheoMa(maSach);
        if (sach != null) {
            sach.setSoLuong(soLuongMoi);
            System.out.println("Da cap nhat so luong cho ma sach: " + maSach);
            return true;
        }
        System.out.println("Khong tim thay ma sach can cap nhat.");
        return false;
    }
}
