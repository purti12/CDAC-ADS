/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtask4;


class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    Node top;

    Stack() {
        top = null;
    }

    void push(int item) {
        Node newNode = new Node(item);
        newNode.next = top;
        top = newNode;
        System.out.println(item + " pushed onto the stack.");
    }

    void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return;
        }

        int item = top.data;
        top = top.next;
        System.out.println(item + " popped from the stack.");
    }

    void displayStack() {
        Node current = top;
        System.out.println("Elements in the stack:");

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    boolean search(int key) {
        Node current = top;

        while (current != null) {
            if (current.data == key) {
                return true;
            }
            current = current.next;
        }

        return false;
    }

    boolean isEmpty() {
        return top == null;
    }
}

public class Question2 {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.displayStack();

        stack.pop();
        stack.displayStack();

        int searchKey = 20;
        if (stack.search(searchKey)) {
            System.out.println(searchKey + " found in the stack.");
        } else {
            System.out.println(searchKey + " not found in the stack.");
        }
    }
}
