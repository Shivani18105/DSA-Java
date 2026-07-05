package Hashmaps;

import java.util.HashMap;

public class iterateMap {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Sania", 78);
        map.put("Maithili", 56);
        map.put("Siya", 66);
        map.put("Gauri", 87);

        for (String key : map.keySet()){
            int val = map.get(key);
            System.out.println(key+" "+val);
        }
        System.out.println();
        for(int val: map.values()){
            System.out.println(val);
        }
        System.out.println();

        for(Object pair : map.entrySet()){
            System.out.println(pair);
        }
    }
}
