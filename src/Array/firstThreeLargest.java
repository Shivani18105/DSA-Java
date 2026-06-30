package Array;

import java.util.Arrays;

public class firstThreeLargest {
    public static void main(String[] args) {
        int[] arr={2,4,11,88,45};
        int n=arr.length;
        Arrays.sort(arr);
        for (int i = n-1; i >n-4 ; i--) {

            System.out.println(arr[i]);
        }





        //WAP to find the largest three elements in the array.
//        int max1=arr[0], max2=arr[0];
//        for (int i = 0; i <n ; i++) {
//            if(max1>=arr[i]){
//                max2=max1;
//                max1=arr[i];
//            }
//            for (int j = 0; j < 3; j++) {
//                System.out.println(max2);
//
//            }
//
//        }
    }
}
