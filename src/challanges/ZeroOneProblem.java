package challanges;


public class ZeroOneProblem
{
	public static void main(String[] args) 
	{
		int a[]={0,1,0,1,1,0,1,1,1,0,0,1,0};
		int i,j,tmp;
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				if(a[i]==1)
				{
					tmp=a[j];
					a[j]=a[i];
					a[i]=tmp;
				}
			
				
			}
		}
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		
		
		
	}

}