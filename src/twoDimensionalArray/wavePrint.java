package twoDimensionalArray;

public class wavePrint {
    public static void print(int[][] matrix){
        int m=matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j <n ; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{5,6,7},{9,6,4}};
        int m=matrix.length;
        int n = matrix[0].length;
        print(matrix);

        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
                if(i%2==0){
                    for (int j = 0; j < n; j++) {
                        System.out.print(matrix[i][j]);
                    }
                }else{
                    for (int j = n-1; j >0; j--) {
                        System.out.print(matrix[i][j]);
                    }

                }
        }




    }
}
