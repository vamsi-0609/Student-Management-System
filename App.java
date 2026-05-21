import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        System.out.println("Student Mangement System");
        Student s = new Student();
        StudentManagement studs = new StudentManagement();
        Scanner sc = new Scanner(System.in);

        while (true) { 
            System.out.println("1.Display All Students\n2.Add new Student\n3.Search Student by ID\n4.Exit");
            System.out.print("Please enter the choice: ");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    for(Student std: studs.AllStudentInfo()){
                        System.out.println("ID: "+ std.getId() + " Name: " + std.getName() + " Branch: " + std.getBranch());
                    }
                    break;
                case 2:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Branch: ");
                    String branch = sc.nextLine();
                    studs.addStudent(new Student(id, name, branch));
                    System.out.println("Added the Student " + name + " with ID: " + id + " & Branch: "+ branch + " into database successfully.");
                    break;
                case 3:
                    System.out.print("Enter the Student ID to search the database: ");
                    int student_id = sc.nextInt();
                    Student searched_student = studs.searchStudent(student_id);
                    if(searched_student == null){
                        System.out.println("Student Not Found.");
                    }else{
                        System.out.println("Student Found!");
                        System.out.println("ID: "+ searched_student.getId() + " Name: " + searched_student.getName() + " Branch: " + searched_student.getBranch());
                    }

                case 4:
                    System.out.println("Exiting from the Student Management System Application");
                    return;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }   
        }
    }
}