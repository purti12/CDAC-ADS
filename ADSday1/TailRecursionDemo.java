/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ADSday1;


public class TailRecursionDemo {
    
public static void tailRecursion(String str){
    if(str.length()==0)
        return ;
    System.out.println(str.charAt(0));
    tailRecursion(str.substring(1));
    
   }
public static void headRecursion(String str1){
    if(str1.length()==0)
        return ;
   
    headRecursion(str1.substring(1));
    System.out.println(str1.charAt(0));
    
   }
        
    public static void main(String[] args) {
        
    TailRecursionDemo tc=new TailRecursionDemo();
    
       tailRecursion("purti");
       
        System.out.println("*********");
        
        headRecursion("Atishay");
        
}
}
