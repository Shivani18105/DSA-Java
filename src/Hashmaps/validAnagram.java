package Hashmaps;

import java.util.HashMap;

public class validAnagram {
    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaram";

        HashMap<Character, Integer> smap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (smap.containsKey(ch)) {
                int freq = smap.get(ch);
                smap.put(ch, freq + 1);
            } else {
                smap.put(ch, 1);
            }
        }

        HashMap<Character, Integer> tmap = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);

            if (tmap.containsKey(ch)) {
                int freq = tmap.get(ch);
                tmap.put(ch, freq + 1);
            } else {
                tmap.put(ch, 1);
            }
        }

        if (smap.equals(tmap)) {
            System.out.println("Valid Anagram");
        } else {
            System.out.println("Not a Valid Anagram");
        }
    }
}