package Array;

public class LeftRotateArrayByKPlaces {

    public static void main(String[] args) {
        System.out.println("Hello");

        int []firstArray = {1,2,3,4,5,6,7};

        ArrayTUF.printArray(firstArray);
        solution(firstArray,3);
        ArrayTUF.printArray(firstArray);

    }

    public static void solution(int[] arr, int d){
        int arraySize = arr.length;
        d = d % arraySize;

        reverse(arr, 0, arraySize-d-1);
        reverse(arr, arraySize-d, arraySize-1);
        reverse(arr, 0, arraySize-1);

    }

    public static void reverse(int[] arr, int start, int end){
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }


   
}

