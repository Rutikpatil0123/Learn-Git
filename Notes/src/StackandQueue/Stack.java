public class Stack{

    int maxSize;
    int [] stackArray;
    int top;


    Stack(int size){
        maxSize = size;
        top = -1;
        stackArray = new int[maxSize];

    }

    public void add(int value){
        if(top == maxSize - 1){
            System.out.print("Stack is Full");
            return;
        }

        stackArray[++top] = value;
    }

    public void remove(){
        if(top == -1){
            System.out.println("Stack is empty");
            return;
        }
        top--;
    }

    public int peek(){
        if(top == -1){
            System.out.println("Stack is Empty");
            return -1;
        }
        return stackArray[top];

    }

    public boolean IsEmpty(){
        if(top == -1){
            return true;
        }
        return false;
    }

    public void printStack(){
        int temp = top;
        while(temp != -1){
            System.out.print(stackArray[temp] + "-> ");
            temp--;
        }
    }

    public static void main(String[] args){


        Stack s = new Stack(5);
        s.add(1);
        s.add(2);
        s.add(3);
        s.printStack();
        System.out.println("Hello");
        s.remove();
        System.out.println(s.IsEmpty());
        s.remove();
        s.remove();
        s.remove();
        System.out.println("Hello");
        s.printStack();
        s.add(1);
    }
}