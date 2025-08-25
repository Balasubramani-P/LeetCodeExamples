package org.bala;

public class Palindrome {

        public static boolean isPalindrome(int x) {
            int rev = 0;
            int ck = x;
            if (x < 0) {
                return false;
            }
            while (x > 0) {
                rev = (rev * 10) + x % 10;
                x = x / 10;
            }

            return (ck == rev);
        }

    public static void main(String[] args) {
          int n=0;
        System.out.println(isPalindrome(n)?"its palindrome":"NOT A PALINDROME");
    }
}
