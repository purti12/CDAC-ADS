/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sorting;


public class QuickSort {
    
    int pIndex;
     
    void swap(int arr[],int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        
    }
    
    int partition(int arr[],int start,int end){
        pIndex=start;
        int pivot=arr[end];
        
        for(int i=start;i<end;i++)
        {
            if(arr[i]<pivot)
            {
                swap(arr, i, pIndex);
                pIndex++;
            }
        }
        
        swap(arr,pIndex,end);
        return pIndex;
        
    }
    
    void quickSort(int arr[],int start,int end)
    {
        if(start<end)
        {
            pIndex=partition(arr, start, end);
            quickSort(arr, start, pIndex-1);
            quickSort(arr, pIndex+1, end);
        }
    }
    
    public static void main(String[] args) {
        
        QuickSort qs=new QuickSort();
        int arr[]={50,10,30,20,100,80};
        
        qs.quickSort(arr, 0, arr.length-1);
        for(int no:arr)
            System.out.println(no);
        
    }
}
