package twoDimensionalArray;

public class multiplicationOfArray {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{3,4,5}};
        int[][] b = {{6,7,8}, {9,0,7}, {4,5,6}};
        int m= a.length, n=b[0].length;

        if(a[0].length!=b.length){
            System.out.println("Multiplication not possible");
        }else{
            int[][] c = new int[a.length][b[0].length];
            for (int i = 0; i <c.length ; i++) {
                for (int j = 0; j <c[0].length ; j++) {
//                    c[i][j]=a[i][0]*b[i][1] + a[0][j]*b[1][j]
                    for (int k = 0; k <b.length ; k++) {
                        c[i][j] += a[i][k]*b[k][j] ;
                    }
                    System.out.print(c[i][j]+ " ");
                }
                System.out.println();
            }
        }
    }
}
