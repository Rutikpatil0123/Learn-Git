package NeetCode;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Contains_Duplicate{

    public static void main(String[] args) {
        System.out.println(containsDuplicate(new Integer[]{1, 2, 3, 4}));
        System.out.println(containsDuplicate(new Integer[] {1,2,3,1}));
    }

    static boolean containsDuplicate(Integer []nums){
        Set<Integer> set = new HashSet<>();
        Collections.addAll(set,nums);
        if (set.size() == nums.length){
            return false;
        }
        return true;
    }
}
