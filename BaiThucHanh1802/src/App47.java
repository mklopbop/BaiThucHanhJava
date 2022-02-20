package baitapjava.src;
import java.util.Scanner;
public class App47 {
    public static void main(String[] args){
        int number, sum = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            do{
                System.out.println("Nhap vao so nguyen bat ky : ");
                    number = scanner.nextInt();
                    sum += number;
            }
            while (sum < 100);
        }
        System.out.println("Tong cac so nguyen vua nhap = "+sum);
    }
    
}
