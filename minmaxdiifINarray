import java.util.Arrays;
import java.util.Scanner;


public class arrayminmax {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of elements");
		int n= sc.nextInt();
		System.out.println("enter the array");
		int i,j,min=0,max=0;
		int []a=new int[n];
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		Arrays.sort(a);
		int k;
		min=a[n-1];
		for(i=0;i<n;i++)
		{
			for(j=1+i;j<n;j++)
			{
				k=a[j]-a[i];
				if(k>max)
					max=k;
				if(k<min)
					min=k;
				//System.out.println(a[i]);
			}
		}
		System.out.println("min difference====="+min);
		System.out.println("max difference====="+max);
		
		// TODO Auto-generated method stub

	}

}
