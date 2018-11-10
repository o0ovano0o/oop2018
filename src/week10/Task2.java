package week10;

import java.util.Random;

public class Task2 {
    double[] a = new double[1000];
    public void initdata(){
        Random ra = new Random();
        double start = 1;
        double end = 10000;
        for(int i=0;i<a.length;i++){
            a[i]=start + (ra.nextDouble()* (end - start));
        }
    }
    public void bubbleSort() {
        double temp;
        for(int i=0; i<a.length-1; i++) {
            for(int j=0; j<a.length-1-i; j++) {
                if(a[j] > a[j+1]) {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }
    public void printAll(){
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    public static void main(String[] args) {
        Task2 task2 = new Task2();
        task2.initdata();
        System.out.println("before");
        task2.printAll();
        task2.bubbleSort();
        System.out.println("after");
        task2.printAll();
    }
}
