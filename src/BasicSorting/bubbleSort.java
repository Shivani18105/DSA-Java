package BasicSorting;

public class bubbleSort {
    public static void print(int[] arr){
        for(int ele:arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1};
        int n = arr.length;
        print(arr);
        //Bubble Sort - 1
//        for (int i = 1; i <=n-1; i++) {
//            for (int j = 0; j <n-1; j++) {
//                if(arr[j]>arr[j+1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//
//            }
//
//        }
        //bubble sort- 2
//        for (int i = 0; i <n-1; i++) {
//            for (int j = 0; j <n-1-i; j++) {
//                if(arr[j]>arr[j+1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//
//            }
//
//        }

        //bubble sort Optimised
        boolean flag = true;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = false;
                }
            }
            if(flag == true) break;
        }
        print(arr);
    }
}
