import java.util.HashMap;
import java.util.Map;

class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Boolean> map = new HashMap<>();

        for (String word : s1.split(" ")) {
            if (map.containsKey(word)) {
                map.put(word, false);
            } else {
                map.put(word, true);
            }
        }
        for (String word : s2.split(" ")) {
            if (map.containsKey(word)) {
                map.put(word, false);
            } else {
                map.put(word, true);
            }
        }

        return map.entrySet().stream()
                .filter(e -> e.getValue())
                .map(e -> e.getKey())
                .toArray(String[]::new);
    }
}