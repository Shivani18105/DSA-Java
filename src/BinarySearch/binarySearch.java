package BinarySearch;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 45, 56, 78, 98};
        int n = arr.length;

        int target = 90;
        boolean flag = false;
        int lo = 0, hi = n - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] == target) {
                flag = true;
                break;
            }
            else if (arr[mid] < target) lo = mid + 1;
            else if (arr[mid] > target) hi = mid - 1;

        }
        if (flag == true) System.out.println(target + " element is in array");
        else System.out.println(target + " element is not in array");
    }
}