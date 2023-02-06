package Students;
import java.util.*;
 class Student extends Section {

     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number of students");
         int n = sc.nextInt();
         System.out.println("Enter the student details");
         StudentDetails(n);
         Changes();
         System.out.println("Thanks for information");
     }

     static void StudentDetails(int n) {
         Scanner sc = new Scanner(System.in);
         for (int i = 0; i < n; i++) {
             System.out.println("Student no " + (i));
             System.out.print("Name: ");
             Section.Student.add(i, sc.next());
             System.out.print("USN: ");
             Section.USN.add(i, sc.next());
             System.out.println("Section: ");
             Section.Sections.add(i, sc.next());

         }
         System.out.println("Enter the respective faculty details");
         FacultyDetails(n);

     }

     static void FacultyDetails(int n) {
         Scanner sc = new Scanner(System.in);
         for (int i = 0; i < n; i++) {
             System.out.println("Faculty details " + i);
             System.out.println("Enter faculty name: ");
             Section.Faculty.add(i, sc.next());
             System.out.println("Enter the Mentor name: ");
             Section.Mentor.add(i, sc.next());
         }


     }

     static void Changes() {
         Scanner sc = new Scanner(System.in);
         System.out.println("Is there any changes if yes press Y no press N");
         char a = sc.next().charAt(0);
         if (a == 'Y' || a == 'y') {

             System.out.println("1.Name \n 2.USN \n 3.Section \n 4.Faculty name \n 5.Mentor name");
             System.out.println("Enter the details to modify");
             int b = sc.nextInt();
             System.out.println("Enter the student number");
             int d = sc.nextInt();
             switch (b) {
                 case 1:
                     System.out.println("Enter the new name");
                     Section.Student.set(d, sc.next());
                     break;
                 case 2:
                     System.out.println("Enter the new USN");
                     Section.USN.set(d, sc.next());
                     break;
                 case 3:
                     System.out.println("Enter the new section");
                     Section.Sections.set(d, sc.next());
                     break;
                 case 4:
                     System.out.println("Enter the faculty name");
                     Section.Faculty.set(d, sc.next());
                     break;
                 case 5:
                     System.out.println("Entre the new mentor");
                     Section.Mentor.set(d, sc.next());
                     break;

             }
             System.out.println("After correction details are");
             for (int i = 0; i < Section.Student.size(); i++) {
                 System.out.println("Name: " + Section.Student.get(i));
                 System.out.println("USN: " + Section.USN.get(i));
                 System.out.println("Section: " + Section.Sections.get(i));
                 System.out.println("Faculty name: " + Section.Faculty.get(i));
                 System.out.println("Mentor: " + Section.Mentor.get(i));


             }

         } else {
             System.out.println("Student details are");
             for (int i = 0; i < Section.Student.size(); i++) {
                 System.out.println("Name: " + Section.Student.get(i));
                 System.out.println("USN: " + Section.USN.get(i));
                 System.out.println("Section: " + Section.Sections.get(i));
                 System.out.println("Faculty name: " + Section.Faculty.get(i));
                 System.out.println("Mentor: " + Section.Mentor.get(i));
             }

         }
     }
 }
