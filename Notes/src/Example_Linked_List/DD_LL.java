package Example_Linked_List;

public class DD_LL {

    class Node {
        int data;
        Node next;
        Node prev;


        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private Node head;

    DD_LL(){
        this.head = null;
    }

    public void add(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            return;
        }

        Node currentNode = head;
        while (currentNode.next!=null){
            currentNode = currentNode.next;
        }
        currentNode.next = node;
        return;
    }

    public void addAtHead(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            return;
        }

        node.next = head;
        head.prev = node;
        head = node;
    }

    public void delete(int data){
        if(head == null){
            return;
        }
        if(head.data == data){

        }
        Node currentNode = head;
        Node prevNode = null;
        Node nextNode = null;

        while (currentNode.data!= data){
            nextNode = currentNode.next;
            //currentNode
        }
    }

    public void printList(){
        Node currentNode = head;
        System.out.println();
        while (currentNode!=null){
            System.out.print(currentNode.data + "-> ");
            currentNode = currentNode.next;
        }
    }


    public static void main(String[] args) {
        DD_LL list = new DD_LL();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.printList();
        list.addAtHead(0);
        list.printList();

    }
}
