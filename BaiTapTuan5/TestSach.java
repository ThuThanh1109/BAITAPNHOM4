package BaiTapTuan5;

public class TestSach {
    public static void main(String[] args) {
        // Tạo đối tượng sách bằng constructor đầy đủ tham số
        Sach sach1 = new Sach("S001", "Lap tronh co ban voi C", "Hoang Thi My Le", 2021, 10);

        // Tạo đối tượng sách bằng constructor mặc định và setter
        Sach sach2 = new Sach();
        sach2.setMaSach("S002");
        sach2.setTieuDe("Thiet ke web");
        sach2.setTacGia("Tran Buu Dung");
        sach2.setNamXuatBan(2020);
        sach2.setSoLuong(5);

        // Hiển thị thông tin sách
        System.out.println("Thong tin sach 1:");
        sach1.hienThiThongTin();

        System.out.println("Thong tin sach 2:");
        sach2.hienThiThongTin();
    }
}