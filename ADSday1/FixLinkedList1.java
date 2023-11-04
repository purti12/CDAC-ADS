/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ADSday1;

class Node1{
    int data;
    Node next;
}
public class FixLinkedList1{
   
        Node head,middle,last;
        void createList(){
        head=new Node();
        middle=new Node();
        last=new Node();
        
        head.data=10;
        middle.data=20;
        last.data=30;
        
        head.next=middle;
        middle.next=last;
        last.next=null;
    }
void showList(){
    Node temp=head;
while(temp!=null){
System.out.println(temp.data);
temp=temp.next;
}
}
 public static void main(String[] args) {
    FixLinkedList1  fx=new FixLinkedList1 ();
fx.createList();
fx.showList();

 }
}
