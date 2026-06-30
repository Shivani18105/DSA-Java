package StringBuilder;

public class maxValue {
    public static void main(String[] args) {
        String[] arr = {"233" , "45", "567","344" };
        int mx= Integer.parseInt(arr[0]);
        for (int i = 0; i < arr.length; i++) {
            int n = Integer.parseInt(arr[i]);
            mx=Math.max(mx,n);

        }
        System.out.println(mx);
    }
}
