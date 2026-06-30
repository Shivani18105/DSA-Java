package String;
import java.util.*;

public class s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter str: ");
        String str = sc.nextLine();

        str = str.toLowerCase().replaceAll("[^a-z0-9]", "");
        int n = str.length();
        boolean flag = false; // no palindrome
        int j = n-1;
        int i=0;
          while( i <= j){
                if(str.charAt(i) == str.charAt(j)){
                    flag = true;
                    break;
                }
                i++;
                j--;
            }


            if (flag==true) System.out.println("true");
            else System.out.println("false");




    }
}
