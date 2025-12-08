package String;

import java.util.Stack;

public class Reverse_every_word_in_a_string {

    public static void main(String[] args) {
        System.out.println("Hello");
        String a = solution("welcome to the jungle");
        System.out.println(a);
        String temp = optimalSolution("welcome to the jungle");
        temp += " ";
        helper(temp);
    }

    /*
     * Given an input string, containing upper-case and lower-case letters, digits, and spaces( ' ' ). A word is defined as a sequence of non-space characters. The words in s are separated by at least one space.



    Return a string with the words in reverse order, concatenated by a single space.


    Examples:
    Input: s = "welcome to the jungle"



    Output: "jungle the to welcome"



    Explanation: The words in the input string are "welcome", "to", "the", and "jungle". Reversing the order of these words gives "jungle", "the", "to", and "welcome". The output string should have exactly one space between each word.

    Input: s = " amazing coding skills "



    Output: "skills coding amazing"



    Explanation: The input string has leading and trailing spaces, as well as multiple spaces between the words "amazing", "coding", and "skills". After trimming the leading and trailing spaces and reducing the multiple spaces between words to a single space, the words are "amazing", "coding", and "skills". Reversing the order of these words gives "skills", "coding", and "amazing". The output string should not have any leading or trailing spaces and should have exactly one space between each word.


     */

    public static String solution(String input){
        String temp = "";
        input += " ";
        Stack<String> st = new Stack<>();
        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) != ' '){
                temp += (input.charAt(i));
            }else{
                st.push(temp);
                temp = "";

            }
        }

        st.push(temp);
        while (!st.isEmpty()) {
            temp += st.peek();
            temp += " ";
            st.pop();
        }    
        temp = temp.strip();
        return temp;

    }

    public static String optimalSolution(String input){
        StringBuilder sb = new StringBuilder();
        for(int i = input.length()-1; i >= 0; i--){
            sb.append(input.charAt(i));
        
        }
        return sb.toString();
    }

    public static void helper(String input){
        String ans = "";
        String temp = "";
        for(int i = 0; i < input.length(); i++){
            char a = input.charAt(i);
            if(a != ' '){
                temp += a;
            }else{
                ans += optimalSolution(temp);
                ans += " ";
                temp = "";
            }
        }
        System.out.println(ans);
    }
    
}
