package String;

public class Rotate_String {

    public static void main(String[] args) {
        System.out.println("Try!");
        System.out.println(solution("abcde", "cdeab"));
        System.out.println(solution("abcde", "abced"));
    }

    public static boolean solution(String input, String goal){

        if(input.length() != goal.length()){
            return false;
        }

        String temp = input + input;

        if(temp.contains(goal)){
            return true;
        }else{
            return false;
        }
    }
   
}

