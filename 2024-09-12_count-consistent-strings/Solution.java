import java.util.HashSet;
import java.util.Set;

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> allowedSet = new HashSet<>();
        for (char c : allowed.toCharArray()) {
            allowedSet.add(c);
        }

        int count = 0;
        for (String word : words) {
            if (checkConsistentString(word, allowedSet)) {
                count++;
            }
        }
        return count;
    }

    private boolean checkConsistentString(String s, Set<Character> allowed) {
        for (char c : s.toCharArray()) {
            if (!allowed.contains(c)) {
                return false;
            }
        }
        return true;
    }
}