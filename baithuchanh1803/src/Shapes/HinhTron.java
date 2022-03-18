package Shapes;

import java.util.Scanner;

public class HinhTron{
    float banKinh, chuvi, dientich;
    final float PI = 3.14f;
    public void NhapBanKinh(){
        System.out.println("Nhap vao ban kinh hinh tron:");
        try (Scanner sc = new Scanner(System.in)) {
            banKinh = sc.nextFloat();
        }
    }
    public float TinhChuVi(){
        chuvi = 2 * PI * banKinh;
        return chuvi;
    }
    public float TinhDienTich(){
        dientich = PI * banKinh * banKinh;
        return dientich;
    }
    boolean KiemTra(){
        return true;
    }
}