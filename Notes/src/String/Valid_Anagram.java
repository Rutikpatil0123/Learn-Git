package String;

import java.util.HashMap;
public class Valid_Anagram {

    public static void main(String[] args) {
        boolean ans = solution("anagram", "nagaram");
        System.out.println(ans);
        System.out.println(solution("dog", "cat"));
    }

    /*
     * Given two strings s and t, return true if t is an anagram of s, and false otherwise.



An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.


Examples:
Input : s = "anagram" , t = "nagaram"

Output : true

Explanation :

We can rearrange the characters of string s to get string t as frequency of all characters from both strings is same.

Input : s = "dog" , t = "cat"

Output : false

Explanation :

We cannot rearrange the characters of string s to get string t as frequency of all characters from both strings is not same.
     */

    public static boolean solution(String one, String two){
        if(one.length() != two.length()){
            return false;
        }
        HashMap<Character, Integer>  map= new HashMap<>();
        for(int i = 0; i < one.length(); i++){
            Character ch = one.charAt(i);
            if(map.containsKey(ch)){
                Integer temp = map.get(ch);
                //System.out.println(temp);
                map.put(ch, ++temp);
            }else{
                map.put(ch, 1);
            }
        }

        for(int i = 0; i < two.length(); i++){
            Character ch = two.charAt(i);
            if(map.containsKey(ch)){
                Integer temp = map.get(ch);
                //System.out.println(temp);
                map.put(ch, --temp);
            }
        }
        for (Integer value : map.values()) {
                if(value != 0){
                    System.out.println(value);
                    return false;
                }
            
        }
        return true;
    }
    
}
