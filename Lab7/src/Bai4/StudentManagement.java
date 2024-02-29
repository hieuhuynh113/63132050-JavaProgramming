package Bai4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Scanner;

public class StudentManagement {

    static ArrayList<Student> students = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            menu();
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    nhap();
                    break;
                case 2:
                    xuat();
                    break;
                case 3:
                    svGioi();
                    break;
                case 4:
                    sapXep();
                    break;
            }
            
        } while (option != 5);
        
        System.out.println("Chương trình kết thúc.");
        
    }

   static void menu() {
       System.out.println("1. Nhập danh sách sinh viên");
       System.out.println("2. Xuất thông tin danh sách sinh viên");
       System.out.println("3. Xuất danh sách sinh viên có học lực giỏi");
       System.out.println("4. Sắp xếp danh sách sinh viên theo điểm");
       System.out.println("5. Kết thúc");
   }

   static void nhap() {
       Scanner scanner = new Scanner(System.in);
       
       System.out.print("Nhập tên sinh viên: ");
       String name = scanner.nextLine();

       System.out.print("Nhập điểm sinh viên: ");
       double score = scanner.nextDouble();

      students.add(new Student(name, score));
      System.out.println("Thêm sinh viên thành công.");
   }

   static void xuat() {
      if(students.isEmpty()) { 
          System.out.println("Danh sách sinh viên trống."); 
          return; 
      } 

      for(Student student : students) { 
          System.out.println(student); 
      } 
   }

   static void svGioi() { 
     if(students.isEmpty()) { 
         System.out.println("Danh sách sinh viên trống."); 
         return; 
     } 

     System.out.println("Danh sách sinh viên có học lực giỏi:"); 
     for(Student student : students) { 
         if(student.isExcellent()) { 
             System.out.println(student); 
         } 
     } 
   }

   static void sapXep() { 
     if(students.isEmpty()) { 
         System.out.println("Danh sách sinh viên trống."); 
         return; 
     } 

     students.sort(Comparator.comparingDouble(Student::getScore).reversed()); // Sắp xếp theo điểm giảm dần
     System.out.println("Danh sách sinh viên sau khi sắp xếp theo điểm:"); 
     xuat(); 
   }
}
    

