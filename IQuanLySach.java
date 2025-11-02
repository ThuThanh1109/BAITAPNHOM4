package BaiTapTuan9;

import java.util.ArrayList;

public interface IQuanLySach {
    void themSach(Sach sach);
    Sach timKiemSach(String maSach);
    boolean xoaSach(String maSach);
    void hienThiDanhSach();
    //Nội dung thêm
    // Tìm sách theo tác giả (có thể có nhiều sách cùng tác giả)
    ArrayList<Sach> timSachTheoTacGia(String tacGia);
    //Tính tổng giá trị của sách trong kho
    double tinhTongGiaTriKho ();
    //Sắp xếp sách theo mã sách
    void sapXepTheoMa();
}
