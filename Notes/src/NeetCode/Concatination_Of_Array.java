package NeetCode;

public class Concatination_Of_Array {
    public static void main(String[] args) {
        int nums[] = {1,2,1};
        int ans[] = getConcatenation(nums);
        for (Integer i : ans){
            System.out.print(i + "-> ");
        }
    }

    static int[] getConcatenation(int [] nums){
        int ans[] = new int[nums.length*2];
        for(int i = 0; i < nums.length; i++){
            ans[i] = nums[i];
            ans[i+nums.length] = nums[i];
        }
        return ans;
    }
}
