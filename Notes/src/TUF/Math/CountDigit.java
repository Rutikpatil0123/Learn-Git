import java.util.*;

public class CountDigit{

	public static void main(String args[]){
		System.out.println("Hello");
		Integer ans = numberOfDigits(1355);
		System.out.println(ans);
		System.out.println(optimal(12243));

	}

	public static Integer numberOfDigits(int n){
		Integer count = 0;

		while(n > 0){
			n = n/10;
			count++;
		}

		return count;
	}

	public static int optimal(int n){
		int ans = (int) (Math.log10(n) + 1);
		return ans;
	}
}

