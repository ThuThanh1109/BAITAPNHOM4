package BaiTapTuan7;

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
            System.out.println("Gia ban uoc tinh: " + s.tinhGiaBan() + "VND");
        }
    }
}

