package Sorting;

public class MergeSortAlgo {

    public void mergeSort(int arr[], int start, int end){

        if(start < end) {
            int mid = (end + start) / 2;

            mergeSort(arr, start, mid);
            mergeSort(arr, mid+1, end);

            merge(arr,start, mid, end);
        }
    }

    public void merge(int arr[], int start, int mid, int end){
        int size1 = mid - start + 1;
        int size2 = end - mid;

        int temp1[] = new int[size1];
        int temp2[] = new int[size2];

        for(int i = 0; i < size1; i++){
            temp1[i] = arr[start+i];
        }

        for(int i = 0; i < size2; i++){
            temp2[i] = arr[mid+1+i];
        }

        int i = 0, j = 0;
        int k = start;

        while(i < size1 && j < size2){
            if(temp1[i] <= temp2[j]){
                arr[k++] = temp1[i++];
            }else{
                arr[k++] = temp2[j++];
            }
        }

        while(i < size1){
            arr[k++] = temp1[i++];
        }

        while (j < size2){
            arr[k++] = temp2[j++];
        }
    }

    public void printArray(int arr[]){
        System.out.println();
        for (int j : arr) {
            System.out.print(j + "-> ");
        }
    }
    public static void main(String[] args) {
        MergeSortAlgo mergeSortAlgo = new MergeSortAlgo();
        int arr[] = {43,6,3,7,4};
        mergeSortAlgo.printArray(arr);
        mergeSortAlgo.mergeSort(arr,0,arr.length-1);
        mergeSortAlgo.printArray(arr);

    }
}
