import java.util.*;

class Student {
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
    public Student(String n, String sid, String em){		//Initialization with parameters
        name = n;
        id = sid;
        group = "K59CB";
        email = em;
    }
    public Student(Student s){				//Initialization copy from s
        name = s.name;
        id = s.id;
        group = s.group;
        email = s.email;
    }
}

public class StudentManagement {
        //Compare groups of 2 students
    public static boolean sameGroup(Student s1, Student s2) {
        String gr1 = s1.getGroup();
        String gr2 = s2.getGroup();
        return (gr1.equals(gr2)); //Compare 2 string, use 'equals' return "true" or "false"
    }
    public static int numberStudents = 4;
    static Student [] list = new Student[100];

    //Print the list of students by group
    public static void studentsByGroup() {
        for(int i = 0; i < numberStudents; i++)
            System.out.println(list[i].getInfo());
    }

        //Remove student by id
        public static void removeStudent(String id){
            int ktra = numberStudents;
            for(int i = 0; i < numberStudents; i++){
                if(list[i].getId() == id) {
                    for(int j = i; j < numberStudents - 1; j++)
                        list[j] = new Student(list[j+1]);   		//delete list
                    numberStudents--;
                    i--;											//check part 2
                }
            }
            if(ktra == numberStudents) System.out.println("Can't not find");
        }

    public static void main(String[] args) {
        /*
         //Question 5-6 Check getInfo
        Student test = new Student("Khoi", "17021160", "hk@gmail.com");
        System.out.println(test.getInfo());
        */

        /*
         //Question 7-8 Check constructor
        Student s1 = new Student();
        System.out.println(s1.getInfo());
        Student s2 = new Student("Khoi", "17021160", "hk@gmail.com");
        System.out.println(s2.getInfo());
        Student s3 = new Student(s2);
        System.out.println(s3.getInfo());
        */

        /*
         //Question 9-10 Check sameGroup
        Student sv1 = new Student();
        Student sv2 = new Student("Khoi", "17021160", "hk@gmail.com");
        System.out.println(sameGroup(sv1, sv2));
        */

        list[0] = new Student("Giang", "17020706", "g@gmail.com");
        list[1] = new Student("Hoan", "17020701", "h@gmail.com");
        list[2] = new Student("Duc", "17020702", "d@gmail.com");
        list[3] = new Student("Ky", "17020703", "k@gmail.com");
        removeStudent("17020709");
        studentsByGroup();
    }
}
