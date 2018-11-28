package week12;

import java.util.ArrayList;

interface Family {
    public String showinfo();
    public ArrayList<Family> getChildren();
    public boolean add(Family c);
}

class Couple implements Family {
    private String wife,husband;
    private ArrayList<Family> families = new ArrayList<Family>();

    public Couple(String name1, String name2){
        this.wife = name1;
        this.husband=name2;
    }
    public String getWife() {
        return wife;
    }

    public void setWife(String wife) {
        this.wife = wife;
    }

    public String getHusband() {
        return husband;
    }

    public void setHusband(String husband) {
        this.husband = husband;
    }
    public String showinfo() {
        String s ="("+ wife + " and " + husband+":" ;
        for (Family child: getChildren())
            s += " " + child.showinfo()+",";
        return s+")" ;
    }

    public ArrayList<Family> getChildren()       { return families; }
    public boolean add(Family c)        { return families.add(c); }

}


class Single implements Family {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Single(String name)              { this.name = name; }

    public String showinfo()                   { return name; }
    public ArrayList<Family> getChildren()       { return null; }
    public boolean add(Family c)        { return false; }

}

public class Task1 {

    public static String showSingle(Family i) {
        String s ="" ;
        for (Family child: i.getChildren()){
            if(child instanceof Single)
                s += ((Single) child).getName()+" ";
            else
                s+=showSingle(child)+" ";
        }
        return s;
    }


    public static void showCouple(Family i) {
        String s = ((Couple) i).getHusband()+" and "+((Couple) i).getWife()+" ;";
        for (Family child: i.getChildren()){
            if(child instanceof Couple)
                s += ((Couple) child).getWife()+" and " +((Couple) child).getHusband()+" ;";
        }
        System.out.println("Couple: "+s);
    }



    public static String showNew(Family m) {
        String s ="" ;
        for (Family child: m.getChildren()){
            if(child instanceof Single)
                s += ((Single) child).getName()+" ";
            else
                s=showSingle(child);
        }
        return s;
    }
    public static void main(String[] args) {
        Couple jamehana = new Couple("Jame","Hana");
        Single ryan = new Single("Ryan");
        Couple kaijen = new Couple("Kai","Jen");
        jamehana.add(ryan);
        jamehana.add(kaijen);
        Single mice = new Single("Mice");
        Single kitty = new Single("Kitty");
        kaijen.add(mice);
        kaijen.add(kitty);
        System.out.println(jamehana.showinfo());
        System.out.println("Single: "+showSingle(jamehana));
        showCouple(jamehana);
        System.out.println("New:"+showNew(jamehana));
    }
}