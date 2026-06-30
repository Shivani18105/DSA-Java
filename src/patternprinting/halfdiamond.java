package patternprinting;
import java.util.Scanner;
//        *
//        **
//        ***
//        ****
//        ***
//        **
//        *
//
public class halfdiamond {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();

  //      int nsp=0;
        int nst=1;
        for(int i=1; i<=n; i++) {
            for (int j = 1; j <= nst; j++) {
                System.out.print("*" + " ");
            }
            nst++;

            System.out.println();
        }

        nst=n-1;
        for(int i=1; i<=n; i++) {
            for (int j = 1; j <= nst; j++) {
                System.out.print("*" + " ");
            }
            nst--;

            System.out.println();
        }





    }
}
