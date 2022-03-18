import Shapes.HinhTron;

public class App {
    public static void main(String[] aargs) throws Exception{
        float cv, dt;
        HinhTron ht = new HinhTron();
        ht.NhapBanKinh();
        cv = ht.TinhChuVi();
        dt = ht.TinhDienTich();
        System.out.println("Chu vi cua hinh tron la :" + cv);
        System.out.println("Dien tich hinh tron la:" + dt);
        
    }
    
}
