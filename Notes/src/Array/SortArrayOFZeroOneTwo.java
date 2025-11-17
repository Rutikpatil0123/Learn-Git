package Array;

/*Given an array nums consisting of only 0, 1, or 2. Sort the array in non-decreasing order.

The sorting must be done in-place, without making a copy of the original array.*/

public class SortArrayOFZeroOneTwo {

    public static void main(String[] args) {

        System.out.println("Hello");
        Integer []firstArray = {1, 0, 2, 1, 0};
        printArray(firstArray);
        solution(firstArray);
        printArray(firstArray);
       
       
    }

    public static void printArray(Integer []array){
        for(Integer i = 0; i < array.length; i++){
            System.out.print(array[i] + "-> ");
        }
        System.out.println();
    }
    // can be solved using three varibles and sort


    public static void solution(Integer []arr){

        Integer low = 0;
        Integer mid = 0;
        Integer high = arr.length-1;

        while (mid <= high) {

            if(arr[mid] == 0){
                Integer temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }else if(arr[mid] == 1){
                mid++;
            }else{
                Integer temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
            }
           
        }
    }

   
}

