package Array;

public class duplicateElements {
    public static void main(String[] args) {
        int[] arr = {1,4,1,7,8,9};
        int n=arr.length;

        boolean duplicateFound=false;
        System.out.println("duplicate found");
// WAP to find the duplicate elements from the given array of elements.
        for (int i = 0; i <n; i++) {
            for (int j = i+1; j <n ; j++) {
                if (arr[i] == arr[j]) {
                    duplicateFound=true;
                    break;
                }

            }
        }
        if(!duplicateFound){
            System.out.println("not");
        }


    }
}
