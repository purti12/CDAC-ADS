/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ADSday1;

class Node{
    int data;
    Node next;
}
public class CircularLinkedList {
    Node head;
    
    void addFirst(int val){
        Node newNode=new Node();
        newNode.data=val;
        
        if(head==null)
        {
            newNode.next=newNode;
            head=newNode;      
        }
        else{
        
               Node last=head;
                while(last.next!=head)
                {
                last=last.next;
                }
               last.next=newNode;
               newNode.next=head;
                head=newNode;  
        }
    }
   void addLast(int val){
       Node newNode=new Node();
        newNode.data=val;
        
        if(head==null)
        {
            newNode.next=newNode;
            head=newNode;      
        }
        else{
        
               Node last=head;
                while(last.next!=head)
                {
                last=last.next;
                }
               last.next=newNode;
               newNode.next=head;
        }
   }
   
//   void delete(int val){
//       if(head.data==val)
//      {head=head.next;
//      }
//      else{
//          Node temp=head;
//          while(temp.next!=null){
//              if(temp.next.data==val)
//              {
//                  temp.next=temp.next.next;
//                  break;
//              }
//              temp=temp.next;
  //another method for deleting data
   void delete(int val){
       if(head==null)
       {
           return;
       }
       if(head.data==val && head.next==head)
       {head=null;
       }
       else if(head.data==val)
       {
           Node temp=head;
           while(temp.next!=head)
           {
               temp=temp.next;
           }
           temp.next=head.next;
           head=head.next;
   }
       else{
           Node temp=head;
           while(temp.next!=head){
               if(temp.next.data==val){
                   temp.next=temp.next.next;
                   break;
               }
               temp=temp.next;
           }
       }
   }
  boolean search(int val){
      if (head == null) {
            return false; // List is empty, so the element cannot be found.
        }

        Node temp = head;
        do {
            if (temp.data == val) {
                return true; // Element found.
            }
            temp = temp.next;
        } while (temp != head);

        return false; // Element not found after a full loop through the list.
    }
  
  
  
    void printList(){
        if(head==null)
            return;
        Node temp=head;
        do{
            System.out.println(temp.data);
            temp=temp.next;
        }
        while(temp!=head);
    }
    
    public static void main(String[] args) {
        CircularLinkedList cl=new CircularLinkedList();
        cl.addFirst(100);//head will shift from this
        cl.addFirst(200);
        cl.addFirst(300);
        cl.addFirst(400);//to this
        //cl.printList();
        
        cl.addLast(500);
        cl.addLast(600);
        cl.printList();
        
        System.out.println("****");
        cl.delete(300);
        cl.printList();
        
           
        System.out.println("****");
        System.out.println(cl.search(400));
       
        
    }
}
