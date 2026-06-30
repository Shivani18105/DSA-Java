package Array;
import java.util.Scanner;

public class searching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter target element:");
        int x = sc.nextInt();
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i <arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i <=arr.length; i++) {
          if(arr[i]==x){
              System.out.println("Element found");
              break;

          }

          else{
              System.out.println("Element not found");
          }

        }
    }
}
