package Array;
import java.util.Scanner;

public class twoSum {
//    Find the doublet in the Array whose sum is equal to the
//    given value x. (Two Sum)
public static void main(String[] args) {
    int[] arr={2, 4, 5, 8, 9, 1};
    int x= 6;
    int n= arr.length;
    for (int i = 0; i <n; i++) {
        for (int j = i+1; j <n ; j++) {
            if(arr[i]+arr[j]==x){
                System.out.println(arr[i]+" "+arr[j]);
            }


        }

    }



}
}
