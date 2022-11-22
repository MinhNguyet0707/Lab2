import java.awt.Desktop.Action;
import java.util.ArrayList;
import java.util.Scanner;
public class ActionStudent {
	public Student inputStudent(Scanner sc) {
	 while (true){
         try{
             System.out.println("Mời b nhập tên: ");
             String name = sc.nextLine();
             System.out.println("Mời b nhập dia chi ");
             String address = sc.nextLine();
             System.out.println("Mời b nhập tuổi: ");
             int age = Integer.parseInt(sc.nextLine());
             return new Student(name, address, age);
         } catch (Exception e){
             System.out.println("Lỗi input student, vui lòng nhập lại");
         }
     }
	  
}
	public static void inputStudent1() {
		Scanner sc = new Scanner(System.in);
        System.out.print("Xin mời nhập số hoc sinh mới muốn thêm: ");
        int soHocSinh = new Scanner(System.in).nextInt();    
        for (int i = 0; i < soHocSinh; i++) {     
        	 Student student = Main.action.inputStudent(sc);
             Main.studentList.add(student);
			
		}
        for (Student o : Main.studentList) {
        	System.out.println(o);
        }
    }
	


	public static void showStudent() {
        for (int i = 0; i < Main.studentList.size(); i++) {
            if (Main.studentList == null) {
                continue;
            }
            System.out.println(Main.studentList);
        }
    }

	 
	 
	
	
}
