package NeetCode;

import java.util.HashMap;
import java.util.Map;

public class Valid_Anagram {
    public static void main(String[] args) {
        //isAnagram("anagram", "nagaram");
    }

/*
    static boolean isAnagram(String s ,String t){
        Map<Character, Integer> map = new HashMap();
        for(Integer i = 0; i < s.length(); i++){
            if(!map.containsKey(map[s.charAt(i)])){
                map[(Character)s.charAt(i)] = 1;
            }else{
                map[s.charAt(i)]++;
            }

        }

        for(Integer i = 0; i < t.length(); i++){
            if(!map.containsKey(t.charAt(i))){
                return false;
            }else
                map[(Character)t.charAt(i)]--;
        }
        
       for (int i = 0; i < map.size(); i++){
           if(map[(Character)s.charAt(i)] != 0){
               return false;
           }
       }
       return true;
    }*/
}
