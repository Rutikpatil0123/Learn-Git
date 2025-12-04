package BinarySearch;

public class Search_Single_Element_in_a_sorted_array {

    public static void main(String[] args) {
        System.out.println("Hello");
    }

    /*
     * Given an array nums sorted in non-decreasing order. Every number in the array except one appears twice. Find the single number in the array.


        Examples:
        Input :nums = [1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6]

        Output:4

        Explanation: Only the number 4 appears once in the array.

        Input : nums = [1, 1, 3, 5, 5]

        Output:3

        Explanation: Only the number 3 appears once in the array.
     */

     public static Integer solution(Integer[] array){
        Integer low = 0;
        Integer high = array.length-1;

        while (low <= high) {
            Integer mid = low + (high - low) / 2;
            if(array[mid] != array[mid -1] && )
        }
     }
    
}
