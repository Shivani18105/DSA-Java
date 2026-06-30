package Recursion;
import java.util.Scanner;

public class mazePath {
    public static int maze(int m,int n){
        if (m==1  || n==1) return 1;
        int rightWays = maze(m, n-1);
        int leftWays = maze(m-1, n);
        return  rightWays + leftWays;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter m:");
        int m = sc.nextInt();
        System.out.println("Enter n:");
        int n = sc.nextInt();
        System.out.println(maze(m,n));

    }
}
