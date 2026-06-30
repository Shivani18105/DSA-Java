package StringBuilder;
import java.util.Scanner;

public class reverseHalfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.next();
        int n = s.length();
        int mid = n/2;

        if (n%2!=0){
            System.out.println("Enter even length string");

        }
        else {
            mid=n/2;

            System.out.println("Result:");
            for (int i = 0; i < mid; i++) {
                System.out.print(s.charAt(i));

            }
            for (int i = n-1; i >=mid; i--) {
                System.out.print(s.charAt(i));

            }
        }

    }
}
