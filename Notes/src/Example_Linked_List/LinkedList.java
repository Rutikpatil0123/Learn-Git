package Example_Linked_List;

import java.util.List;

public class LinkedList {

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    LinkedList(){
        this.head = null;
    }

    public Boolean IsHeadEmpty(){
        if(head == null){
            return true;
        }
        return false;
    }

    public void add(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            return;
        }

        Node current = head;

        while (current.next != null){
            current = current.next;
        }

        current.next = node;
        return;
    }


    public void addAtHead(int data){
        Node node = new Node(data);
        if(IsHeadEmpty()){
            head = node;
            return;
        }
        node.next = head;
        head = node;

        return;

    }

    public void delete(int data){
        if(IsHeadEmpty()) {
            return;
        }
        Node currentNode = head;
        if(currentNode.data == data){
            head = head.next;
            currentNode.next = null;
            return;
        }
        while(currentNode.next.data != data){
            currentNode = currentNode.next;
        }
        currentNode.next = currentNode.next.next;
    }

    public void printLinkedList(){
        Node currentNode = head;
        System.out.println();
        while (currentNode != null){
            System.out.print(currentNode.data + "-> ");
            currentNode = currentNode.next;

        }

    }

    public void reverse(){

        if(head.next == null){
            return;
        }
        Node currentNode = head;
        Node nextNode = null;
        Node prevNode = null;

        while (currentNode != null){
            nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }
        head = prevNode;
    }

    public Node reverseByRecursion(Node node){
        if(node == null || node.next == null){
            return node;
        }

        Node newHead = reverseByRecursion(node.next);

        node.next.next = node;
        node.next = null;

        return newHead;
    }

    public void getNewHeadReverse(){
        head = reverseByRecursion(head);
    }


    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.printLinkedList();
        list.addAtHead(0);
        list.printLinkedList();
        list.delete(1);
        list.printLinkedList();
        list.delete(0);
        list.printLinkedList();
        list.delete(4);
        list.printLinkedList();
        list.add(1);
        list.add(2);
        list.addAtHead(0);
        list.printLinkedList();
        list.reverse();
        list.printLinkedList();
        list.getNewHeadReverse();
        list.printLinkedList();

    }
}
