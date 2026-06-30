package String;
import java.util.*;

public class anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter str1: ");
        String str1 = sc.nextLine();

        System.out.println("Enter str2:" );
        String str2 = sc.nextLine();

        boolean flag = true;
        if (str1.length() != str1.length()) flag = false;

        int[] count = new int[str1.length()];

        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i) - 'a']++;
            count[str2.charAt(i)- 'a']--;
        }
        for (int num : count) {
            if (num != 0) {
                flag = false;
            }
        }

      flag = true;

       if (flag == true) System.out.println("valid");
       else System.out.println("not valid");


    }
}
