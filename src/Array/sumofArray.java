package Array;
import java.util.Scanner;

public class sumofArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Elements:");
        for (int i = 0; i <arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for (int i = 0; i <arr.length ; i++) {

            sum+=arr[i];

        }

        System.out.println("SUM:"+sum);


    }
}

