import java.util.*;

class Solution {
    public int minimumPushes(String word) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            map.put(word.charAt(i), map.getOrDefault(word.charAt(i), 0) + 1);
        }

        int ans = 0;
        int c = 0;
        int a = 0;
        
        Set<Character> v = new HashSet<>();

        // Create a list of unique characters sorted by frequency in descending order
        List<Character> keys = new ArrayList<>(map.keySet());
        keys.sort((ch1, ch2) -> map.get(ch2) - map.get(ch1));

        // Iterate over sorted characters instead of word.charAt(i)
        for (int i = 0; i < keys.size(); i++) {
            char ch = keys.get(i);
            if (!v.contains(ch) && map.containsKey(ch)) {
                v.add(ch);
                
                if (c < 8) {
                    a = 1;
                } else if (c < 16) {
                    a = 2;
                } else if (c < 24) {
                    a = 3;
                } else {
                    a = 4;
                }
                
                ans += a * map.get(ch);
                c++;
            }
        }
        
        return ans;
    }
}