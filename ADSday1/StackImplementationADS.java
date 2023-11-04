/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ADSday1;

class Mystack{
    final int SIZE=3;
    int arr[]=new int[SIZE];
    int top=-1;
    
    boolean isEmpty(){
        if(top==-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
        Boolean isFull(){
        if(top==SIZE-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
   public void push(int value){
       if(isFull()){
           System.out.println("Stack is full");
       }
       else{
           ++top;
           arr[top]=value;
       }
   }
   public void pop(){
       if(isEmpty()){
           System.out.println("Stack is empty");
           
       }
       else{
           
           System.out.println(arr[top]+"is popped");
           top--;
       }
   }
   public void peek(){
       if(isEmpty()){
           System.out.println("stack is  empty");
          return ; 
       }
       System.out.println("peeked elementis");
   }
}

public class StackImplementationADS {

    
    public static void main(String[] args) {
     
       
        Mystack stack=new Mystack();
        stack.push(10);
        System.out.println("10 is pushed");
        stack.push(20);
        System.out.println("20 is pushed");
        stack.push(30);
        System.out.println("30 is pushed");
          stack.push(40);
        System.out.println("40 is pushed");
          stack.push(50);
        System.out.println("50 is pushed");
        stack.pop();
        stack.pop();
        stack.pop();
        
        
        
        
    }
}

        
        
        
    
    

