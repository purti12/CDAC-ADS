/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ADSday1;


public class BinaryRecursionDemo {
    public static int fibo(int n){
        if(n<=1)
            return n;
        
        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args) {
       //System.out.println( fibo(5));
        
        for(int i=0;i<=5;i++)
        {
            System.out.println(fibo(i)+" ");
        }
            
    }
}
