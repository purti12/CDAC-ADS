/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtask6;

public class Question4 {
    public static double power(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        else if (exponent > 0) {
            return base * power(base, exponent - 1);
        } else {
            return 1.0 / (base * power(base, -exponent - 1));
        }
    }

    public static void main(String[] args) {
        double base = 2.0;
        int exponent = 3;
        double result = power(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is " + result);
    }
}


