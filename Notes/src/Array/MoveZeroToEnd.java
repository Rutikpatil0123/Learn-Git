package Array;

//Given an integer array nums, move all the 0's to the end of the array. The relative order of the other elements must remain the same.

// This must be done in place, without making a copy of the array.

public class MoveZeroToEnd {

    public static void main(String[] args) {
        System.out.println("Hello");

        int []firstArray = {0, 1, 4, 0, 5, 2};
        ArrayTUF.printArray(firstArray);
        solution(firstArray);
        ArrayTUF.printArray(firstArray);

        int []secondArray = {0, 0, 0, 1, 3, -2};
        ArrayTUF.printArray(secondArray);
        solution(secondArray);
        ArrayTUF.printArray(secondArray);
    }

    public static void solution(int []arr){

        if(arr.length == 1){
            return;
        }

        int firstIndex = 0;
       
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                int temp = arr[firstIndex];
                arr[firstIndex] = arr[i];
                arr[i] = temp;
                firstIndex++;
            }
        }

       
    }
   
}

