package sinhvien;

public class Student {
    private String name, id, group, email;
    //Getter and setter properties name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    //Getter and setter properties id
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    //Getter and setter properties group
    public String getGroup() {
        return group;
    }
    public void setGroup(String group) {
        this.group = group;
    }
    //Getter and setter properties email
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    //This function return the information of student
    String getInfo() {
        return name + " " + id + " " + group + " " + email;
    }
    public Student(){					//Initialization with no parameters
        name = "Student";
        id = "000";
        group = "K59CB";
        email = "uet@vnu.edu.vn";
    }
    public Student(String n, String sid, String gr, String em){		//Initialization with parameters
        name = n;
        id = sid;
        group = gr;
        email = em;
    }
    public Student(Student s){				//Initialization copy from s
        name = s.name;
        id = s.id;
        group = s.group;
        email = s.email;
    }
}
