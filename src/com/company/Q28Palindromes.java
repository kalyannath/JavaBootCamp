package com.company;

/*
28.Ask the user for a string and print out whether
this string is a palindrome or not.
 */
public class Q28Palindromes {
    public static boolean palindrome(String s) {
        String s1 = s.toLowerCase().replaceAll("\\s", "");
        int l = s1.length();
        boolean palindrome = true;
        for (int i = 0; i < l; i++) {
            if (!(s1.charAt(i) == s1.charAt(l - (i + 1)))) {
                palindrome = false;
                break;
            }
        }
        return palindrome;
    }
    public static void main(String[] args) {
        System.out.println(palindrome("  a B    c d cba   "));
    }
}
