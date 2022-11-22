import java.util.ArrayList;
import java.util.Scanner;



public class Main {
	public static ActionStudent action = new ActionStudent();
	public static ArrayList<Student> studentList= new ArrayList<>();
    public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 Student student = action.inputStudent(sc);
	 studentList.add(student);
	 for(Student o: studentList) {
		System.out.println(o);
	}
	Main m = new Main();
	m.showSortMenu();
 }
 private static void showSortMenu() {
	 Scanner sc = new Scanner(System.in);
     System.out.println("Chọn tiêu chí sắp xếp: ");
     System.out.println("1. Nhap tiep");
     System.out.println("2. ko nhap nua");
     System.out.println("3. Thoát ra ngoài menu chính");
     System.out.print("Chọn: ");
     int choose = 0;
     do {
         choose = new Scanner(System.in).nextInt();
         if (choose >= 1 && choose <= 3) {
             break;
         }
         System.out.print("Lựa chọn không hợp lệ, vui lòng chọn lại: ");
     } while (true);
     switch (choose) {
         case 1:
            action.inputStudent1();
             break;
         case 2:
            action.showStudent();
             break;
         case 3:
             return;
     }
 }



}
