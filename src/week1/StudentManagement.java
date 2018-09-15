package week1;

public class StudentManagement {

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
    int max = 100;
    private Student[] students = new Student[max];
    public boolean sameGroup(Student s1, Student s2) {
        // TODO:
        if(s1.getGroup().equals(s2.getGroup()))
            return true;
        return false;
    }

    void studentsByGroup() {
        // TODO:

    }

    void removeStudent(String id) {
        // TODO:
        for(int i=0;i<max;i++){
            if(students[i].getId().equals(id)){
                for(int j=i; j<max;j++){
                    students[j].setName(students[j+1].getName());
                    students[j].setId(students[j+1].getId());
                    students[j].setGroup(students[j+1].getGroup());
                    students[j].setEmail(students[j+1].getEmail());
                }
//                students[i].setName("Student");
//                students[i].setId("000");
//                students[i].setGroup("INT22041");
//                students[i].setEmail("uet@vnu.edu.vn");
                max-=1;
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
        StudentManagement st = new StudentManagement();
        me1.getInfo();
        me2.getInfo();
        me3.getInfo();
        System.out.println(st.sameGroup(me1,me2));
        System.out.println(st.sameGroup(me2,me3));
        
    }
}
