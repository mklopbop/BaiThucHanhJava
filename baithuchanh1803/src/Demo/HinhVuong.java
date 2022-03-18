package Demo;

import java.util.Scanner;

public class HinhVuong{
    float chieuDaiCanh, dientich, chuvi;

    public void NhapCanh(){
        System.out.println("Nhap vao chieu dai canh hinh vuong:");
        try (Scanner sc = new Scanner(System.in)) {
            chieuDaiCanh = sc.nextFloat();
        }
    }
    public float TinhChuVi(){
        chuvi = chieuDaiCanh * 4;
        return chuvi;
    }
    public float TinhDienTich(){
        dientich = chieuDaiCanh * chieuDaiCanh;
        return dientich;
    }
    boolean KiemTra(){
        return true;
    }
}