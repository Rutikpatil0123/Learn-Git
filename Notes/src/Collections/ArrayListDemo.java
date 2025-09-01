package Collections;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {
        System.out.println("Hello world");

        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        arrayList.add(0,0);
        System.out.println(arrayList.size());

        arrayList.remove(4);

        for(Integer val : arrayList){
            System.out.print(val + " ->");
        }
    }
}
