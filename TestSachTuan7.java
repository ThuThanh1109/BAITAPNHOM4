package baitaptuan7;

public class TestSachTuan7 {
    public static void main(String[] args) {
        QuanLySach ql = new QuanLySach();

        SachGiaoTrinh gt = new SachGiaoTrinh("GT01", "Lập Trình Java", 2022, 120, 50000, "CNTT");
        SachTieuThuyet tt = new SachTieuThuyet("TT01", "Harry Potter", 2018, 50, 80000, "J.K. Rowling", true);

        ql.themSach(gt);
        ql.themSach(tt);

        System.out.println("=== DANH SÁCH SÁCH ===");
        ql.hienThiDanhSachSach();

        System.out.println("\n=== KIỂM TRA GIAO DIỆN IKiemKe ===");
        IKiemKe kiemKe = new SachGiaoTrinh("GT02", "Cấu Trúc Dữ Liệu", 2021, 90, 60000, "Khoa Học Máy Tính");

        System.out.println("Đủ tồn kho 100? " + kiemKe.kiemTraTonKho(100));
        kiemKe.capNhatViTri("Kho A1 - Kệ 5");

        System.out.println("\n=== SÁCH XUẤT BẢN NĂM 2022 ===");
        ql.hienThiSachTheoNam(2022);
    }
}
