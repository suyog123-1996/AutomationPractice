package condition;

public class Assignmentloop {
	//couny of an integer
	public static void main(String[] args) {
		int num=12345,count=0;
		while(num>0) {
			num=num/10;
			count++;
		}
		System.out.println("count of number is=" +count);
	}

}
