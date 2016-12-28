import java.util.Scanner;


public class prog1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int []a=new int[100];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String s = sc.nextLine();
		int n= s.length();
		int i,j,k=1;
		a[0]=0;
		
		
		for(i=0;i<n;i++)
		{
			if(s.toCharArray()[i]==' ')
			{
				a[k]=i+1;
				k++;
			
			}
				
		}
		a[k]=n;
		char b='a';
		
		String ans=" ";
		
		while(k>0)
		{
			
			for(j=a[k-1];j<a[k];j++)
			{
				 b = s.toCharArray()[j];
				ans+=b;
				
			}
			ans+=" ";
			k--;
			
		}
		
		System.out.println("the answer is = = = "+ans);
		


	}

}
/*
hello world
ans==world hello
*/
