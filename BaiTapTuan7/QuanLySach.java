
package baitaptuan7;
import java.util.ArrayList;

public class QuanLySach 
{
    private ArrayList<Sach> danhSachSach = new ArrayList<>();

    public void themSach(Sach s) 
    {
        danhSachSach.add(s);
    }

    public void hienThiDanhSachSach() 
    {
        for (Sach s : danhSachSach) 
        {
            System.out.println(s.toString());
            System.out.println("Gia ban uoc tinh: " + s.tinhGiaBan() + " VND");
            System.out.println("------------------------------------");
        }
    }
}
