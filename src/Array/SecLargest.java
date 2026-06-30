package Array;

public class SecLargest {
    public static void main(String[] args) {
        int[] arr={34,23,45,40,49};
        int max = 0;
        int secMax = 0;
        for (int i = 0; i < arr.length; i++) {

                if(arr[i]>=max){
                    secMax=max;
                    max=arr[i];
                } else if (arr[i]<max && arr[i]> secMax) {
                    secMax=arr[i];
                }
        }
        System.out.println(max);
        System.out.println(secMax);

    }
}
