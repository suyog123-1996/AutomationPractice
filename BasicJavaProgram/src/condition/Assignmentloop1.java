package condition;

public class Assignmentloop1 {

	public static void main(String[] args) {
		int num=12345,rev=0;
		while(num!=0) {
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
			System.out.println(rev);
	}

}
