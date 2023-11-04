/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ADSday1;


class MyQueue{
   final int SIZE=5;
    int arr[] = new int[SIZE];
    int rear=0;
    int front=0;
        
    boolean isFull(){
        if((rear==SIZE && front==0)){
            return true;
        }else{
            return false;
        }
    }
    
    public void Push(int value){
        if(isFull()){
            System.out.println("Queue is full......");
        }else{
            arr[rear]=value;
            rear++;
        }
    }
    
    public void Pop(){
        if(rear==front){
            if(front==SIZE)
                rear=front=0;
                System.out.println("Queue is Empty......");
            return;
        }
        
            System.out.println("Popped Element is "+arr[front]+".");
            front++;
        }
    
 
    public void displayQueueData() {
        System.out.println("Data in the stack:");
        for (int i = front; i <=rear; i++) {
            System.out.println(arr[i]);
        }
    }
}


public class QueueUsingArray {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.Push(10);
        System.out.println("10 is pushed...");
        queue.Push(20);
        System.out.println("20 is pushed...");
        queue.Push(30);
        System.out.println("30 is pushed...");
        queue.Push(40);
        System.out.println("40 is pushed...");
        queue.Push(50);
        System.out.println("50 is pushed...");
        queue.Pop();
        queue.Push(60);
        System.out.println("60 is pushed...");
    }
}

