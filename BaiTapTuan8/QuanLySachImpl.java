
package baitaptuan8;

import java.util.ArrayList;
import java.util.List;

public class QuanLySachImpl implements IQuanLySach {
    private List<Sach> danhSach = new ArrayList<>();

    @Override
    public void themSach(Sach s) {
        danhSach.add(s);
        System.out.println("Da them sach: " + s.getTieuDe());
    }

    @Override
    public Sach timKiemSach(String tieuDe) {
        for (Sach s : danhSach) {
            if (s.getTieuDe().equalsIgnoreCase(tieuDe)) {
                return s;
            }
        }
        return null;
    }

    @Override
    public void xoaSach(String tieuDe) {
        Sach s = timKiemSach(tieuDe);
        if (s != null) {
            danhSach.remove(s);
            System.out.println("Da xoa sach: " + tieuDe);
        } else {
            System.out.println("Khong tim thay sach can xoa!");
        }
    }

    @Override
    public void hienThiDanhSach() {
        System.out.println("\n--- DANH SACH SACH ---");
        for (Sach s : danhSach) {
            System.out.println(s);
        }
    }
}
