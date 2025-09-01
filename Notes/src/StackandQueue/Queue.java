package StackandQueue;

class Node{

    Node next;
    int data;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class Queue{

    private Node front;
    private Node rear;

    Queue(){
        front = rear = null;
    }

    public boolean isEmpty(){
        if(front == null){
            return true;
        }
        return false;

    }

    public void add(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
        return;

    }

    public void remove(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        front = front.next;
        if(front == null){
            rear = null;
        }
        return;
    }

    public int getFront(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        return front.data;
    }

    public void printQueue(){
        Node temp = front;

        while(temp!= null){
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
    }
    public static void main(String[] args){
        System.out.println("Hello");

        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.printQueue();
        System.out.println(q.getFront());
        q.remove();
        q.remove();
        q.remove();
        q.remove();
        q.remove();
        q.printQueue();
    }
}