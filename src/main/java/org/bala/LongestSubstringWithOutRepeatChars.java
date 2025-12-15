package org.bala;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithOutRepeatChars {

    public static void main(String[] args) {
    String s="abcaccbacabaacsda";
        System.out.println("MAX ->"+countOfLongestSubstring(s));
    }

    public static int countOfLongestSubstring(String s) {
        Set<Character> st = new HashSet<>();

        int left = 0, max = 0;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            while (st.contains(c)) {
                st.remove(s.charAt(left));
                left++;
            }

            st.add(c);
            max=Math.max(max,(right-left)+1);

        }
        return max;
    }
}