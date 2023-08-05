
public class ReverseANumber {

	public static void main(String[] args) {
		
		int k = 89143567;
		
		int numOfDigit = numOfDigit(k);
		//System.out.println(numOfDigit);
		
		int newNum =0;
		
			while(k/10 !=0) {
				int digit = k%10;
				k = k/10;
				newNum = (int) (newNum + digit*(Math.pow(10,numOfDigit-1 )));
				numOfDigit--;
				//System.out.println(newNum);
			}
			newNum = newNum+k;
		System.out.println(newNum);
	}
	
	public  static int numOfDigit(int k) {
		int count =1;
		while(k/10 !=0) {
			k = k/10;
			count++;
		}
		return count;
	}

}
