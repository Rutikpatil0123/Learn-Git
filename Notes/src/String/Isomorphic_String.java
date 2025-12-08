package String;

public class Isomorphic_String {

    public static void main(String[] args) {
        System.out.println("Try!");
        System.out.println(solution("egg", "add"));
        System.out.println(solution("apple", "bbnbm"));
    }

    public static boolean solution(String s, String c){
        if(s.length() != c.length()){
            return false;
        }
       
        int[] m1 = new int[256];
        int[] m2 = new int[256];

        for(int i = 0; i < s.length(); i++){
            if(m1[s.charAt(i)] != m2[c.charAt(i)]){
                return false;
            }

            m1[s.charAt(i)] = i + 1;
            m2[c.charAt(i)] = i + 1;
        }

        return true;
    }

    /*
   
Given two strings s and t, determine if they are isomorphic. Two strings s and t are isomorphic if the characters in s can be replaced to get t.


All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.
Examples:

Input : s = "egg" , t = "add"

Output : true

Explanation :

The 'e' in string s can be replaced with 'a' of string t.

The 'g' in string s can be replaced with 'd' of t.

Hence all characters in s can be replaced to get t.

Input : s = "apple" , t = "bbnbm"

Output : false

Explanation :

It can be proved that no solution exists for this example.

All the "b"s in t have to take places of "a", "p", "l", which requires "p" to be mapped to "b", but that makes it impossible for "p" at index 2 (0-indexed) to become "n". Thus no solution exists.
    */
   
}

