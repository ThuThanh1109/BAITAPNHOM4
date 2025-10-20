public class TestSach {
    public static void main(String[] args) {
        // Tạo đối tượng bằng constructor đầy đủ
        Sach s1 = new Sach("S001", "Lap trinh Java", "Nguyen Van An", 2023, 10);

        // Tạo đối tượng bằng constructor rỗng + setter
        Sach s2 = new Sach();
        s2.setMaSach("S002");
        s2.setTieuDe("Cau truc du lieu");
        s2.setTacGia("Tran Thi Thu Hien");
        s2.setNamXuatBan(2022);
        s2.setSoLuong(5);

        // Hiển thị thông tin
        System.out.println("Thong tin sach trong thu vien :");
        s1.hienThiThongTin();
        s2.hienThiThongTin();
    }
}
