/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package searching;


public class BinarySearch1 {
    public static int binarySearch(int arr[],int key) {
int mid;
int start=0;
int end=arr.length-1;

while(start<=end)
{
    mid=(start+end)/2;
    if(arr[mid]==key)
        return mid;
    
    if(arr[mid]<key)
        start=mid +1;
    
     else
        end=mid-1;
}
return -1;
}
    public static void main(String[] args) {
        int[] arr={10,15,27,30,49,50,67};
        int key=80;
        
       int result=binarySearch(arr,key);
       if(result!=-1)
       {
        System.out.println("search found "+key+" result at index "+result);
       }
        
        else
        {
        System.out.println("search not found "+key+" result  not found" );
        }
       
    }
}
