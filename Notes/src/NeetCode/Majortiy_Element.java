package NeetCode;

import java.util.HashMap;

public class Majortiy_Element {
    public static void main(String[] args) {

        System.out.println(answer(new int[] {3}));
        System.out.println(answer(new int[] {2,2,1,1,1,2,2}));

    }
    public static Integer answer(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        Integer ans = 0;

        for(int i = 0; i < arr.length; i++){
            Integer count = map.get(arr[i]);
            if(count == null){
                map.put(arr[i], 1);
            }else{
                map.put(arr[i], count++);
            }
            if(count != null) {
                if (ans < count) {
                    ans = count;
                }
            }

        }

        return ans;


    }
}
