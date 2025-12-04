package BinarySearch;


public class First_and_last_occurrence {

    public static void main(String[] args) {
        System.out.println("Hello");

        Integer[] arrayOne = {5, 7, 7, 8, 8, 10};
        solution(arrayOne, 8);

        solution(arrayOne, 6);
    }

    /*
     * Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value. If the target is not found in the array, return [-1, -1].


        Examples:
        Input: nums = [5, 7, 7, 8, 8, 10], target = 8

        Output: [3, 4]

        Explanation:The target is 8, and it appears in the array at indices 3 and 4, so the output is [3,4]
        Input: nums = [5, 7, 7, 8, 8, 10], target = 6

        Output: [-1, -1]

        Expalantion: The target is 6, which is not present in the array. Therefore, the output is [-1, -1].
     */

    public static Integer[] solution(Integer[] array, Integer target){
      
        Integer[] ans = new Integer[2]; 

        ans[0] = findFirstOccurrence(array, target);
        ans[1] = findLastOccurrence(array, target);

        System.out.println(ans[0] + " " + ans[1]);

        return ans;

    }

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
