
package baitaptuan5;

public class Test {
    public static void main(String[] args) {
        // Tạo đối tượng sách bằng constructor có tham số
        Sach s1 = new Sach("B001", "Lập trình Java cơ bản", "Nguyễn Văn A", 2022, 10);
        Sach s2 = new Sach("B002", "Cấu trúc dữ liệu và giải thuật", "Trần Thị B", 2021, 5);

        // Hiển thị thông tin sách
        s1.hienThiThongTin();
        s2.hienThiThongTin();

        // Dùng setter để thay đổi thông tin sách (thể hiện tính đóng gói)
        s1.setSoLuong(12);
        System.out.println("Sau khi cập nhật số lượng:");
        s1.hienThiThongTin();
    }
}
