public class Student {
    private int id;
    private String name;
    private String branch;

    


    public Student() {
    }

    public Student(int id, String name, String branch) {
        this.branch = branch;
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student{");
        sb.append("id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", branch=").append(branch);
        sb.append('}');
        return sb.toString();
    }

   




}
