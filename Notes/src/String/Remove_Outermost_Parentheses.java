package String;

public class Remove_Outermost_Parentheses {

    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println(solution("()(()())(())"));
    }

    /*
     * A valid parentheses string is defined by the following rules:

It is the empty string "".
If A is a valid parentheses string, then so is "(" + A + ")".
If A and B are valid parentheses strings, then A + B is also valid.


A primitive valid parentheses string is a non-empty valid string that cannot be split into two or more non-empty valid parentheses strings.



Given a valid parentheses string s, consider its primitive decomposition: s = P1 + P2 + ... + Pk, where Pi are primitive valid parentheses strings.



Return s after removing the outermost parentheses of every primitive string in the primitive decomposition of s.


Examples:
Input: s = "((()))"

Output: "(())"

Explanation:

The input string is a single primitive: "((()))".

Removing the outermost layer yields: "(())".

Input: s = "()(()())(())"

Output: "()()()"

Explanation:

Primitive decomposition: "()" + "(()())" + "(())"

After removing outermost parentheses: "" + "()()" + "()"

Final result: "()()()".
     */


    public static String solution(String s){

        int counter = 0;
        String ans = "";
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == ')'){
                counter--;
            }
            if(counter != 0){
                ans += ch;
            }
            if(ch == '('){
                counter++;
            }
        }
        return ans;

    }
    
}
