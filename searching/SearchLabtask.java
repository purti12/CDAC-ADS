/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package searching;


public class SearchLabtask {
  public static void findPosition(int[][] matrix, int key) {
        int r = matrix.length;
        int c = matrix[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Element " + key + " found at row " + i + " and column " + j);
                    return;
                }
            }
        }

        System.out.println("Element " + key + " not found in the array.");
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int key = 9;

        findPosition(matrix, key);
    }
}

