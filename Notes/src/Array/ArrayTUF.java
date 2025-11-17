package Array;

import java.util.HashSet;

public class ArrayTUF {
    public static void main(String[] args) {
    /*   System.out.println("Hello");

        int arrary[] = {6,94,4,75,5,6};
        System.out.println(largestElement(arrary));
        System.out.println(secondLargestElement(arrary));

        int []arrayTwo = {1, 1, 3, 5, 5, 5, 6, 7};
        printArray(arrayTwo);
        removeDuplicateElementsOptimal(arrayTwo);
        //removeDuplicateElements(arrayTwo);
        printArray(arrayTwo);
       
    */
        int []thirdAray = {1, 1, 0, 1, 1, 1};
        int []fourthArray = {1, 0, 1, 1, 0, 1};
        int []fivethArray = {0,0,0,0,0};
        System.out.println(countConsecutiveOne(thirdAray));
         System.out.println(countConsecutiveOne(fourthArray));
          System.out.println(countConsecutiveOne(fivethArray));
    }
    // Problem Statement: Given an array, we have to find the largest element in the array.
    public static int largestElement(int []arr){

        int element = Integer.MIN_VALUE;

        for(int index = 0; index < arr.length; index++){
            if(arr[index] > element){
                element = arr[index];
            }
        }

        return element;
    }

    // Problem Statement: Given an array, find the second smallest and second largest element in the array. Print ‘-1’ in the event that either of them doesn’t exist.

    public static int secondLargestElement(int []arr){

        int element = -1;
        int secondElement = -1;

        for(int index = 0 ; index < arr.length; index++){
            if(arr[index] > element){
                element = arr[index];
            }
        }

        System.out.println(element + " : test");
       

        for(int index = 0 ; index < arr.length; index++){
            if(arr[index] != element && arr[index] > secondElement){
               
                    secondElement = arr[index];
               
            }
        }
        return secondElement;

    }

   // Problem Statement: Given an integer array sorted in non-decreasing order, remove the duplicates in place such that each unique element appears only once. The relative order of the elements should be kept the same.

   // 1 3 5 5 5 6 7 7 7

   public static void removeDuplicateElementsOptimal(int []arr){

        if(arr.length == 0){
            return;
        }
        int firstIndex, secondIndex;
        firstIndex = 0;
        secondIndex = 1;
        while (secondIndex < arr.length) {
            if(arr[firstIndex] != arr[secondIndex]){
                firstIndex++;
                arr[firstIndex] = arr[secondIndex];
               
            }

            secondIndex++;
    }  
   }

    public static void removeDuplicateElements(int []arr){

        HashSet set = new HashSet<>();
        int firstIndex = 0;
        for(int index = 0; index < arr.length; index++){
            if(!set.contains(arr[index])){
                set.add(arr[index]);

                arr[firstIndex] = arr[index];
                firstIndex++;
        }
    }

   }
    public static void printArray(int []arr){

        for(int index = 0; index < arr.length; index++){
            System.out.print(arr[index] + "-> ");
        }
        System.out.println();
    }

    //Problem Statement: Given an array that contains only 1 and 0 return the count of maximum consecutive ones in the array.

    public static int countConsecutiveOne(int []nums){
         int count = 0;
        int temp = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                temp++;
            }else{
                temp = 0;
            }

            count = Math.max(count, temp);
        }
        return count;
    }
}

