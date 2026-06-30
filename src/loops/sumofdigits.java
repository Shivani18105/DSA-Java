package loops;
import java.util.Scanner;
public class sumofdigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();

        for(int i=n; i<=n*10; i += n )

             System.out.println(i + " ");



    }



}
