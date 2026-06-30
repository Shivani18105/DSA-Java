package Array;

public class productofArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 49};
        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            product *= arr[i];

        }
        System.out.println(product);
    }
}

