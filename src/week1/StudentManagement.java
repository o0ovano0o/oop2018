package week1;

import java.util.HashMap;
import java.util.Set;

public class StudentManagement {

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
    int max = 100;
    private Student[] students = new Student[max];

    public boolean sameGroup(Student s1, Student s2) {
        // TODO:
        if (s1.getGroup().equals(s2.getGroup()))
            return true;
        return false;
    }

    void studentsByGroup() {
        // TODO:
        // Dùng HashMap và Set....
//        HashMap<String, Student> map = new HashMap<String, Student>();
//        for (int i = 0; i < max; i++) {
//            map.put(students[i].getGroup(), students[i]);
//        }
//        Set<String> groups = map.keySet();
//        for (String group : groups) {
//            for (int i = 0; i < max; i++) {
//                if (group.equals(students[i].getGroup()))
//                    students[i].getInfo();
//            }
//        }
        String[] groups=new String[max];
        groups[0]=students[0].getGroup();
        boolean test =true;
        int z=1;
        for(int i=1;i<max;i++){
            test=true;
            for(int j=i-1;j>=0;j--){
                if(sameGroup(students[i],students[j]))
                {  test=false;
                   break;}
            }
            if(test){
                groups[z++]= students[i].getGroup();
            }
        }
        for(int j=0;j<z;j++){
            for(int i=0;i<max;i++){
                if(groups[j].equals(students[i].getGroup()))
                    students[i].getInfo();
            }
        }

    }

    void removeStudent(String id) {
        // TODO:
        for (int i = 0; i < max; i++) {
            if (students[i].getId().equals(id)) {
                for (int j = i; j < max - 1; j++) {
                    students[j].setName(students[j + 1].getName());
                    students[j].setId(students[j + 1].getId());
                    students[j].setGroup(students[j + 1].getGroup());
                    students[j].setEmail(students[j + 1].getEmail());
                }
                max -= 1;
                System.out.println("Deleted");
                return;
            }
        }
        System.out.println("Not found");
    }

    public static void main(String[] args) {
        // TODO:
        Student me1 = new Student();
        me1.setGroup("INT22042");
        Student me2 = new Student("Opppaaaa","17020555","iloveyou@gmail.com");
        Student me3 = new Student(me2);
        
        me1.getInfo();
        me2.getInfo();
        me3.getInfo();
        System.out.println(sameGroup(me1,me2));
        System.out.println(sameGroup(me2,me3));
//        // test studentsByGroup && removeStudent
//        StudentManagement sv = new StudentManagement();
//        for (int i = 0; i < sv.max; i++) {
//            sv.students[i] = new Student();
//            sv.students[i].setId(i + "abc");
//        }
//        for (int i = 1; i < sv.max; i += 2) {
//            sv.students[i].setGroup("INT22042");
//        }
//
//        for (int i = 0; i < sv.max; i++) {
//            sv.students[i].getInfo();
//        }
//        System.out.println("Sort by group");
//        sv.studentsByGroup();
//
//        sv.removeStudent("5abc");
//        for (int i = 0; i < sv.max; i++) {
//            sv.students[i].getInfo();
//            }


        }
    }

