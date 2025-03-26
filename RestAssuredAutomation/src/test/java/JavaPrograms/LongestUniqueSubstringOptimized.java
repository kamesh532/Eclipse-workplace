package JavaPrograms;

import java.util.HashMap;

public class LongestUniqueSubstringOptimized {
    public static String findLongestSubstring(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0, maxLength = 0, startIdx = 0;

        for (int right = 0; right < str.length(); right++) {
            char c = str.charAt(right);

            // If character exists, move left pointer
            if (map.containsKey(c) && map.get(c) >= left) {
                left = map.get(c) + 1;
            }

            map.put(c, right);
            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                startIdx = left;
            }
        }
        return str.substring(startIdx, startIdx + maxLength);
    }

    public static void main(String[] args) {
        String str = "pwwkew";
        System.out.println("Longest unique substring: " + findLongestSubstring(str));
    }
}
