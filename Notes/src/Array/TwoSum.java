package Array;

import java.util.HashMap;

import Math.Pair;

/*Given an array of integers nums and an integer target. Return the indices(0 - indexed) of two elements in nums such that they add up to target.


Each input will have exactly one solution, and the same element cannot be used twice. Return the answer in increasing order.*/

public class TwoSum {

    public static void main(String args[]){
        System.out.println("Hello world!");

        Integer []firstArray = {1, 6, 2, 10, 3};
        Pair<Integer,Integer> p = solution(firstArray, 7);
        System.out.println(p.getFirstValue() + " " + p.getSecondValue());
    }

    public static Pair<Integer,Integer> solution(Integer []arr, Integer target){

        HashMap <Integer, Integer> map = new HashMap<>();

        Pair<Integer,Integer> pair = new Pair<Integer,Integer>(0, 0);
       
        for(Integer i = 0; i < arr.length; i++){
            map.put(arr[i], i);
        }

        for(Integer i = 0; i < arr.length; i++){
            if(map.containsKey(target-arr[i])){
                if(target-arr[i] < arr[i]){
                    pair.setFirstValue()
                    pair.setSecondValue(arr[i]);
                }else{
                    pair.setSecondValue(target-arr[i]);
                    pair.setFirstValue(arr[i]);
                }
            }

        }

        return pair;



    }

   
}

