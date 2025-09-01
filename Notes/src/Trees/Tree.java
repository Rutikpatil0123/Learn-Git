class Node{
    int key;
    Node left,right;

    Node(int key){
        this.key = key;
        left = right = null;
    }
}

public class Tree{

    private Node root;

    Tree(){
        root = null;
    }

    public void insert(int key){
        root = insertNode(root,key);
    }

    private Node insertNode(Node root, int key){

        if(root == null){
            root = new Node(key);
            return root;
        }

        if(key < root.key){
            root.left = insertNode(root.left, key);
        }else if(key > root.key){
            root.right = insertNode(root.right, key);
        }

        return root;
    }

    public void inorder(){
        inoderTraversal(root);
    }

    private void inoderTraversal(Node root){

        if(root != null){

            inoderTraversal(root.left);
            System.out.print(root.key + "-> ");
            inoderTraversal(root.right);
        }
    }


    public static void main(String[] args){
        System.out.println("hello");

        Tree t = new Tree();
        t.insert(1);
        t.insert(2);
        t.insert(3);
        t.insert(4);
        t.insert(5);
        t.insert(8);
        t.insert(5);
        t.inorder();
    }

}