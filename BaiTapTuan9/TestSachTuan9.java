package BaiTapTuan9;

import java.util.Scanner;

public class TestSachTuan9 {
    public static void main(String[] args) {
        IQuanLySach ql = new QuanLySachImpl();
        Scanner sc = new Scanner(System.in);
        int chon;
 // ===== THÊM 3 SÁCH MẪU BAN ĐẦU =====
        ql.themSach(new SachGiaoTrinh("GT001", "Lap trinh huong doi tuong", "Nguyen Tan Thuan", 2020, 5, 200000, "Lap trinh Java", "Dai hoc"));
        ql.themSach(new SachTieuThuyet("TT001", "Harry Potter", "J. K. Rowling", 1999, 6, 120000, "Tieu thuyet phieu luu", true));
        ql.themSach(new SachThamKhao("TK001", "Lap trinh C can ban", "Hoang Thi My Le", 2021, 4, 180000, "CNTT"));

        do {
            System.out.println("\n===== MENU QUAN LY SACH =====");
            System.out.println("1. Them sach");
            System.out.println("2. Hien thi danh sach");
            System.out.println("3. Tim kiem sach theo ma");
            System.out.println("4. Xoa sach theo ma");
            System.out.println("5.Tim sach theo ten tac gia");
            System.out.println("6.Tinh tong gia tri sach trong kho");
            System.out.println("7.Sap xep sach theo ma sach");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");
            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1:
                    System.out.println("\n=== CHON LOAI SACH MUON THEM ===");
                    System.out.println("1. Sach giao trinh");
                    System.out.println("2. Sach tieu thuyet");
                    System.out.println("3. Sach tham khao");
                    System.out.print("Chon: ");
                    int loai = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nhap ma sach: ");
                    String ma = sc.nextLine();
                    System.out.print("Nhap tieu de: ");
                    String tieuDe = sc.nextLine();
                    System.out.print("Nhap tac gia: ");
                    String tacGia = sc.nextLine();
                    System.out.print("Nhap nam xuat ban: ");
                    int nam = sc.nextInt();
                    System.out.print("Nhap so luong: ");
                    int soLuong = sc.nextInt();
                    System.out.print("Nhap don gia: ");
                    double donGia = sc.nextDouble();
                    sc.nextLine();

                    switch (loai) {
                        case 1:
                            System.out.print("Nhap mon hoc: ");
                            String monHoc = sc.nextLine();
                            System.out.print("Nhap cap dao tao: ");
                            String capDaoTao = sc.nextLine();
                            ql.themSach(new SachGiaoTrinh(ma, tieuDe, tacGia, nam, soLuong, donGia, monHoc, capDaoTao));
                            break;

                        case 2:
                            System.out.print("Nhap the loai: ");
                            String theLoai = sc.nextLine();
                            System.out.print("Co phai la sach series? (true/false): ");
                            boolean laSachSeries = sc.nextBoolean();
                            ql.themSach(new SachTieuThuyet(ma, tieuDe, tacGia, nam, soLuong, donGia, theLoai, laSachSeries));
                            break;

                        case 3:
                            System.out.print("Nhap linh vuc: ");
                            String linhVuc = sc.nextLine();
                            ql.themSach(new SachThamKhao(ma, tieuDe, tacGia, nam, soLuong, donGia, linhVuc));
                            break;

                        default:
                            System.out.println("Loai sach khong hop le!");
                    }
                    break;    
                case 2:
                    ql.hienThiDanhSach();
                    break;
                case 3:
                    System.out.print("Nhap ma sach can tim: ");
                    String maSach = sc.nextLine();
                    Sach s = ql.timKiemSach(maSach);
                    System.out.println(s != null ? s : "Khong tim thay!");
                    break;
                case 4:
                    System.out.print("Nhap ma sach can xoa: ");
                    String maXoa = sc.nextLine();
                    ql.xoaSach(maXoa);
                    break;
                case 5:
                    System.out.print("Nhap vao ten tac gia: ");
                    String tg = sc.nextLine();
                    var ketQua = ql.timSachTheoTacGia(tg);
                    if (ketQua.isEmpty()) {
                        System.out.println("Khong tim thay sach nao cua tac gia " + tg);
                    } else {
                        System.out.println("Cac sach cua tac gia " + tg + ":");
                        for (Sach sach : ketQua) {
                            System.out.println(sach);
                        }
                    }
                    break;
                case 6:
                    System.out.println("Tong gia tri cua kho: " +  ql.tinhTongGiaTriKho());
                    break;
                case 7:
                    System.out.println("Sap xep sach theo ma sach");
                    ql.sapXepTheoMa();
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
