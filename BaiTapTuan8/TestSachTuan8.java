
package baitaptuan8;

import java.util.Scanner;
import java.util.Scanner;

public class TestSachTuan8 {
    public static void main(String[] args) {
        IQuanLySach quanLy = new QuanLySachImpl();
        Scanner sc = new Scanner(System.in);
        int chon;

        do {
            System.out.println("\n===== MENU QUAN LY SACH =====");
            System.out.println("1. Them sach giao trinh");
            System.out.println("2. Them sach tieu thuyet");
            System.out.println("3. Hien thi danh sach sach");
            System.out.println("4. Tim kiem sach");
            System.out.println("5. Xoa sach");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");
            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1:
                    System.out.print("Nhap tieu de: ");
                    String td = sc.nextLine();
                    System.out.print("Nhap tac gia: ");
                    String tg = sc.nextLine();
                    System.out.print("Nhap gia co ban: ");
                    double gb = sc.nextDouble();
                    System.out.print("Nhap so luong: ");
                    int sl = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nhap vi tri: ");
                    String vt = sc.nextLine();
                    System.out.print("Nhap mon hoc: ");
                    String mh = sc.nextLine();
                    quanLy.themSach(new SachGiaoTrinh(td, tg, gb, sl, vt, mh));
                    break;

                case 2:
                    System.out.print("Nhap tieu de: ");
                    td = sc.nextLine();
                    System.out.print("Nhap tac gia: ");
                    tg = sc.nextLine();
                    System.out.print("Nhap gia co ban: ");
                    gb = sc.nextDouble();
                    System.out.print("Nhập so luong: ");
                    sl = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nhap vi tri: ");
                    vt = sc.nextLine();
                    System.out.print("Nhap the loai: ");
                    String tl = sc.nextLine();
                    quanLy.themSach(new SachTieuThuyet(td, tg, gb, sl, vt, tl));
                    break;

                case 3:
                    quanLy.hienThiDanhSach();
                    break;

                case 4:
                    System.out.print("Nhap tieu de can tim: ");
                    td = sc.nextLine();
                    Sach s = quanLy.timKiemSach(td);
                    if (s != null)
                        System.out.println(s);
                    else
                        System.out.println("Khong tim thay!");
                    break;

                case 5:
                    System.out.print("Nhap ieu de can xoa: ");
                    td = sc.nextLine();
                    quanLy.xoaSach(td);
                    break;

                case 0:
                    System.out.println("Thoat chuong trinh!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (chon != 0);

        sc.close();
    }
}
