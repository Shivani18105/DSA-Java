package StringBuilder;
import java.util.Scanner;
public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a string:");
        StringBuilder s = new StringBuilder(sc.nextLine());
        //Input a string and concatenate
        // with its reverse string and print it.

        StringBuilder rev = new StringBuilder(s);
        rev.reverse();

        StringBuilder result = new StringBuilder();
        result.append(s);
        result.append(rev);

        System.out.println(result);



    }
}
