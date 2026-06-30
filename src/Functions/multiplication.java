package Functions;
import java.util.Scanner;
public class multiplication {
    public static int calculate(int a, int b){
        int mul= a*b;
        return mul;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int mul=calculate(a,b);
        System.out.println("Multiplication:"+mul);


    }
}
