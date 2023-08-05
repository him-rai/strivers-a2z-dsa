
public class Example {

	public static void main(String[] args) {

		int k = 78765432;
		int count =1;
		while(true) {
			int div =10;
			if(k/div == 0) {
				break;
			}else {
				k=k/10;
				count++;
			}
			
		}
		System.out.println(count);
	}

}
