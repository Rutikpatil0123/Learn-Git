package Array;

//Given an integer array nums, rotate the array to the left by one.

// Note: There is no need to return anything, just modify the given array.

public class LeftRorateArrayByOne {

    public static void main(String[] args) {
        System.out.println("Hello");
       
        int []firstArray = {1,2,3,4,5};
        ArrayTUF.printArray(firstArray);
        soulution(firstArray);
        ArrayTUF.printArray(firstArray);
    }

    public static void soulution(int []arr){
        int temp = arr[0];
        arr[0] = arr[arr.length-1];
        arr[arr.length-1] = temp;
    }


   
}

