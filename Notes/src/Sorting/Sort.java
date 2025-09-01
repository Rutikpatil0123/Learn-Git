public class Sort{

    public void bubleSort(int[] arr, int n){

        int i , j , temp;
        boolean swaped;

        for( i = 0; i  < n-1; i++){
            swaped = false;

            for( j = 0; j < n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaped = true;
                }
            }

            if(swaped == false){
                break;
            }
        }
    }

    public void selectionSort(int []arr){
        int n = arr.length;
        int minIndex;
        for(int i = 0; i < n-1; i++){
            minIndex = i;

            for(int j = i + 1; j < n; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public void insertionSort(int arr[]){
        int n = arr.length;
        for(int i = 1; i < n; i++){
            int j = i - 1;

            while (j >= 0 && arr[j] > arr[i]){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = arr[i];
        }
    }

    public void printArray(int []arr, int n){
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + "-> ");

        }

        System.out.println("");
    }

    public static void main(String[] args){
        System.out.println("Hello");

        int arr[] = {5,4,6,2,4,5};
        Sort s = new Sort();
        s.printArray(arr,6);
        s.insertionSort(arr);
        //s.selectionSort(arr);
        //s.bubleSort(arr,6);
        s.printArray(arr, 6);
    }
}