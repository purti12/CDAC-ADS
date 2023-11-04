/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ADSday1;


public class PowerRecursion {
	// Function to calculate N raised to the power P
	static int power(int N, int P)
	{
		if (P == 0)
			return 1;
		else

			return N * power(N, P - 1);
	}
	// Driver code
	public static void main(String[] args)
	{
		int N = 5;
		int P = 3;

		System.out.println(power(N, P));
	}
}
