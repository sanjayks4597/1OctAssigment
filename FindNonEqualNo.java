import java.util.Scanner;

public class FindNonEqualNo {

	public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter your array");
		 int val[] =new int[8];
		 
		 for(int i=0;i<val.length;i++)
		 {
			 val[i]=sc.nextInt();
		 }
		 
		 for(int i=0;i<val.length;i++)
		 {
			 for(int j=i+1;j<val.length;j++)
			 {
				if((val[i]^val[j])==0)
				{
					val[i]=0;
					val[j]=0;
				}
			 }
		 }
		 
		 for(int i=0;i<val.length;i++)
		 {
			 if(val[i]!=0)
			 {
				 System.out.println("Non repeating values: "+val[i]);
			 }
		 }
		 

	}

}
