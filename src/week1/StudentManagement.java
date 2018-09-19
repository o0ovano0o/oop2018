package week1;


import java.util.HashSet;


public class StudentManagement {


    int n = 0;// số đối tượng có trong mảng
    private Student[] students = new Student[100];

    public static boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());

    }

    void studentsByGroup() {
        HashSet<String> hs = new HashSet<String>();
        for (int i = 0; i < n; i++) {
            hs.add(students[i].getGroup());
        }
        Object[] groups = hs.toArray();
        for (Object group : groups) {
            for (int i = 0; i < n; i++) {
                if (group.equals(students[i].getGroup()))
                    students[i].getInfo();
            }
        }
    }
        void removeStudent(String id){

            for (int i = 0; i < n; i++) {
                if (students[i].getId().equals(id)) {
                    for (int j = i; j < n - 1; j++) {
                        students[j].setName(students[j + 1].getName());
                        students[j].setId(students[j + 1].getId());
                        students[j].setGroup(students[j + 1].getGroup());
                        students[j].setEmail(students[j + 1].getEmail());
                    }
                    n -= 1;
                    System.out.println("***Deleted***");
                    return;
                }
            }
            System.out.println("***Not found***");
        }

        public static void main (String[] args ){
            Student me1 = new Student();
            me1.setGroup("INT22042");
            Student me2 = new Student("Opppaaaa", "17020555", "iloveyou@gmail.com");
            Student me3 = new Student(me2);
            me1.getInfo();
            me2.getInfo();
            me3.getInfo();
            System.out.println(sameGroup(me1, me2));
            System.out.println(sameGroup(me2, me3));
            //test studentsByGroup
            StudentManagement sv = new StudentManagement();
            sv.n=10;
            for (int i = 0; i < sv.n; i++) {
                sv.students[i] = new Student();
                sv.students[i].setId(i + "abc");
            }
            for (int i = 1; i < sv.n; i += 2) {
                sv.students[i].setGroup("INT22042");
            }
            System.out.println("*****original data*****");
            for (int i = 0; i < sv.n; i++) {
                sv.students[i].getInfo();
            }
            System.out.println("*****Sort by group*****");
            sv.studentsByGroup();
           // remove ID
            String idrm="5abc";
            System.out.println("***Remove "+idrm+"***");
            sv.removeStudent(idrm);
            for (int i = 0; i < sv.n; i++) {
                sv.students[i].getInfo();
            }


        }
    }


