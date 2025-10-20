package baitaptuan6;
import java.util.ArrayList;
public class QuanLySach 
{
    private ArrayList<Sach> danhSach; 
    
    public QuanLySach() {
        danhSach = new ArrayList<>();
    }

    // Thêm sách
    public void themSach(Sach s) {
        danhSach.add(s);
    }

    // Xóa sách theo mã
    public void xoaSach(String maSach) {
        Sach sachCanXoa = null;
        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                sachCanXoa = s;
                break;
            }
        }
        if (sachCanXoa != null) {
            danhSach.remove(sachCanXoa);
            System.out.println("Đã xóa sách có mã: " + maSach);
        } else {
            System.out.println("Không tìm thấy mã sách: " + maSach);
        }
    }

    // Tìm sách theo mã
    public Sach timSach(String maSach) {
        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                return s;
            }
        }
        return null;
    }

    // Cập nhật số lượng sách
    public void capNhatSoLuong(String maSach, int soLuongMoi) {
        Sach s = timSach(maSach);
        if (s != null) {
            s.setSoLuong(soLuongMoi);
            System.out.println("Đã cập nhật số lượng cho sách: " + maSach);
        } else {
            System.out.println("Không tìm thấy mã sách: " + maSach);
        }
    }

    // Hiển thị danh sách
    public void hienThiTatCa() {
        System.out.println("===== DANH SACH SACH =====");
        for (Sach s : danhSach) {
            System.out.println(s.toString());
        }
        System.out.println("==========================");
    }
}

