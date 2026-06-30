package Array;

public class factorialOfLargest {
    public static void main(String[] args) {
        int[] arr = {3, 22, 78, 45, 4};
        int n = arr.length;

        // Find the largest element
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Largest element: " + max);

        // Calculate factorial
        long fact = 1;
        for (int i = 1; i <= max; i++) {
            fact *= i;
        }

        System.out.println("Factorial of " + max + " is: " + fact);

    }
}