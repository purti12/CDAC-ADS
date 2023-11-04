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

class CircularQueue {
    Node front, rear;

    CircularQueue() {
        front = rear = null;
    }

    void enqueue(int item) {
        Node newNode = new Node(item);

        if (rear == null) {
            front = rear = newNode;
            rear.next = front;
        } else {
            rear.next = newNode;
            rear = newNode;
            rear.next = front;
        }
        System.out.println(item + " enqueued to the circular queue.");
    }

    void dequeue() {
        if (front == null) {
            System.out.println("Queue is empty.");
            return;
        }

        int item = front.data;
        if (front == rear) {
            front = rear = null;
        } else {
            front = front.next;
            rear.next = front;
        }
        System.out.println(item + " dequeued from the circular queue.");
    }

    void displayQueue() {
        Node temp = front;
        System.out.println("Elements in the circular queue:");

        if (front != null) {
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != front);
        }
        System.out.println();
    }

    boolean search(int key) {
        Node current = front;

        if (front == null) {
            return false;
        }

        do {
            if (current.data == key) {
                return true;
            }
            current = current.next;
        } while (current != front);

        return false;
    }
}

public class Question1{
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        queue.displayQueue();

        queue.dequeue();
        queue.displayQueue();

        int searchKey = 30;
        if (queue.search(searchKey)) {
            System.out.println(searchKey + " found in the circular queue.");
        } else {
            System.out.println(searchKey + " not found in the circular queue.");
        }
    }
}


