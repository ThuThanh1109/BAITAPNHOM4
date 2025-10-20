package baitaptuan7;
public class TestSachTuan7 
{
    public static void main(String[] args) 
    {
        QuanLySach ql = new QuanLySach();

        SachGiaoTrinh sg = new SachGiaoTrinh("GT01", "Giai tich 1", "Nguyen Van A", 2020, 120, 50000, "Toan");
        SachTieuThuyet st = new SachTieuThuyet("TT01", "Harry Potter", "J.K. Rowling", 2018, 80, 70000, true);

        ql.themSach(sg);
        ql.themSach(st);

        ql.hienThiDanhSachSach();

        // Kiểm tra giao diện
        IKiemKe kiemKe = sg;
        System.out.println("Kiem tra ton kho >= 100: " + kiemKe.kiemTraTonKho(100));
        kiemKe.capNhatViTri("Kho A1 - Ke 5");
    }
}

