package twoDimensionalArray;

public class transpose {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6}};
        int m = arr.length;
        int n = arr[0].length;
        System.out.println("Original Matrix");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Transpose Matrix:");
        for (int j = 0; j < n; j++) {
            for (int i = 0; i< m; i++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int[][] transpose = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j< n; j++) {
                transpose[j][i]=arr[i][j];
                System.out.print(transpose[i][j]);
            }
            System.out.println();
        }

    }
}
