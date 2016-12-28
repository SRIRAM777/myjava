import java.util.Scanner;


public class fullrev {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{

		int []a=new int[100];
		Scanner sca = new Scanner(System.in);
		System.out.println("enter the string");
		String s = sca.nextLine();
		int n= s.length();
		int i,j,k=1;
		a[0]=0;
		
		for(i=0;i<n;i++)
		{
			if(s.toCharArray()[i]==' ')
			{
				a[k]=i;
				k++;
			}		
		}
		char b;
		a[k]=n;
		String ans="";
		i=1;
		while(i<=k)
		{
			for(j=a[i]-1;j>=a[i-1];j--)
			{	
			b=s.toCharArray()[j];
			ans+=b;
			}
			i++;
			ans+=" ";
		}
		System.out.println(""+ans);
	}

}

/*
enter the string
hello world
olleh dlrow  
*/
