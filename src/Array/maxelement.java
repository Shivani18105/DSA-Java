package Array;
import java.util.Scanner;

public class maxelement {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        System.out.println("Enter array elements:");
        int[] arr= new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();

        }
        int max=arr[0];
        for (int i = 0; i < n; i++) {
            if(arr[i]> max){
                System.out.println("Maximum element:"+arr[i]);
                break;
            }

        }

    }
}
