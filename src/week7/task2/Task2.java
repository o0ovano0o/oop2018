package week7.task2;

import week7.task1.Addition;
import week7.task1.Division;
import week7.task1.Expression;
import week7.task1.Square;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task2 {
    String[] a;
    String[] b = new String[5];
    public void NullPointerException() throws NullPointerException{
            System.out.println(a.length);
    }
    public  void  Arrayindexofboundexception() throws  ArrayIndexOutOfBoundsException{
        System.out.println(b[9]);
    }
    public  void ArithmeticException() throws  ArithmeticException{
        int s=5/0;
    }
    public void ClassCastException() throws ClassCastException{

        throw  new ClassCastException();
    }
    public void IOException() throws IOException {
        throw new IOException("lỗi");
    }
    public void FilenotFound() throws FileNotFoundException{
        File file = new File("file.txt");
        FileReader filereader = new FileReader(file);
//        throw  new FileNotFoundException();
    }
    public static void main(String[] args) {
        Task2 test = new Task2();
        try {
            test.NullPointerException();
        }catch (Exception e){
            System.out.println(e.toString());
        }
        try {
            test.Arrayindexofboundexception();
        }catch (Exception e){
            System.out.println(e.toString());
        }
        try {
            test.ArithmeticException();
        }catch (Exception e){
            System.out.println(e.toString());
        }
        try {
            test.ClassCastException();
        }catch (Exception e){
            System.out.println(e.toString());
        }
        try {
            test.IOException();
        }catch (Exception e){
            System.out.println(e.toString());
        }
        try {
            test.FilenotFound();
        }catch (Exception e){
            System.out.println(e.toString());
        }
    }
}
