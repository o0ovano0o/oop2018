package week1;

public class Student {

    // TODO: khai báo các thuộc tính cho Student
    private String name,id,group,email;
    // TODO: khai báo các phương thức getter, setter cho Student
    public void setName(String name){this.name=name;}
    public String getName(){return name;}
    public void setId(String id){this.id=id;}
    public String getId(){return id;}
    public void setGroup(String group){this.group=group;}
    public String getGroup(){return group;}
    public void setEmail(String email){this.email=email;}
    public String getEmail(){return email;}
    /**
     * Constructor 1
     */
    Student() {
        // TODO:
    }

    /**
     * Constructor 2
     * @param n
     * @param sid
     * @param em
     */
    Student(String n, String sid, String em) {
        // TODO:
    }

    /**
     * Constructor 3
     * @param s
     */
    Student(Student s) {
        // TODO:
    }

    public void getInfo() {
        // TODO:
        System.out.println("Name: "+this.name);
        System.out.println("ID: "+this.id);
        System.out.println("Group: "+this.group);
        System.out.println("Email: "+this.email);
    }
}
