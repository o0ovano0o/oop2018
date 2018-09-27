package week2.task1;

import java.util.Scanner;

public class Task1 {

    public static int gcd(int a, int b) {
        if(a%b==0) return Math.abs(b);
        else return gcd(b,a%b);
    }

    public static int fibonacci(int n) {
        if(n==1||n==0) return n;
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Moi nhap hai so a b: ");
        int a=scanner.nextInt(),b=scanner.nextInt();
        System.out.println("USCLN cua a va b: "+gcd(a,b));
        System.out.print("Moi nhap so n: ");
        int n=scanner.nextInt();
        System.out.println("So fibonacci o vi tri n la: "+fibonacci(n));
    }
}
