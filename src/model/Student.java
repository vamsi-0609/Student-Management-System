package model;

public class Student {

    int id;
    int roll;
    String name;
    String branch;
    double cgpa;

    public Student(int roll, String name, String branch, double cgpa) {
        this.branch = branch;
        this.cgpa = cgpa;
        this.name = name;
        this.roll = roll;
    }

    

    public Student() {
    }

    public Student(int id, int roll, String name, String branch, double cgpa) {
        this.branch = branch;
        this.cgpa = cgpa;
        this.id = id;
        this.name = name;
        this.roll = roll;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student{");
        sb.append("id=").append(id);
        sb.append(", roll=").append(roll);
        sb.append(", name=").append(name);
        sb.append(", branch=").append(branch);
        sb.append(", cgpa=").append(cgpa);
        sb.append('}');
        return sb.toString();
    }

    
    


}