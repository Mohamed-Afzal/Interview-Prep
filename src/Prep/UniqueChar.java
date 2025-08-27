package Prep;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueChar {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
    }

    public static int firstUniqChar(String s){
        char[] st = s.toCharArray();
        HashMap <Character, Integer>  map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        for(int i =0; i< st.length; i++){
            if(map.get(st[i]) == 1) return i;
        }

        return -1;
    }


    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        Map<Character, Integer> sortedMap = map.entrySet()
                .stream()
                .sorted(Map.Entry.<Character, Integer>comparingByValue().reversed())
                .collect(
                        LinkedHashMap::new,
                        (m, e) -> m.put(e.getKey(), e.getValue()),
                        Map::putAll
                );

        String result = "";
        for (Map.Entry<Character, Integer> entry: sortedMap.entrySet()){
            char ch = entry.getKey();
            int freq = entry.getValue();
            for (int i =0; i<freq; i++){
                result += ch;
            }
        }
        return result;

    }

}
