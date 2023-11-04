/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sorting;


public class SelectionSorting1 {
    public static void  selectionsorting(int[]arr)
    {
          int size = arr.length;
        for (int i=0;i<size-1;i++) {
            int arr2 = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[arr2]) {
                    arr2 = j;
                }
            }
            swap(arr, i,arr2);
        }
    }
            public static void swap(int arr[],int index1,int index2)
            {
            int temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
}

    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");}
        System.out.println();}
    
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        System.out.println("Original array:");
        printArray(arr);
        selectionsorting(arr);
        System.out.println("Array after selection sort:");
        printArray(arr);
    }

}



    
        
        
        
        
    

