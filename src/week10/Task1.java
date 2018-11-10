package week10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public List<String> getAllFunction(String path){
        File file = new File(path);
        FileReader fr = null;
        List<String> a = new ArrayList<String>();
        String line="";
        String b="";
        try {
            fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            while((line=br.readLine())!=null) {
                if(line.indexOf("static")>0) {
                    a.add(line);
                }
            }
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return a;
    }
    public String getFinctionbyname(String name){
        return null;
    }
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        ArrayList<String> method1= (ArrayList<String>) task1.getAllFunction("C:\\Users\\Administrator\\IdeaProjects\\oop2018\\src\\week9\\Utils.java");
        for(int i=0;i<method1.size();i++){
            System.out.println(method1.get(i));
        }
    }
}
