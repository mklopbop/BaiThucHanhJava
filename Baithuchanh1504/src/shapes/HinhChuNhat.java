package shapes;
import java.util.Scanner;
public class HinhChuNhat extends HinhHoc{
    public float dai;
    public float rong;
    public HinhChuNhat(){
        tem = "Hinh Chu Nhat";

    }
    public void nhapChieuDai(){
        System.out.println("Chieu Dai = ");
        try (Scanner scanner = new Scanner(System.in)) {
            dai = scanner.nextFloat();
        }
    }
    public void nhapChieuRong() {
        System.out.println("Chieu Rong =");
        try (Scanner scanner = new Scanner(System.in)) {
            rong = scanner.nextFloat();
        }
    }
    public void tinhChuVi() {
        chuVi = 2 * (dai+rong);
    }
    public void tinhDienTich(){
        dienTich = dai * rong;
    }
}