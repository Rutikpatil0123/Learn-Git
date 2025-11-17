package Array;

 //Problem Statement: Given an array of size n, write a program to check if the given array is sorted in (ascending / Increasing / Non-decreasing) order or not. If the array is sorted then return True, Else return False.

public class IsSorted {

    public static void main(String[] args) {
       
        System.out.println("Hello");

        int []array = {1,5,7,8,15,23,23};
        int []secondArray = {76,55,44,18,12,8,4,2,3};
        boolean answer = checkSortedArray(array);
        boolean secondAnswer = checkSortedArray(secondArray);
        System.out.println(secondAnswer);
        System.out.println(answer);
    }

    public static boolean checkSortedArray(int []arr){

        if(arr.length <= 1){
            return true;
        }

        boolean temp = true;
        int size = arr.length;
        if(arr[0] <= arr[size-1]){
            temp = true;
        }else{
            temp = false;
        }

        for(int i = 1; i < size; i++){
            if(temp == true){
                if(arr[i] < arr[i-1]){
                    return false;
                }
            }else{
                if(arr[i] > arr[i-1]){
                    return false;
                }
            }
        }

        return true;
    }
}

