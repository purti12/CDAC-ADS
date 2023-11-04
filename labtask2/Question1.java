/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtask2;


import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();
        String reversed = reverseString(input);
        System.out.println("Reversed string: " + reversed);
    }


    public static String reverseString(String input) {
        char[] charArray = input.toCharArray();
        int length = charArray.length;

        char[] stack = new char[length];

        for (int i = 0; i < length; i++) {
            stack[i] = charArray[i];
        }

        char[] reversedArray = new char[length];
        for (int i = 0; i < length; i++) {
            reversedArray[i] = stack[length - 1 - i];
        }

        return new String(reversedArray);
    }
}


