import java.util.Scanner;
import java.util.HashSet;
public class App56 {
    public static void main(String[] args) {
        String name;
        HashSet<String> hashSetString = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        hashSetString.add("Wilson");
        hashSetString.add("Nike");
        hashSetString.add("Volvo");
        hashSetString.add("Kia");
        hashSetString.add("Lenovo");
        hashSetString.add("Lenovo");
        System.out.println("cac phan tu trong hashSetString: ");
        System.out.println(hashSetString);
        System.out.println("Nhap phan tu can xoa: ");
        name = scanner.nextLine();
        if (hashSetString.contains(name)){
            hashSetString.remove(name);
            System.out.println("Xoa thanh Cong !!!");
            System.out.println("Cac phan tu con lai trong hashSetString: ");

        }else{
            System.out.println("Xoa khong thanh cong");
        }
        scanner.close();
    }
    
}
