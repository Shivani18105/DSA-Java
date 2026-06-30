package StringBuilder;
import java.util.Locale;
import java.util.Scanner;

public class substringContainingVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine().toLowerCase();
        //Input a string and return the number of substrings that
        // contain only vowels.
        int n = s.length();

        int count = 0;
        int consecutive = 0;

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (isVowel(ch)) {
                consecutive++;
            } else {
                count += (consecutive * (consecutive + 1)) / 2;
                consecutive = 0;
            }
        }

        count += (consecutive * (consecutive + 1)) / 2;
        System.out.println("Number of vowel of substring:" + count);

    }



         public static   boolean isVowel(char ch){
            return "aeiou".indexOf(ch) !=-1;

        }
        

    }

