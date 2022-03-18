package Shapes;
import java.util.Scanner;

public class Persion {
    String PersonID;
    String PersonName;
    Boolean Gender;
    String Address;
    public void nhapPersionID() {
        System.out.print("Nhap PersonID: ");
        try (Scanner sc = new Scanner(System.in)) {
            PersonID = sc.nextLine();
        }
    }
    public void nhapPersionName() {
        System.out.print("Nhap PersonName: ");
        try (Scanner sc = new Scanner(System.in)) {
            PersonName = sc.nextLine();
        }e();
        }
    private void e() {
    }
    
    public void nhapGender() {
        System.out.print("Nhap Gender: ");
        try (Scanner sc = new Scanner(System.in)) {
            Gender = sc.hasNext();
        }
    }
    public void nhapAddress() {
        System.out.print("Nhap Address: ");
        try (Scanner sc = new Scanner(System.in)) {
            Address = sc.nextLine();
        }
    }
    public void inPersionID(){
        System.out.println("PersonID : " + PersonID);
    }
    public void inPersionName(){
        System.out.println("PersonName : " + PersonName);
    }
    public void inGender(){
        System.out.println("Gender : " + Gender);
    }
    public void inAddress(){
        System.out.println("Address: " + Address);
    }
    public static void main(String[] args){
        Persion ps = new Persion();
        ps.nhapPersionID();
        ps.nhapPersionName();
        ps.nhapGender();
        ps.nhapAddress();
        ps.inPersionID();
        ps.inPersionName();
        ps.inGender();
        ps.inAddress();
    }
}