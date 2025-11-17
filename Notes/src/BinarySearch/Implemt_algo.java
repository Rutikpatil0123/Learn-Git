package BinarySearch;

public class Implemt_algo {
    public static void main(String[] args) {
        System.out.println("Hello");
        Integer []Array = {3, 4, 6, 7, 9, 12, 16, 17};
        Integer ans = solution(Array, 15);
        System.out.println(ans);

        Integer []secondArray = {-1,0,3,5,9,12};
        Integer newAnswer = recursiveSolution(secondArray, 0, secondArray.length-1, 4);
        System.out.println(newAnswer);

        Integer []thirdArray = {1,2,2,3};
        Integer lowerBoundAnswer = lowerBound(thirdArray, 2);
        System.out.println(lowerBoundAnswer);

        Integer []fourthArray = {3,5,8,15,19};
        Integer temp = lowerBound(fourthArray, 9);
        System.out.println(temp);

        Integer []arrayNumberFive = {1,2,2,3};
        Integer answerNumberFive = upperBound(arrayNumberFive, 2);
        System.out.println(answerNumberFive);
       
    }

    public static Integer solution(Integer []Array, Integer target){

        Integer low = 0;
        Integer high = Array.length-1;
        Integer mid;

        while (low <= high) {
            mid = low + (high-low)/2;

            if(Array[mid] == target){
                return mid;
            }else if(Array[mid] < target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }

        return -1;
    }

    public static Integer recursiveSolution(Integer []Array, Integer low, Integer high, Integer target){
        if(low > high){
            return -1;
        }

        Integer mid = low + (high-low)/2;

        if(Array[mid] == target){
            return mid;
        }else if(Array[mid] < target){
            return recursiveSolution(Array, mid+1, high, target);
        }else{
            return recursiveSolution(Array, low, mid-1, target);
        }

    }

    /*Given a sorted array of nums and an integer x, write a program to find the lower bound of x.

    The lower bound algorithm finds the first and smallest index in a sorted array where the value at that index is greater than or equal to a given key i.e. x.

    If no such index is found, return the size of the array.

    Input : nums= [1,2,2,3], x = 2

    Output:1

    Explanation:

    Index 1 is the smallest index such that arr[1] >= x.

    */
    public static Integer lowerBound(Integer []Array, Integer target){

        Integer low = 0;
        Integer high = Array.length-1;
        Integer mid = 0;
        Integer ans = -1;
        while (low <= high) {
            mid = low + (high - low)/2;

            if(Array[mid] >= target){
               ans = mid;
               high = mid - 1;
            }else{
               low = mid + 1;
            }
        }
        return ans;
       
    }

    /*
     Given a sorted array of nums and an integer x, write a program to find the upper bound of x.

    The upper bound of x is defined as the smallest index i such that nums[i] > x.

    If no such index is found, return the size of the array.

    Input : n= 4, nums = [1,2,2,3], x = 2

    Output:3

    Explanation:

    Index 3 is the smallest index such that arr[3] > x.
    */

    public static Integer upperBound(Integer []array, Integer target){

        Integer low = 0;
        Integer high = array.length-1;
        Integer mid = 0;
        Integer ans = -1;

        while(low <= high) {

            mid = low + (high - low) / 2;

            if(array[mid] > target){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
           
        }

        return ans;
    }


   
}

