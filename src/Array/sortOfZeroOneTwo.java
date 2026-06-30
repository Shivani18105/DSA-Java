package Array;

public class sortOfZeroOneTwo {
    public static void swap(int arr[], int low, int hi){
        int temp=arr[low];
        arr[low]=arr[hi];
        arr[hi]=temp;
    }
    public static void main(String[] args) {
        int[] arr={1,2,0,2,0,1};
        int n= arr.length;
        int low=0;
        int mid=0;
        int hi=n-1;
        while(mid<=hi) {
            if(arr[mid]==0){
                swap(arr,low,mid);
                mid++;
                low++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else if(arr[mid]==2){
                swap(arr,mid,hi);
                hi--;

            }


        }
        System.out.println("Sorted array:");
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
