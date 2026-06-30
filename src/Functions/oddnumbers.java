package Functions;
import java.util.Scanner;
// Given two numbers a and b, write a method to print all odd numbers between them.

public class oddnumbers {
    public static void allOddNumbers(int a, int b){

         int start=a;
         if(a%2==0){
             a++;
        }else{
             System.out.println(a);
             start++;
         }
         for( int i=a; i<=b;i+=2){
             System.out.println(i);
         }

        return;

    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        allOddNumbers(a,b);

    }
}
