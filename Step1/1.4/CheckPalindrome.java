
public class CheckPalindrome {

	public static void main(String[] args) {

		int k = 1324231;
		
		int p =reverse(k);
		System.out.println(p);
		if(p==k)
			System.out.println("palindrom");
		else
			System.out.println("Not palindorm");
	}
	
	public static int reverse(int n) {
		int reverse =0;
		while(n!=0) {
			int digit = n%10;
			reverse = reverse*10 + digit;
			//System.out.println(reverse);
			n = n/10;
		}
		return reverse;
	}

}
