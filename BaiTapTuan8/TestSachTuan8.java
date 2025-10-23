package BaiTapTuan8;

import java.util.Scanner;

public class TestSachTuan8 {
    public static void main(String[] args) {
        IQuanLySach ql = new QuanLySachImpl();
        Scanner sc = new Scanner(System.in);
        int chon;

        do {
            System.out.println("\n=== MENU QUẢN LÝ SÁCH ===");
            System.out.println("1. Thêm sách giáo trình");
            System.out.println("2. Thêm sách tiểu thuyết");
            System.out.println("3. Hiển thị danh sách sách");
            System.out.println("4. Tìm kiếm theo mã");
            System.out.println("5. Xóa sách");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1 -> {
                    System.out.print("Nhập mã: "); String ma = sc.nextLine();
                    System.out.print("Tiêu đề: "); String ten = sc.nextLine();
                    System.out.print("Tác giả: "); String tg = sc.nextLine();
                    System.out.print("Năm XB: "); int nam = sc.nextInt();
                    System.out.print("Số lượng: "); int sl = sc.nextInt();
                    System.out.print("Giá cơ bản: "); double gia = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Môn học: "); String mon = sc.nextLine();
                    ql.themSach(new SachGiaoTrinh(ma, ten, tg, nam, sl, gia, mon));
                }
                case 2 -> {
                    System.out.print("Nhập mã: "); String ma = sc.nextLine();
                    System.out.print("Tiêu đề: "); String ten = sc.nextLine();
                    System.out.print("Tác giả: "); String tg = sc.nextLine();
                    System.out.print("Năm XB: "); int nam = sc.nextInt();
                    System.out.print("Số lượng: "); int sl = sc.nextInt();
                    System.out.print("Giá cơ bản: "); double gia = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Thể loại: "); String tl = sc.nextLine();
                    ql.themSach(new SachTieuThuyet(ma, ten, tg, nam, sl, gia, tl));
                }
                case 3 -> ql.hienThiDanhSach();
                case 4 -> {
                    System.out.print("Nhập mã cần tìm: ");
                    String ma = sc.nextLine();
                    Sach s = ql.timKiemSach(ma);
                    System.out.println(s != null ? s : "Không tìm thấy!");
                }
                case 5 -> {
                    System.out.print("Nhập mã cần xóa: ");
                    String ma = sc.nextLine();
                    ql.xoaSach(ma);
                }
                case 0 -> System.out.println("Thoát chương trình!");
                default -> System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (chon != 0);
        sc.close();
    }
}
