/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitaptuan8;

import java.util.Scanner;

public class TestSachTuan8 
{
    public static void main(String[] args) 
    {
        IQuanLySach quanLy = new QuanLySachImpl();
        Scanner sc = new Scanner(System.in);
        int chon;

        do {
            System.out.println("\n===== MENU QUAN LY SACH =====");
            System.out.println("1. Them sach giao trinh");
            System.out.println("2. Them sach tieu thuyet");
            System.out.println("3. Hien thi danh sach sach");
            System.out.println("4. Tim kiem sach theo ma");
            System.out.println("5. Xoa sach theo ma");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");
            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1 -> {
                    System.out.print("Ma sach: ");
                    String ma = sc.nextLine();
                    System.out.print("Tua de: ");
                    String td = sc.nextLine();
                    System.out.print("Tac gia: ");
                    String tg = sc.nextLine();
                    System.out.print("Gia co ban: ");
                    double gia = sc.nextDouble();
                    System.out.print("So luong: ");
                    int sl = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Vi tri: ");
                    String vt = sc.nextLine();
                    System.out.print("Mon hoc: ");
                    String mh = sc.nextLine();
                    quanLy.themSach(new SachGiaoTrinh(ma, td, tg, gia, sl, vt, mh));
                }
                case 2 -> {
                    System.out.print("Ma sach: ");
                    String ma = sc.nextLine();
                    System.out.print("Tua de: ");
                    String td = sc.nextLine();
                    System.out.print("Tac gia: ");
                    String tg = sc.nextLine();
                    System.out.print("Gia co ban: ");
                    double gia = sc.nextDouble();
                    System.out.print("So luong: ");
                    int sl = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Vi tri: ");
                    String vt = sc.nextLine();
                    System.out.print("The loai: ");
                    String tl = sc.nextLine();
                    quanLy.themSach(new SachTieuThuyet(ma, td, tg, gia, sl, vt, tl));
                }
                case 3 -> quanLy.hienThiDanhSach();
                case 4 -> {
                    System.out.print("Nhap ma sach can tim: ");
                    String ma = sc.nextLine();
                    Sach s = quanLy.timKiemSach(ma);
                    System.out.println((s != null) ? s : "Khong tim thay!");
                }
                case 5 -> {
                    System.out.print("Nhap ma sach can xoa: ");
                    String ma = sc.nextLine();
                    if (!quanLy.xoaSach(ma))
                        System.out.println("Khong tim thay ma sach de xoa!");
                }
                case 0 -> System.out.println("Thoat chuong trinh!");
                default -> System.out.println("Lua chon khong hop le!");
            }
        } while (chon != 0);

        sc.close();
    }
}
