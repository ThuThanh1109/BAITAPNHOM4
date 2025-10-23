package BaiTapTuan8;

import java.util.Scanner;

public class TestSachTuan8 {
    public static void main(String[] args) {
        IQuanLySach ql = new QuanLySachImpl();
        Scanner sc = new Scanner(System.in);
        int chon;

        do {
            System.out.println("\n===== MENU QUAN LY SACH =====");
            System.out.println("1. Them sach giao trinh");
            System.out.println("2. Them sach tieu thuyet");
            System.out.println("3. Hien thi danh sach");
            System.out.println("4. Tim kiem sach theo ma");
            System.out.println("5. Xoa sach theo ma");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");
            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1:
                    ql.themSach(new SachGiaoTrinh("GT001", "Toan roi rac", "Tran Dinh Son", 2021, 50, 50000, "Toan", "Dai hoc"));
                    break;
                case 2:
                    ql.themSach(new SachTieuThuyet("TT001", "Harry Potter", "J.K. Rowling", 2000, 100, 150000, "Ky ao", true));
                    break;
                case 3:
                    ql.hienThiDanhSach();
                    break;
                case 4:
                    System.out.print("Nhap ma sach can tim: ");
                    String ma = sc.nextLine();
                    Sach s = ql.timKiemSach(ma);
                    System.out.println(s != null ? s : "Khong tim thay!");
                    break;
                case 5:
                    System.out.print("Nhap ma sach can xoa: ");
                    String maXoa = sc.nextLine();
                    ql.xoaSach(maXoa);
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh...");
                    break;
                default:
                    System.out.println("Lua chon khong hop le");
            }

        } while (chon != 0);
    }
}
