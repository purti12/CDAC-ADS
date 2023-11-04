/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtask2;


import java.util.Stack;
public class Question2{
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int middleIndex = array.length/2;
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        for (int i = 0; i < middleIndex; i++) {
            stack1.push(array[i]);}
        for (int i = middleIndex; i < array.length; i++){
            stack2.push(array[i]);}
        System.out.println("Contents of stack1:");
        while (!stack1.isEmpty()) {
            System.out.println(stack1.pop());}
        System.out.println("\nContents of stack2:");
        while (!stack2.isEmpty()) {
            System.out.println(stack2.pop());}}}

