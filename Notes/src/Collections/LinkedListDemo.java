package Collections;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        //list.

        for(Integer val: list){
            System.out.print(val + "-> ");
        }
    }
}
