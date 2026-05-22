
import dao.StudentDao;
import java.util.Scanner;
import model.Student;

public class Main{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Student Mangement System");
        StudentDao std = new StudentDao();

        while (true) { 
            System.out.println("1.Display All Students\n2.Add new Student\n3.Search Student by ID\n4.Update Student\n5.Delete student by Id\n6.Exit");
            System.out.print("Please enter the choice: ");
            int choice = sc.nextInt();
            switch(choice) {
                case 1 -> {
                    std.displayStudents();
                }
                case 2 -> {
                    System.out.print("Enter Roll: ");
                    int roll = sc.nextInt();sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Branch: ");
                    String branch = sc.nextLine();
                    System.out.print("Enter CGPA: ");
                    double cgpa = sc.nextDouble();

                    std.addStudent(new Student(roll, name, branch, cgpa));
                    System.out.println("Added the Student " + name + " with Roll: " + roll + " & Branch: "+ branch + " into database successfully.");
                }
                case 3 -> {
                    System.out.print("Enter the Student ID to search the database: ");
                    int student_id = sc.nextInt();
                    std.searchStudent(student_id);
                }
                case 4 -> {
                    System.out.print("Enter Existing Student ID to update: ");
                    int existing_id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Student Roll to update: ");
                    int new_roll = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter New Name: ");
                    String new_name = sc.nextLine();

                    System.out.print("Enter New Branch: ");
                    String new_branch = sc.nextLine();

                    System.out.print("Enter CGPA: ");
                    double new_cgpa = sc.nextDouble();

                    std.updateStudent(new Student(existing_id, new_roll, new_name, new_branch, new_cgpa));

                }
                case 5 -> {
                    System.out.print("Enter the Student ID to delete: ");
                    int student_id = sc.nextInt();
                    std.deleteStudent(student_id);
                }
                case 6 -> {
                    System.out.println("Exitting from the Application of Student Database Management System");
                    sc.close();
                    return;
                }
                default -> System.out.println("Invalid Choice");
            }
        }
    }
}