package week1;

public class Student {


    private String name,id,group,email;

    public void setName(String name){this.name=name;}
    public String getName(){return name;}
    public void setId(String id){this.id=id;}
    public String getId(){return id;}
    public void setGroup(String group){this.group=group;}
    public String getGroup(){return group;}
    public void setEmail(String email){this.email=email;}
    public String getEmail(){return email;}

    public Student() {

        name="Student";
        id="000";
        group="INT22041";
        email="uet@vnu.edu.vn";
    }

    public Student(String n, String sid, String em) {
        name=n;
        id=sid;
        email=em;
        group="INT22041";
    }

    public Student(Student s) {
        this.name=s.name;
        this.id=s.id;
        this.group=s.group;
        this.email=s.email;
    }

    public void getInfo() {
        // em đánh dấu * cho dễ nhìn ạ
        System.out.println("* "+"Name: "+this.name);
        System.out.println("ID: "+this.id);
        System.out.println("Group: "+this.group);
        System.out.println("Email: "+this.email);
    }
}
