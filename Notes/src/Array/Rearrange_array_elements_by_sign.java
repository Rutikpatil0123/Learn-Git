package Array;

public class Rearrange_array_elements_by_sign {
public static void main(String[] args) {
        solutionOne(new Integer[] {2, 4, 5, -1, -3, -4});
        //rearrangeBySign(new int[] {2, 4, 5, -1, -3, -4});
    }
    public static void solutionOne(Integer[] nums){
        Integer pIndex = 0;
        Integer nIndex = 1;
       

        Integer[] ans = new Integer[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < 0){
                ans[nIndex] = nums[i];
                nIndex += 2;
            }else{
                ans[pIndex] = nums[i];
                pIndex += 2;
 
            }

        }

        for(int i = 0; i < ans.length; i++){
            System.out.print(ans[i] + " > ");
        }
       
    }

    public static void rearrangeBySign(int[] A) {
        int n = A.length;

        // Result array initialized to size n
        int[] ans = new int[n];

        // posIndex for even indices (positive), negIndex for odd (negative)
        int posIndex = 0, negIndex = 1;

        // Traverse input array
        for (int i = 0; i < n; i++) {
            if (A[i] < 0) {
                // Place negative number at odd index
                ans[negIndex] = A[i];
                negIndex += 2;
            } else {
                // Place positive number at even index
                ans[posIndex] = A[i];
                posIndex += 2;
            }
        }

        for(int i = 0; i < ans.length; i++){
            System.out.print(ans[i] + " > ");
        }
       
    }

    /*
        Given an integer array nums of even length consisting of an equal number of positive and negative integers.Return the answer array in such a way that the given conditions are met:


    Every consecutive pair of integers have opposite signs.


    For all integers with the same sign, the order in which they were present in nums is preserved.


    The rearranged array begins with a positive integer.

Examples:

Input : nums = [2, 4, 5, -1, -3, -4]

Output : [2, -1, 4, -3, 5, -4]

Explanation:

The positive number 2, 4, 5 maintain their relative positions and -1, -3, -4 maintain their relative positions

Input : nums = [1, -1, -3, -4, 2, 3]

Output : [1, -1, 2, -3, 3, -4]

Explanation:

The positive number 1, 2, 3 maintain their relative positions and -1, -3, -4 maintain their relative positions
    */

}
