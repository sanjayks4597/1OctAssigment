import java.util.Scanner;

public class BitwiseOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Value :");
		
		int val=sc.nextInt();
		
		System.out.println("Enter Second Value :");
				
		int val2=sc.nextInt();
		
		int AndOperation=val&val2;
		int OrOperation=val|val2;
		
		System.out.println(" And Operation result:"+AndOperation);
		System.out.println(" OR Operation result:"+OrOperation);

	}

}
