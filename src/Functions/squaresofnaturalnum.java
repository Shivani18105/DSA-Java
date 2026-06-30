package Functions;
import java.util.Scanner;
public class squaresofnaturalnum {
    public static void squares(int n){
        int a=0;
        int square=0;
        for(int i=0; i<=n; i++) {
            square=(n-i)*(n-i);
            a+=square;


        }
        System.out.println("Sum:"+a);
        return;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        squares(n);
    }
}
