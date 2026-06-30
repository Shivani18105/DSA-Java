package BasicSorting;

public class zeroesAtEnd {
    public static void print(int[] arr){
        for( int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {0,8,0,0,9,6,0};
        int n = arr.length;
        int noz = 0;
        for(int ele : arr){
            if(ele == 0) noz++;
        }
        print(arr);
        for (int x = 0; x < noz; x++) {
            for (int i = 0; i < n-1-x; i++) {
                if(arr[i]==0){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }

        }
        print(arr);

    }
}
