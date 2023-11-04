/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ADSday1;


public class QueueImplementation {
    final int SIZE=3;
    int arr[]=new int[SIZE];
    int front=0;
    int rear =0;
    
    public void push(int value){
        if(rear==SIZE){
            System.out.println("queue is full");
            
        }
        else{
        arr[rear]=value;
        rear++;
        }
               
    }
    public void pop(){
        if(rear==front){
            if(rear==SIZE){
                rear=front=0;
            }
            System.out.println("Queue is empty");
            return ;
        }
        System.out.println("popped element is"+arr[front]);
        front++;
    }
    public void display(){
        
    }
    public static void main(String[] args) {
        QueueImplementation qi=new QueueImplementation();
        qi.push(10);
        System.out.println("10 is pushed");
        qi.push(20);
        System.out.println("20 is pushed");
        qi.push(30);
        System.out.println("30 is pushed");
        qi.pop();
        qi.push(40);
         System.out.println("40 is pushed");
        qi.pop();
        qi.pop();
        qi.pop();
      
      
    }
}
