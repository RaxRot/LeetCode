package easy;

import java.util.Arrays;
//iven two strings s and t, return true if t is an anagram of s, and false otherwise.
public class IsAnagram {
    public boolean isAnagram(String s, String t) {
        String s1 = s.toLowerCase().trim();
        String t1 = t.toLowerCase().trim();
        if (s1.length() != t1.length()) return false;

        char[] sArr = s1.toCharArray();
        char[] tArr = t1.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        return Arrays.equals(sArr, tArr);
    }
}
