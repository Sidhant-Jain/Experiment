package challanges;

import java.util.Queue;
import java.util.Stack;


public class Tech2 
{
	public static int max(Stack<Integer> st)
	{
		int max=0;
		for(Integer r:st)
		{
			if(st.empty())
			{
			break;
			}
			else if(r.intValue()>max)
			{
				max=r;
			}
		}
		//System.out.println(max);
		return max;	
	}
	public static void main(String[] args)
	{
		Stack<Integer> st=new Stack<Integer>();
		st.push(2);
		st.push(4);
		st.push(9);
		st.pop();
		st.push(10);
		st.push(3);
		st.push(1);
	   System.out.println(Tech2.max(st));		
	}

}
