package StringBuilder;
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.next();
        int n = s.length();
        int i=0, j=n-1;
        boolean isPalindrome= true;

        while (i<j){
            if (s.charAt(i)!=s.charAt(j)){
                isPalindrome=false;
                break;
            }
            i++;
            j--;
        }


        if(isPalindrome){
            System.out.println("Palindrome");
        }else{
            System.out.println("not palindrome");
        }


}
}
