package Hashmaps;

import java.util.HashMap;

public class basics {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Sania", 78);
        map.put("Maithili", 56);
        map.put("Siya", 66);
        map.put("Gauri", 87);
        System.out.println(map);
        System.out.println(map.containsValue(56));
        map.put("Sania", 100);
        System.out.println(map );
    }
}
