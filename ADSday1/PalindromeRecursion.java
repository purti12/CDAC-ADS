/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ADSday1;


public class PalindromeRecursion {
    
    public static boolean isPalindrome(String str) {
        // Base case: If the string is empty or has only one character, it's a palindrome.
        if (str.length() <= 1) {
            return true;
        }

        // Compare the first and last characters of the string.
        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            // If the first and last characters match, check the substring without those characters.
            return isPalindrome(str.substring(1, str.length() - 1));
        } else {
            // If the first and last characters do not match, the string is not a palindrome.
            return false;
        }
    }

    public static void main(String[] args) {
        String palindromeStr = "nitin";
        String nonPalindromeStr = "hello";

        System.out.println(palindromeStr + " is a palindrome: " + isPalindrome(palindromeStr));
        System.out.println(nonPalindromeStr + " is a palindrome: " + isPalindrome(nonPalindromeStr));
    }
}


