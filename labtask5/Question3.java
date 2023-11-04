/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtask5;


import java.util.Arrays;
import java.util.Stack;

public class Question3 {
    public static int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Arrays.fill(result, -1);
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < 2 * n; i++) {
            int j = i % n; 
            while (!stack.isEmpty() && nums[j] > nums[stack.peek()]) {
                result[stack.pop()] = nums[j];
            }
            stack.push(j);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {4, 2, 10, 6, 8};
        int[] nextGreater = nextGreaterElements(nums);
        System.out.println("Next Greater Elements for Circular Array:");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i] + " -> " + nextGreater[i]);
        }
    }
}

