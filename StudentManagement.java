import java.util.ArrayList;

public class StudentManagement {
    ArrayList<Student> students;
    public StudentManagement(){
        students = new ArrayList<>();
        students.add(new Student(3384, "Vamsi", "AI&ML"));
        students.add(new Student(3367, "saketh", "CSE"));
        students.add(new Student(3354, "Praveen", "AI&DS"));
        students.add(new Student(3387, "prakash", "CSE(DS)"));
        students.add(new Student(3399, "Vara Prasad", "MECHANICAL"));

    }

    public void addStudent(Student stud){
        students.add(stud);
    }

    
}
