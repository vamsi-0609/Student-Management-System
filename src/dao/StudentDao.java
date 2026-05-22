package dao;

import db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Student;

public class StudentDao{
    private PreparedStatement psmt;
    private Connection conn;
    private ResultSet result;
    
    public StudentDao(){
        DBConnection db = new DBConnection();
        conn = db.getConnection();
    }

    public void displayStudents(){
        try{
        String query = "SELECT * FROM students";
        psmt = conn.prepareStatement(query);
        result = psmt.executeQuery();
        while(result.next()){
            int id = result.getInt("id");
            int roll = result.getInt("roll");
            String name = result.getString("name");
            String branch = result.getString("branch");
            double cgpa = result.getDouble("cgpa");

            System.out.println("ID: " + id + " Roll: " + roll + " Name: " + name + " Branch: " + branch + " CGPA: " + cgpa);
        }
        } catch(Exception e){
            e.printStackTrace();
            
        }

    }

    public void addStudent(Student student){
        try {
            String query = "INSERT INTO students(roll, name, branch, cgpa) VALUES(?, ?, ?, ?)";
            psmt = conn.prepareStatement(query);
            psmt.setInt(1, student.getRoll());
            psmt.setString(2, student.getName());
            psmt.setString(3, student.getBranch());
            psmt.setDouble(4, student.getCgpa());
            int rows = psmt.executeUpdate();
            if(rows > 0){
                System.out.println("New Student data inserted Successfully");
            }else{
                System.out.println("Student Data is not inserted");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    public void deleteStudent(int id){
        try {
            String query = "DELETE FROM students WHERE id = ?";
            psmt = conn.prepareStatement(query);
            psmt.setInt(1, id);
            int rows = psmt.executeUpdate();
            if(rows > 0){
                System.out.println("Student data deleted Successfully");
            }else{
                System.out.println("Student Data is not deleted");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateStudent(Student student){
        try {
            String query = "UPDATE students SET roll = ?, name = ?, branch = ?, cgpa = ? WHERE id = ?";
            psmt = conn.prepareStatement(query);
            psmt.setInt(1, student.getRoll());
            psmt.setString(2, student.getName());
            psmt.setString(3, student.getBranch());
            psmt.setDouble(4, student.getCgpa());
            psmt.setInt(5, student.getId());
            int rows = psmt.executeUpdate();
            if(rows > 0){
                System.out.println("Student data updated Successfully");
            }else{
                System.out.println("Student Data is not updated");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void searchStudent(int id){
    try {
        String query = "SELECT * FROM students WHERE id = ?";
        psmt = conn.prepareStatement(query);
        psmt.setInt(1, id);

        result = psmt.executeQuery();

        if(result.next()){

            System.out.println("Student Found");
            System.out.println(
                "ID: " + result.getInt("id") +
                " Roll: " + result.getInt("roll") +
                " Name: " + result.getString("name") +
                " Branch: " + result.getString("branch") +
                " CGPA: " + result.getDouble("cgpa")
            );

        } else {
            System.out.println("Student Not Found");
        }

    } catch(Exception e){
        e.printStackTrace();
    }
}


}