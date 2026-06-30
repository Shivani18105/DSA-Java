package Array;

public class nextGreatest {
    public static void main(String[] args) {
        int[] arr={4,8,23,99,14};
        int n=arr.length;
        int[] ans= new int[n];
        ans[n-1] =-1;
        int nge=arr[n-1];
        for (int i = n-2; i >=0 ; i--) {
            ans[i] = nge;
            nge = Math.max(nge, arr[i]);

        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();

        for(int ele : ans){
            System.out.print(ele+" ");
        }

}
}

