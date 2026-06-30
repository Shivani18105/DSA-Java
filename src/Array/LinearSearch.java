package Array;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter target value:");
        int x = sc.nextInt();
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=sc.nextInt();

        }
        for (int i = 0; i <=x; i++) {
            if(arr[i]==x){
                System.out.println("Element found");
            }

        }

    }
}
