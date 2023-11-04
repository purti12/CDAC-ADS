/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ADSday1;

class Node{
    int data;
    Node next;
}
public class SinglyLinkedlist {
    Node head=null;
    void  addFirst(int val)
    {
        Node newNode=new Node();
        newNode.data=val;
        newNode.next=head;
        
        head=newNode;//shifting of head tonew node
    }
    //for addingnode to last
  void addLast(int val){
      Node newNode=new Node();
      newNode.data=val;
      if(head==null)
          head=newNode;
      else{
          Node lastNode=head;
          while( lastNode.next!=null){
               lastNode= lastNode.next;
            
          }
           lastNode.next=newNode;
      }
  }
  
  void deleteNode(int val){
      if(head.data==val)
      {head=head.next;
      }
      else{
          Node temp=head;
          while(temp.next!=null){
              if(temp.next.data==val)
              {
                  temp.next=temp.next.next;
                  break;
              }
              temp=temp.next;
          }
      }
  }
  
  boolean searchNode(int val){
      Node temp=head;
      while(temp!=null){
          if(temp.data==val)
              return true;
          temp=temp.next;
      }
      return false;
  }
  void printList(){
      Node temp=head;
      while(temp!=null){
          System.out.println(temp.data);
          temp=temp.next;
      }
  }  
    
    public static void main(String[] args) {
         SinglyLinkedlist sl=new  SinglyLinkedlist();
         sl.addFirst(10);
         sl.addFirst(20);
         sl.addFirst(30);
         sl.addFirst(40);
         sl.addFirst(50);
         
         sl.addLast(100);
         sl.addLast(200);
         
         sl.printList();
         System.out.println("*********");
         
        //for searching
         System.out.println(sl.searchNode(30));
         
        // sl.deleteNode(50);// for deleting
        
         //sl.deleteNode(40);
          // sl.printList();
         
         
         
    }
}
