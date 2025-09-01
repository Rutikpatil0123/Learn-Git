package Example_Linked_List;


    //  class to represent a singly linked list
   public class Test {
        // Node class represents each element in the linked list
        class Node {
            int data;
            Node next;

            // Constructor to create a new node
            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        // Head of the list
        private Node head;

        // Constructor to initialize an empty linked list
        public Test() {
            this.head = null;
        }

        // Method to add a new node at the end of the list
        public void append(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }

            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }

        // Method to add a new node at the beginning of the list
        public void prepend(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        // Method to delete a node by value
        public void delete(int data) {
            if (head == null) {
                System.out.println("List is empty!");
                return;
            }

            if (head.data == data) {
                head = head.next;
                return;
            }

            Node current = head;
            while (current.next != null && current.next.data != data) {
                current = current.next;
            }

            if (current.next == null) {
                System.out.println("Node not found!");
            } else {
                current.next = current.next.next;
            }
        }

        // Method to display the elements of the list
        public void display() {
            if (head == null) {
                System.out.println("List is empty!");
                return;
            }

            Node current = head;
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }

        // Main method to test the linked list implementation
        public static void main(String[] args) {
            Test list = new Test();

            list.append(10);
            list.append(20);
            list.append(30);
            list.prepend(5);

            System.out.println("Original Linked List:");
            list.display();

            list.delete(20);
            System.out.println("After deleting 20:");
            list.display();

            list.delete(50); // Node not found
            System.out.println("After trying to delete 50:");
            list.display();
        }
    }


