package Array;

public class productOfElements {
    public static void main(String[] args) {
        int[] arr={1,4,8,3,8};
        int n=arr.length;
        System.out.println("Given Array:");
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        int prod=1;
        for (int i = 0; i < n; i++) {
            prod*=arr[i];
        }
        System.out.println("Product:"+prod);

    }
}
