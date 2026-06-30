package twoDimensionalArray;

import java.util.Scanner;

public class maxInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2][2];
        int max = Integer.MIN_VALUE;
//        int m = arr.length;
//        int n = arr[0].length;
        System.out.println("Enter elements:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
//                System.out.println("Enter elements:");
                arr[i][j]=sc.nextInt();

            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                max = Math.max(max,arr[i][j]);

            }

        }
        System.out.println("Max element:"+max);


    }
}
