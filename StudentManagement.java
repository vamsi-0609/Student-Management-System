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

    public ArrayList<Student> AllStudentInfo(){
        return students;
    }

    public Student searchStudent(int id){
        for (Student s: students){
            if(s.getId() == id){
                return s;
            }
        }
        return null;
    }

    public boolean updateStudent(int id, String newName, String newBranch){

    for(Student s : students){

        if(s.getId() == id){

            s.setName(newName);
            s.setBranch(newBranch);

            return true;
        }
    }

    return false;
}
}
