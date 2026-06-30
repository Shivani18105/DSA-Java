package BasicSorting;

public class bubbleSortDesc {
    public static void print(int[] arr){
        for (int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr ={ 2, 4, 1 ,0 ,-3};
        int n = arr.length;
        boolean flag=false;
        print(arr);
        for (int i = 0; i <n-1; i++) {
            for (int j = 0; j <n-1 ; j++) {
                if(arr[j] < arr[j+1]){
                    swap(arr, j , j+1);
                    flag=false;
                }
            }
            if(flag == true) break;

        }
        print(arr);

    }
}
