package Array;

public class Kadanes_Algorithm {

    public static void main(String[] args) {
        int firstTest = solution(new int[] {2, 3, 5, -2, 7, -4});
        System.out.println(firstTest);

        int secondTest = solution(new int[]{-2, -3, -7, -2, -10, -4});
        System.out.println(secondTest);
    }

    public static int solution(int[] array){
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];

            if(sum > maxSum){
                maxSum = sum;
            }

            if(sum < 0){
                sum = 0;
            }
        }

        return maxSum;
    }

    /*
 Given an integer array nums, find the subarray with the largest sum and return the sum of the elements present in that subarray.


A subarray is a contiguous non-empty sequence of elements within an array.
Examples:

Input: nums = [2, 3, 5, -2, 7, -4]

Output: 15

Explanation:

The subarray from index 0 to index 4 has the largest sum = 15

Input: nums = [-2, -3, -7, -2, -10, -4]

Output: -2

Explanation:

The element on index 0 or index 3 make up the largest sum when taken as a subarray  
    */
   
}

