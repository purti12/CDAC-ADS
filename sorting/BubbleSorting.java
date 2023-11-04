/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sorting;


public class BubbleSorting {
   
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    swap(arr,j,j+1);
                }
            }
        }
    }
  public static void swap(int arr[],int i,int j)
  {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j]=temp;
  }
  
  public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
                    

    public static void main(String[] args) {
        int[] arr = {67, 25, 12, 22, 11};
        System.out.println("Original array:");
        
        printArray(arr);
        
        bubbleSort(arr);
        
        System.out.println("array after sorting");
        printArray(arr);
        
        }
    }


