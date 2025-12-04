package BinarySearch;

public class Floor_and_Ceil_in_Sorted_Array {

    public static void main(String[] args) {
        
        System.out.println("Hello");
        Integer[] arrayOne = {3, 4, 4, 7, 8, 10};
        soultion(arrayOne, 5);

        Integer[] arrayTwo = {3, 4, 4, 7, 8, 10};
        soultion(arrayTwo, 8);
    }

    /*

     *Given a sorted array nums and an integer x. Find the floor and ceil of x in nums. The floor of x is the largest element in the array which is smaller than or equal to x. The ceiling of x is the smallest element in the array greater than or equal to x. If no floor or ceil exists, output -1.


        Examples:
        Input : nums =[3, 4, 4, 7, 8, 10], x= 5

        Output: 4 7

        Explanation: The floor of 5 in the array is 4, and the ceiling of 5 in the array is 7.

        Input : nums =[3, 4, 4, 7, 8, 10], x= 8

        Output: 8 8

        Explanation: The floor of 8 in the array is 8, and the ceiling of 8 in the array is also 8. 
     * 
     */
    
     public static Integer[] soultion(Integer[] array, Integer target){

        Integer[] ans = new Integer[2];

        ans[1] = findCeilingValue(array, target);
        ans[0] = findFloorValue(array, target);

        System.out.println(ans[0] + " " + ans[1]);

        return ans;

        
     }

     public static Integer findCeilingValue(Integer[] array, Integer target){

        Integer ans = -1;

        Integer low = 0;
        Integer high = array.length-1;

        while (low <= high) {

            Integer mid = low + (high - low) / 2;
            if(array[mid] >= target){
                ans = array[mid];
                high = mid - 1;
            }else{
                low = mid + 1;
            }
            
        }

        return ans;
     }

     public static Integer findFloorValue(Integer[] array, Integer target){

        Integer ans = -1;

        Integer low = 0;
        Integer high = array.length-1;

        while (low <= high) {

            Integer mid = low + (high - low) / 2;
            if(array[mid] <= target){
                ans = array[mid];
                low = mid + 1;
            }else{
                high = mid - 1;
                
            }
            
        }

        return ans;
     }
}
