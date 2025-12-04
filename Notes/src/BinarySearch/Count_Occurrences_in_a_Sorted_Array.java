package BinarySearch;

public class Count_Occurrences_in_a_Sorted_Array {

    public static void main(String[] args) {
        System.out.println("Hello");

        Integer[] arrayOne = {0, 0, 1, 1, 1, 2, 3};
        Integer ans = findLastOccurrence(arrayOne, 1);
        ans = ans - findFirstOccurrence(arrayOne, 1);
        System.out.println(ans+1);
    }
    
    /*
     * You are given a sorted array of integers arr and an integer target. Your task is to determine how many times target appears in arr.



        Return the count of occurrences of target in the array.


        Examples:
        Input: arr = [0, 0, 1, 1, 1, 2, 3], target = 1

        Output: 3

        Explanation: The number 1 appears 3 times in the array.

        Input: arr = [5, 5, 5, 5, 5, 5], target = 5

        Output: 6

        Explanation: All elements in the array are 5, so the target appears 6 times.
     */

     public static Integer findFirstOccurrence(Integer[] array, Integer target){
        Integer firstIndex = -1;
        Integer low = 0;
        Integer high = array.length-1;

        while (low <= high) {
            
            Integer mid = low + (high - low) / 2;
            if(array[mid] == target){
                firstIndex = mid;
                high = mid - 1;
            }else if(array[mid] > target){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }

        return firstIndex;

    }
    
    public static Integer findLastOccurrence(Integer[] array, Integer target){
        Integer lastIndex = -1;
        Integer low = 0;
        Integer high = array.length-1;

        while (low <= high) {
            
            Integer mid = low + (high - low) / 2;
            if(array[mid] == target){
                lastIndex = mid;
                low = mid + 1;
            }else if(array[mid] > target){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }

        return lastIndex;

    }
}
