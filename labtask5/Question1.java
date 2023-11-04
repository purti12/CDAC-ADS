/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtask5;



class Node {
    int data;
    Node next;
    Node prev;

}
public class Question1{
    
    Node head;
    
    void insertAtFirst(int value){
        Node newNode = new Node();
        newNode.data=value;
        
        if(head==null){
            newNode.next=null;
            newNode.prev=null;
            head=newNode;
        }
        else{
            newNode.prev=null;
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
    }
    
    void insertAtLast(int value){
        Node newNode = new Node();
        newNode.data=value;
        
        if(head==null){
            newNode.next=null;
            newNode.prev=null;
            head=newNode;
        }
        else{
            Node temp = head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
            newNode.prev=temp;
            newNode.next=null;
            
        }
    }
    
    boolean search(int value){
        Node temp=head;
        while(temp!=null){
           if(temp.data==value)
               return true;
           temp=temp.next;
        }
        return false;
    }    
    
    void printDoublyLinkedList(){
        Node temp=head;
        Node last=null;
        while(temp!=null){
            System.out.println(temp.data);
                if(temp.next==null){
                    last=temp;
                }
            temp=temp.next;
        }
        System.out.println("Backward Movement......");
        while(last!=null){
            System.out.println(last.data);
            last=last.prev;
        }
    }
    
    void delete(int value){
        if(head==null)
            return;
        Node temp=head;
        while(temp!=null && temp.data!=value){
            temp=temp.next;
        }
        if(temp==null)
            System.out.println("Data Not Found!!!!!!!");
        else if(temp==head){
            temp.next.prev=null;
        }
        else if(temp.next==null){
            temp.prev.next=null;
        }
        else{
            temp.prev.next=temp.next;
            temp.next.prev=temp.prev;
        }
    }

    public static void main(String[] args) {
        Question1 list = new Question1();

        list.insertAtFirst(100);
        list.insertAtFirst(200);
        list.insertAtFirst(300);
        list.insertAtLast(400);
        list.insertAtLast(500);
        list.insertAtLast(600);
        list.delete(400);
        System.out.println(list.search(200));
        System.out.println(list.search(700));
        list.printDoublyLinkedList();
    }
}
