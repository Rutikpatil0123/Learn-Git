public class ReverseDigitOfNumber{

	public static void main(String args[]){
		System.out.println("Hello");
		System.out.println(ReverseNumber(75840));
	}

	public static int ReverseNumber(int n){
		int ans = 0;

		while(n>0){
			int lastdigit = n%10;
			n = n/10;
			ans = ans*10+lastdigit;
		}

		return ans;
	}
}