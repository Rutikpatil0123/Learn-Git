package Array;

// Problem Statement: Given an array of N integers, write a program to return an element that occurs more than N/2 times in the given array. You may consider that such an element always exists in the array.

public class MajorityElement {
    public static void main(String[] args) {
        System.out.println("Hello!");

        Integer []array = {2,2,1,1,1,2,2};
        Integer ans = solution(array);
        System.out.println(ans);
    }
// Can be solved using hashmap
    public static Integer solution(Integer []array){

        Integer count = 0;
        Integer element = array[0];

        for(int i = 0; i < array.length; i++){
            if(count == 0){
                count = 1;
                element = array[i];
            }else if(element == array[i]){
                count++;
            }else{
                count--;
            }
        }

        Integer count1 = 0;

        for(Integer i = 0; i < array.length; i++){
            if(element == array[i]){
                count1++;
            }
        }

        if(count1 >= (array.length/2)){
            return element;
        }else{
            return -1;
        }
    }
   

}

