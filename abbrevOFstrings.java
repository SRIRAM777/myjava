import java.util.Scanner;


public class srl{


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
				char b;
				a[k]=n;
				String ans="";
				i=0;
				while(i<k)
				{
					b=s.toCharArray()[a[i]];
					ans+=b;
					i++;
				}
				
				System.out.println("ans="+ans);
		}

	}

/*
enter the string
hello world
ans=hw
*/
