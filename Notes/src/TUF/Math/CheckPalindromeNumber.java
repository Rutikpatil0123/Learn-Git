public class CheckPalindromeNumber{

	public static void main(String args[]){
		System.out.println("Get");
		System.out.println(validPalindrome("bomob"));
	}

	public static boolean validPalindrome(String input){
		int lastindex = input.length()-1;
		System.out.println(input.charAt(lastindex));
		int firstindex = 0;
		while(firstindex < lastindex){
			if(input.charAt(firstindex) != input.charAt(lastindex)){
				return false;
			}
			firstindex++;
			lastindex--;
		}
		return true;
	}
}