package Recursion;
import java.util.Scanner;

public class powerUsingRecur {
    public static int power(int a, int b){
        if (a==0 && b==0) {
            System.out.println("not defined");
            return 0;
        }
        if( a!=0 && b==0) return 1;
        int ans = a * power(a, b-1);
        return ans;

    }

    public static int power2(int a, int b){
        if(a==0 && b==0) return -1;
        if(b==0) return 1;
        int ans= power2(a, b/2);
        if (b%2==0) return ans * ans;
        else return ans * ans* a;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter a:");
        int a = sc.nextInt();
        System.out.println("Enter b:");
        int b = sc.nextInt();
//        System.out.println(power(a,b));
        System.out.println(power2(a,b));
    }
}
