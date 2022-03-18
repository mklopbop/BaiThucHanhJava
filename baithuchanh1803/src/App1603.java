
import Shapes.SinhVien;
import Shapes.PTB2;
import Shapes.Persion;

public class App1603 {
    public static void main(String[] args){
        Persion ps = new Persion();
        SinhVien sv = new SinhVien<>();
        PTB2 pt = new PTB2();
        ps.nhapPersionID();
        ps.nhapPersionName();
        ps.nhapGender();
        ps.nhapAddress();
        ps.inPersionID();
        ps.inPersionName();
        ps.inGender();
        ps.inAddress();
        System.out.println("\n\n");
        sv.nhapMaSv();
        sv.nhapHoten();
        sv.nhapGioiTinh();
        sv.nhapDiaChi();
        sv.nhapNgaySinh();
        sv.inMaSv();
        sv.inHoten();
        sv.inGioitinh();
        sv.inDiaChi();
        sv.inNgaySinh();
        System.out.println("\n\n");
        pt.nhap();

    } 
}