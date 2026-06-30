package twoDimensionalArray;
import java.util.Scanner;

public class marksRollno {
    public static void main(String[] args) {
        int[][] arr = new int[4][2];
        Scanner sc = new Scanner(System.in);
//
//        int m = arr.length;
//        int n = arr[0].length;

        for (int i = 0; i <4; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j]=sc.nextInt();
            }
        }

        for (int i = 0; i <4; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }
    }
}
