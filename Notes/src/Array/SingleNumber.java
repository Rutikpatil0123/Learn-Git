package Array;

import java.util.HashMap;

public class SingleNumber {

    public static void main(String args[]){
        System.out.println("Hello");

        int []firstArray  = {1, 2, 2, 4, 3, 1, 4};
        //int ans = solution(firstArray);
        int ans = optimalSolution(firstArray);
        System.out.println(ans);
    }

    public static int solution(int arr[]){
        HashMap<Integer, Boolean> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], false);
            }else{
                map.put(arr[i], true);
            }
        }

        int ans = 0;

        for(HashMap.Entry<Integer,Boolean> entry : map.entrySet()){
            if(entry.getValue() == true){
                ans = (int) entry.getKey();
                return ans;
            }
        }
        return ans;
    }

    public static int optimalSolution(int []arr){
        int count = arr[0];

        for(int i = 1; i < arr.length; i++){
            count ^= arr[i];
        }

        return count;
    }
   
}

