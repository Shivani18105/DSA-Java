package StringBuilder;
import java.util.Arrays;
import java.util.Scanner;

public class validAnagram {
    public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
        System.out.println("Enter stirng 1:");
        String str1= sc.next();
        System.out.println("Enter string 2:");
        String str2 = sc.next();
        if (str1.length()!=str2.length()){
            System.out.println("not anagrams");
        }

        char[] ch1 = str1.toCharArray();
        Arrays.sort(ch1);

        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch2);

        for (int i = 0; i <str1.length(); i++) {
            if(ch1[i]!=ch2[i]) {
                System.out.println("not anagrams");
            }

        }
        System.out.println("anagrmas" );
    }
}
