package NeetCode;

public class LeetCode_1299 {
    public static void main(String[] args) {
        int[] ans = alter(new int[]{17,18,5,4,6,1});
        for(int i : ans){
            System.out.print(i + "-> ");
        }
    }

    public static void hash(int[] arr){
        int[] temp;
        for(int i = 0; i < arr.length; i++){

        }
    }

    public static int[] alter(int arr[]){
        int temp = -1;
        for(int i = arr.length-1; i > 0; i--){
            if(arr[i] > temp){
                temp = arr[i];

            }else{
                arr[i] = temp;
            }
        }

        int[] ans = arr;
        for(int i : ans){
            System.out.print(i + "-> ");
        }
        return ans;
    }
}
