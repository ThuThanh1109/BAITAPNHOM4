package BaiTapTuan7;

public class TestSachTuan7 {
    public static void main(String[] args) {
        QuanLySach ql = new QuanLySach();

        // Thêm sách giáo trình
        SachGiaoTrinh sgk1 = new SachGiaoTrinh("GT001", "Toan roi rac", "Thuy Hang", 2020, 50, 50000, "Toan hoc", "Dai hoc");
        SachGiaoTrinh sgk2 = new SachGiaoTrinh("GT002", "Vat ly co ban", "Thuy Hanh", 2021, 30, 45000, "Vat ly", "Pho thong");

        // Thêm sách tiểu thuyết
        SachTieuThuyet stt1 = new SachTieuThuyet("TT001", "Harry Potter", "J.K. Rowling", 2000, 100, 150000, "Ky ao", true);
        SachTieuThuyet stt2 = new SachTieuThuyet("TT002", "De mem phieu luu ki", "To Hoai", 1955, 80, 100000, "Thieu nhi", false);

        // Thêm vào danh sách quản lý
        ql.themSach(sgk1);
        ql.themSach(sgk2);
        ql.themSach(stt1);
        ql.themSach(stt2);

        // Hiển thị danh sách và giá bán ước tính
        ql.hienThiDanhSach();
        
        //Kiểm tra giao diện IKiemKe
        System.out.println("===KIEM TRA GIAO DIEN IKIEMKE===");
        IKiemKe kiemke1 = sgk1;
        boolean slTon = kiemke1.kiemTraTonKho(142);
        System.out.println("Ton kho >= 142 ?" + (slTon ? "Du hang" : "Thieu hang"));
        kiemke1.capNhatViTri("Kho A1 - Ke 2");
        
        System.out.println("Kiem tra doi voi sach tieu thuyet: ");
        IKiemKe kiemke2 = stt1;
        kiemke2.kiemTraTonKho(150);
        kiemke2.capNhatViTri("Kho B2 - Ke 2");
    }
}

