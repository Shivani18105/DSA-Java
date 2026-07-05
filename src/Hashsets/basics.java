package Hashsets;

import java.util.HashSet;

public class basics {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(20);
        set.add(100);
        set.add(10);
        set.add(-8);
        set.add(200);
        for (int ele :set){
            System.out.print(ele+" ");
        }
//        System.out.println(set);
        //search
//        System.out.println(set.contains(50));
        System.out.println();
        int[] arr = {1,2,3,4,5,6};
        for (int ele : arr){
            System.out.print(ele +" ");
        }
    }
}
