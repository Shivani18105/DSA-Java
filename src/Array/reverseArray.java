package Array;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int n = arr.length;
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();


        for (int i = 0; i < n/2; i++) {
            int j=n-i-1;
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
