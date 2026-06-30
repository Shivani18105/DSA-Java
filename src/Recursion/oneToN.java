package Recursion;
import java.util.Scanner;

public class oneToN {

    public static void print(int n ){
        if(n==0) return;
        System.out.println(n);
        print(n-1);
        //By Interchanging above two lines we can obtain reverse printing
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.println("Enter n:");
        int n = sc.nextInt();
        print(n);
    }

}
