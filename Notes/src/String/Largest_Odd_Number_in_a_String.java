package String;

public class Largest_Odd_Number_in_a_String {

    public static void main(String []args){
        System.out.println("Try!");
        solution("5347");
        solution("0214638");
        solution("0");
        solution("2");
        solution("1");
    }

    public static String solution(String s){

       int index = -1;
       for(int i = s.length()-1; i >= 0; i--){
            if((s.charAt(i) - 0) % 2 == 1){
                index = i;
                break;
            }
       }
       int i = 0;
       while(i <= index && s.charAt(i) == '0'){
        i++;
       }

      String temp = s.substring(i, index+1);
      System.out.println(temp);
      return temp;

    }

/*

Given a string s, representing a large integer, the task is to return the largest-valued odd integer (as a string) that is a substring of the given string s.


The number returned should not have leading zero's. But the given input string may have leading zero. (If no odd number is found, then return empty string.)
Examples:

Input : s = "5347"

Output : "5347"

Explanation :

The odd numbers formed by given strings are --> 5, 3, 53, 347, 5347.

So the largest among all the possible odd numbers for given string is 5347.

Input : s = "0214638"

Output : "21463"

Explanation :

The different odd numbers that can be formed by the given string are --> 1, 3, 21, 63, 463, 1463, 21463.

We cannot include 021463 as the number contains leading zero.

So largest odd number in given string is 21463.

*/
   
}

