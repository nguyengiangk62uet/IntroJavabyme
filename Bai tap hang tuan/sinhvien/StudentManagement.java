package sinhvien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManagement {
    //Compare groups of 2 students
    public boolean sameGroup(Student s1, Student s2) {
        String gr1 = s1.getGroup();
        String gr2 = s2.getGroup();
        return (gr1.equals(gr2)); //Compare 2 string, use 'equals' return "true" or "false"
    }
    public static List<Student> danhsach = new ArrayList<>();
    public static Scanner scan = new Scanner(System.in);

    //Input the student's informations
    public void inputStudent (int n) {
        String name, id, group, email;
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập tên, mã số, lớp, email: ");
            name = scan.nextLine();
            id = scan.nextLine();
            group = scan.nextLine();
            email = scan.nextLine();
            Student svm = new Student(name, id, group, email);
            danhsach.add(svm);
        }
    }
    //Print the list of students
    public void outputStudent() {
        int sz = danhsach.size();
        for (int i = 0; i < sz; i++) {
            System.out.println("Name: " + danhsach.get(i).getName());
            System.out.println("ID: " + danhsach.get(i).getId());
            System.out.println("Group: " + danhsach.get(i).getGroup());
            System.out.println("Email: " + danhsach.get(i).getEmail() + "\n");
        }
    }
    //Print the list of students by group
    public static void studentsByGroup() {
        List<Student> ds = new ArrayList<>(danhsach);
        while (! ds.isEmpty()) {
            int i = 0;
            String gr = ds.get(i).getGroup();
            System.out.println("Sinh viên thuộc lớp " + gr + ": ");
            for (int k = 0; k < ds.size(); ) {
                if (ds.get(k).getGroup().equals(gr)) {
                    System.out.println(ds.get(k).getInfo());
                    ds.remove(k);
                }
                else k++;
            }
        }
    }

    //Remove student by id
    public static void removeStudent(String id){
        int sz = danhsach.size();
        Student xoa = null;
        for (int i = 0; i < sz; i++) {
            if (danhsach.get(i).getId() == id)
                xoa = danhsach.get(i);
            break;
        }
        if (xoa != null) danhsach.remove(xoa);
        else System.out.println("Can't find.");
    }

    public static void main(String[] args) {
        StudentManagement sm = new StudentManagement();
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
        System.out.println(sm.sameGroup(sv1, sv2));
        */

        System.out.println("Số sinh viên cần thêm: ");
        int n = scan.nextInt();
        scan.nextLine();
        sm.inputStudent(n);
        sm.outputStudent();
        studentsByGroup();
    }
}