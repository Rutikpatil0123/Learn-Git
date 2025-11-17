package Math;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


class Pair<T1, T2>{
    private  T1 firstValue;
    private  T2 secondValue;

    public Pair(T1 first, T2 second){
        this.firstValue = first;
        this.secondValue = second;
    }

    public T1 getFirstValue(){
        return firstValue;
    }

    public T2 getSecondValue(){
        return secondValue;
    }

    @Override
    public String toString(){
        return "(" + firstValue + ", " + secondValue + ")";
    }
}
public class Hashing {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        List<Integer> list = new ArrayList<>(List.of(53,4,37,46,4,7,8,8,4));

        HashMap<Integer, Integer> map = countFrequecyOfElements(list);
        printMap(map);

        Pair<Integer, Integer> pair = findHighestAndLowestFrequecyElemnts(list);
        System.out.println("HighestFrequency: " + pair.getFirstValue() + "-> " + "LowestFrequency: " + pair.getSecondValue());
    }

    // Problem statement: Given an array, we have found the number of occurrences of each element in the array.

    public static HashMap<Integer,Integer> countFrequecyOfElements(List<Integer> list){

        HashMap<Integer, Integer> map = new HashMap<>();

        for(Integer i : list){
            if(map.containsKey(i)){
                Integer temp = map.get(i);
                temp++;
                map.put(i, temp);
            }else{
                map.put(i,1);
            }

        }

        return map;
    }

    public static void printMap(HashMap<Integer,Integer> map){
       
        for(HashMap.Entry<Integer,Integer> entry : map.entrySet() ){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    // Problem Statement: Given an array of size N. Find the highest and lowest frequency element.

    public static Pair<Integer,Integer> findHighestAndLowestFrequecyElemnts(List<Integer> list){

        HashMap<Integer, Integer> map = new HashMap<>();

        for(Integer i : list){
            if(map.containsKey(i)){
                Integer temp = map.get(i);
                temp++;
                map.put(i, temp);
            }else{
                map.put(i,1);
            }

        }

        Integer highestFrequencyElement = Integer.MIN_VALUE;
        Integer lowestFrequencyElement = Integer.MAX_VALUE;

        for(HashMap.Entry<Integer, Integer> entry : map.entrySet()){
            highestFrequencyElement = Math.max(highestFrequencyElement, entry.getValue());
            lowestFrequencyElement = Math.min(lowestFrequencyElement, entry.getValue());
        }
        Pair<Integer, Integer> pair = new Pair<Integer,Integer>(highestFrequencyElement, lowestFrequencyElement);
        System.out.println(pair.toString());

        return pair;

       
    }
}  

