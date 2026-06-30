package String;

public class reverseString2 {
    public static void main(String[] args) {
        String str = "abcdefg";
        char[] arr = str.toCharArray();
        System.out.println(arr);

        int k = 2;
//        String rev;
        int i=0, j=k;
        int left = 0;
        int right = k - 1;
       while(left<right){

            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println(arr);


    }
}
