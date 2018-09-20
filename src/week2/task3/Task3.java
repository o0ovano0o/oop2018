package week2.task3;

class Dog{
    private int age;
    private String name,sex;
    public void setname(String name){
        this.name=name;
    }
    public String getname(){
        return name;
    }
    public void setage(int age){
        this.age=age;
    }
    public int getage(){
        return age;
    }
     public void setsex(String sex){
        this.sex=sex;
    }
    public String getsex(){
        return sex;
    }
    public Dog(String n,int a, String s){
        name=n;
        age=a;
        sex=s;
    }
    public void showInfo(){
        System.out.println("Dog: "+name+" age: "+age+ " sex: "+sex);
    }
    public void bark(){
        System.out.println(name+" : gaauuu gaauuuuu gaauuuuuu ");
    }
    public String mating(Dog a){
        if(!a.getsex().equals(sex))
            return "Success!!! They can hava a puppy!!!!";
        else
            return "Sorry!!! They have the same sex !!!" ;
    }
}
class Human{
    private int age, weight;
    private float height;
    String name;
    public void setname(String name){
        this.name=name;
    }
    public String getname(){
        return name;
    }
    public void setage(int age){
        this.age=age;
    }
    public int getage(){
        return age;
    }
     public void setweight(int weight){
        this.weight=weight;
    }
    public int getweight(){
        return weight;
    }
     public void setheight(float height){
        this.height=height;
    }
    public float getheight(){
        return height;
    }
    public Human(String name, int age,float height, int weight){
        this.name=name;
        this.age=age;
        this.height=height;
        this.weight=weight;
    }
    public void BMI(){
        float bmi= weight/(height*height);
        if(bmi<18.5)
            System.out.println("Bạn khá gầy!!! hãy ăn nhiều hơn để có sức khỏe tốt!!^^");
        else if(bmi<25)
               System.out.println("Bạn khá cân đối !!! hãy ăn uống hợp lí để duy trì được vóc dáng hiện tại!!!^^"); 
        else if(bmi<30)
            System.out.println("Bạn hơi mũm mĩn!!! hãy ăn uống hợp lí hơn để có vóc dáng đẹp!!!^^");
        else if(bmi<35)
            System.out.println("Bạn béo phì cấp độ 1!!!Có nguy cơ mắc bênh!!! hãy ăn ít hơn để có vóc dáng cân đối!!!^^");
        else if(bmi<40)
            System.out.println("Bạn béo phì cấp độ 2!!! Nguy cơ mắc bệnh cao!!! hãy kiềm chế ăn uống!!!^^");
        else
            System.out.println("Bạn béo phì cấp độ 3!!! Quá nguy hiểm!!!hãy ăn ít lại khi còn kịp");
    }
    public void showInfo(){
        System.out.println("Name: "+name +" age: "+ age+" height: "+height+"m weight: "+weight+" kg");
    }
    public void checkhage(){
        if(age>=18)
            System.out.println(name+" đã có quyền công dân rồi nhé!!! Chúc mừng!!!");
        else
            System.out.println(name+" chưa có quyền công dân đâu!!! Đợi đủ tuổi đã nhé!!!");
    }
}
class Student{
    private int toan,anh,van;
    private String name;
    public void setname(String name){
        this.name=name;
    }
    public String getname(){
        return name;
    }
    public void settoan(int toan){
        this.toan=toan;
    }
    public int gettoan(){
        return toan;
    }
    public void setanh(int anh){
        this.anh=anh;
    }
    public int getanh(){
        return anh;
    }
    public void setvan(int van){
        this.van=van;
    }
    public int getvan(){
        return van;
    }
    public Student(String name,int toan,int van, int anh){
        this.name=name;
        this.toan=toan;
        this.anh=anh;
        this.van=van;
    }
    public float dtb(){
        return (float)(toan+anh+van)/3;
    }
    public void showInfo(){
        System.out.println("Name: "+name+" Toan: "+ toan+ " Anh: "+anh+" Van: "+van);
    }
    public void compare(Student a){
        if(this.dtb()>a.dtb())
            System.out.println(this.name+" kết quả học tập tốt hơn "+a.name);
        else 
            System.out.println(a.name+" kết quả học tập tốt hơn "+this.name);
    }
    
}
public class Task3 {
    
    
    public static void main(String[] args) {
        //Dog
        Dog lili= new Dog("lili",3,"female");
        Dog jim=new Dog("jim",4,"male");
        System.out.println("***class Dog***");
        lili.showInfo();
        lili.bark();
        System.out.println(lili.getname()+" mating "+jim.getname()+"\n"+lili.mating(jim));
        //Human
        Human vananh= new Human("Vân Anh", 19,1.71f, 53);
        System.out.println("***class Human***");
        vananh.showInfo();;
        vananh.BMI();
        vananh.checkhage();
        //Student
        Student vanvan= new Student("Vân Anh", 9, 6, 6);
        Student oppa = new Student("Oppa",10,10,9);
        System.out.println("***class Student***");
        vanvan.showInfo();
        System.out.println("Điểm trung bình của "+vanvan.getname()+" : "+ vanvan.dtb());
        vanvan.compare(oppa);
        
        
    }
    
}
