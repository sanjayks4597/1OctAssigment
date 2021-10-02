import java.util.Scanner;

public class CheckOddorEvenBitwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value :");
		
		int val=sc.nextInt();
		int mask=1;
		
		if((val|mask)==val)
		{
			System.out.println("value is odd...");
		}
		else
		{
			System.out.println("value is even...");
		}

	}

}
