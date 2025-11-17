package Array;

// Given an integer array of size n containing distinct values in the range from 0 to n (inclusive), return the only number missing from the array within this range.

public class FindMissingNumber {
    public static void main(String[] args) {
        System.out.println("Hello");
        int []firstArray = {0, 2, 3, 1, 4};
        int []secondArray = {0, 1, 2, 4, 5, 6};
        System.out.println(solution(secondArray));
        System.out.println(solution(firstArray));
    }

    public static int solution(int []arr){

        int size = arr.length;
        int totalSum = size*(size+1)/2;

        int arraySum = 0;

        for(int i = 0; i < size; i++){
            arraySum += arr[i];
        }

        return totalSum-arraySum;
    }

   
}

