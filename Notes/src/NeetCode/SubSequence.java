package NeetCode;

public class SubSequence {
    public static void main(String[] args) {
        System.out.println(iSSubSequence("axc", "ahbgdc"));
    }

    static boolean iSSubSequence(String s, String t){
        int i = 0;
        int j = 0;
        for(j = 0; j < t.length(); j++){
            if(i >= s.length()-1){
                break;
            }
            if(s.charAt(i) == t.charAt(j)){
                i++;
            }

            System.out.println(i);
            System.out.println(j);

        }

        if(i == s.length()-1){
            System.out.println(i);
            return true;

        }else {

            return false;
        }
    }
}
