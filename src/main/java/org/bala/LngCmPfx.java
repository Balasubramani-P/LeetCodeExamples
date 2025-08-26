package org.bala;

public class LngCmPfx {

        public static String longestCommonPrefix(String[] strs) {
            if (strs == null || strs.length == 0) {
                return "";
            }
            String pre = strs[0];
            for (int i = 1; i < strs.length; i++) {
                while (!strs[i].startsWith(pre)) {
                    pre = pre.substring(0, pre.length() - 1);
                    if (pre.isEmpty()) {
                        return "";
                    }
                }
            }

            return pre;
        }

    public static void main(String[] args) {
       String[] strs ={"flower","flow","flight"};
       String[]  strs2 = {"dog","racecar","car"};
        System.out.println("Ans::::::"+longestCommonPrefix(strs));
    }
}
