package baitaptuan7;

import java.util.ArrayList;

public class QuanLySach {
    private ArrayList<Sach> danhSachSach;

    public QuanLySach() {
        danhSachSach = new ArrayList<>();
    }

    public void themSach(Sach s) {
        danhSachSach.add(s);
    }

    public void hienThiDanhSachSach() {
        for (Sach s : danhSachSach) {
            System.out.println(s);
        }
    }

    public void hienThiSachTheoNam(int nam) {
        System.out.println("\n=== Sách xuất bản năm " + nam + " ===");
        for (Sach s : danhSachSach) {
            if (s.getNamXuatBan() == nam) {
                System.out.println(s);
            }
        }
    }
}
