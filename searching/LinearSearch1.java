/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package searching;


public class LinearSearch1 {
    public int linearearch(int arr[],int size,int key)
    {
        int i;
        for(i=0;i<size;i++)
        {
            if(arr[i]==key)
                return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        int pageNumber[]={89,91,53,34,0};
                int key=53;
                 LinearSearch1 obj=new  LinearSearch1();
                 if(obj.linearearch(pageNumber, pageNumber.length, key)==1)
                 {
                     System.out.println("search found");
                 }
                 else
                 {
                         System.out.println("search not found");
                  }
                
    }
}

    