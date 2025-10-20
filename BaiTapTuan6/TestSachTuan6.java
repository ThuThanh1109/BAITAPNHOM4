package baitaptuan6;
public class TestSachTuan6 {
    public static void main(String[] args) {
        QuanLySach ql = new QuanLySach();

        SachGiaoTrinh sg = new SachGiaoTrinh("GT01", "Lap trinh Java", "Nguyen Van An", 2023, 10, "CNTT", "Dai hoc");
        SachTieuThuyet st = new SachTieuThuyet("TT01", "Doraemon", "Fujiko Fujio", 1999, 8, "Truyen tranh", true);

        ql.themSach(sg);
        ql.themSach(st);

        ql.hienThiTatCa();
    }
}

