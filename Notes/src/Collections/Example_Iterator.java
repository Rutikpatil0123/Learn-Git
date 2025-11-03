package Collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example_Iterator {

    public static void main(String[] args) {

        List<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);


        System.out.println("Iterating values using iterator method");

        Iterator<Integer> iterator = values.iterator();
        while(iterator.hasNext()){
            int iterator_Val = iterator.next();
            System.out.println(iterator_Val);
            if(iterator_Val == 3){
                iterator.remove();
                System.out.println("removing values from list");
            }
        }

        System.out.println("Iterating values using for each");
        for(int val : values){
            System.out.println(val);
        }

        System.out.println("Iterating values using forEach method");

        values.forEach((Integer val) -> System.out.println(val));


    }
}
