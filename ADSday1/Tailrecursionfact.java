/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ADSday1;


public class Tailrecursionfact {
    
    int fact(int n)
    {        
        if(n==1)
        {
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) 
    {
        Tailrecursionfact f=new Tailrecursionfact();
        System.out.println(f.fact(10));
    }
}

