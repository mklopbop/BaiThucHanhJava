package Employee;
import Person.Person;

public class Employee extends Person{
    
     public static final int NHAN_VIEN_SEP = 1;
     public static final int NHAN_VIEN_LINH = 2;
  
     public static final long LUONG_NHAN_VIEN_FULL_TIME_SEP = 20000000; 
     public static final long LUONG_NHAN_VIEN_FULL_TIME_LINH = 10000000; 
     public static final long LUONG_LAM_THEM_MOI_NGAY = 800000; 
     public static final long LUONG_NHAN_VIEN_PART_TIME_MOI_GIO = 100000;

    protected long luong;

    public Employee(){

    }
    protected String loaiNhanVien(){

        return "";
    }

    @Override
    public void intt(){
        System.out.println("- Loại nhân viên: " + loaiNhanVien());
        System.out.println("- Lương: " + luong + " VND");
    }
}