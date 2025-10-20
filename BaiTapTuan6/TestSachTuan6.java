package BaiTapTuan6;

public class TestSachTuan6 {
    public static void main(String[] args) {
        QuanLySach ql = new QuanLySach();

        // Thêm sách giáo trình
        SachGiaoTrinh sgk1 = new SachGiaoTrinh("GT001", "Toan roi rac", "Thuy Hang", 2020, 50, "Toan hoc", "Dai hoc");
        SachGiaoTrinh sgk2 = new SachGiaoTrinh("GT002", "Vat ly co ban", "Thuy Hanh", 2021, 30, "Vat ly", "Pho thong");

        // Thêm sách tiểu thuyết
        SachTieuThuyet stt1 = new SachTieuThuyet("TT001", "Harry Potter", "J.K. Rowling", 2000, 100, "Ky ao", true);
        SachTieuThuyet stt2 = new SachTieuThuyet("TT002", "De mem phieu luu ki", "To Hoai", 1955, 80, "Thieu nhi", false);

        // Thêm vào danh sách quản lý
        ql.themSach(sgk1);
        ql.themSach(sgk2);
        ql.themSach(stt1);
        ql.themSach(stt2);

        // Hiển thị danh sách
        ql.hienThiDanhSach();

        // Tìm kiếm sách
        System.out.println("Tim kiem sach co ma 'TT001':");
        Sach sachTim = ql.timKiemTheoMa("TT001");
        if (sachTim != null)
            System.out.println(sachTim);
        else
            System.out.println("Khong tim thay");

        // Cập nhật số lượng
        ql.capNhatSoLuong("GT002", 45);

        // Xóa sách
        ql.xoaSach("TT002");

        // Hiển thị lại sau khi cập nhật và xóa
        ql.hienThiDanhSach();
    }
}
