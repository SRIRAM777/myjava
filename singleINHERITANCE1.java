

 class pranay
{
	int []a=new int[100];
    String ans="";
	String s;
	String find(String s)
	{
		int n= s.length();
		
		
		ans+=s.toCharArray()[0];
		for(int i=0;i<n;i++)
		{
			if(s.toCharArray()[i]==' ')
			{
				ans+=s.toCharArray()[1+i];
			}		
		}
		return ans;

		
	}
	
}

public class srl extends pranay
{


			/**
			 * @param args
			 */
			public static void main(String[] args) 
			{
				String ans;
				srl demo =new srl();
				ans=demo.find("hello");
				
				System.out.println("ans="+ans);
		}

	}


/*
ans=h
*/
