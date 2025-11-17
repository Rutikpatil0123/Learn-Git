package Array;

// Given two sorted arrays nums1 and nums2, return an array that contains the union of these two arrays. The elements in the union must be in ascending order.

// The union of two arrays is an array where all values are distinct and are present in either the first array, the second array, or both.

public class UnionOfTwoSortedArrays {

    public static void main(String[] args) {
        System.out.println("Hello");

        int []firstArray = {1, 2, 3, 4, 5};
        int []secondArray = {1, 2, 7};

        int []answerArray = solution(firstArray, secondArray);
        ArrayTUF.printArray(answerArray);
    }

    public static int[] solution(int[] firstArray, int []secondArray){

        int firstIndex = 0;
        int secondIndex = 0;
        int thirdIndex = 0;

        int []answerArray = new int[firstArray.length+secondArray.length];

        while (firstIndex < firstArray.length && secondIndex < secondArray.length) {
            if(firstArray[firstIndex] == secondArray[secondIndex]){
                answerArray[thirdIndex] = firstArray[firstIndex];
                firstIndex++;
                secondIndex++;

            }else if(firstArray[firstIndex] < secondArray[secondIndex]){

                answerArray[thirdIndex] = firstArray[firstIndex];
                firstIndex++;
               
            }else{
                answerArray[thirdIndex] = secondArray[secondIndex];
                secondIndex++;
            }
            thirdIndex++;
        }

         while (firstIndex < firstArray.length){

            answerArray[thirdIndex] = firstArray[firstIndex];
            firstIndex++;
            thirdIndex++;
         }

         
         while (secondIndex < secondArray.length){

            answerArray[thirdIndex] = secondArray[secondIndex];
            secondIndex++;
            thirdIndex++;
         }

         return answerArray;
    }

   
}

