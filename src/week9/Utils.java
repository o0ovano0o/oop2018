package week9;

import java.io.*;
import java.util.Scanner;

public class Utils {
    public static String readContentFromFile(String path) {
        File file = new File(path);
        FileReader fr = null;
        String a="";
        String line="";
        try {
            fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            while((line=br.readLine())!=null){
                a+=line;
            }
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return a;
    }
    public static void bwriteContenttoFile(String path){
        File file = new File(path);
        try {
            FileWriter fw = new FileWriter(file);
            Scanner input = new Scanner(System.in);
            String a = input.nextLine();
            fw.write(a);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void cwriteContenttoFile(String path){
        File file = new File(path);
        try {
            FileWriter fw = new FileWriter(file,true);
            Scanner input = new Scanner(System.in);
            fw.write(input.nextLine());
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static File findFileByName(String folderPath,String filename){
        File file = new File(folderPath+"/"+filename);
        try {
            FileReader fr = new FileReader(file);
            System.out.println("Tìm file thành công");
          } catch (FileNotFoundException e) {
            System.out.println("Không tồn tại file có tên "+ filename);
        }

        return file;
    }

    public static void main(String[] args) {
        System.out.println(Utils.readContentFromFile("vanvan.txt"));
       Utils.bwriteContenttoFile("vanvan.txt");
       //Utils.cwriteContenttoFile("vanvan.txt");
      File f = Utils.findFileByName("C:\\Users\\Administrator\\IdeaProjects\\oop2018","vvan.txt");
    }

}
