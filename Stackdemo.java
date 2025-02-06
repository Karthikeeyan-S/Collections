package collectionp;

import java.util.Stack;

class Stackdemo
{
	static void showPush(Stack<Integer> s, int a)
	{
		s.push(a);
		System.out.println(a);
	}
	static void showPop(Stack<Integer> s)
	{
		System.out.println(s.pop());
	}
	public static void main(String [] args)
	{
		Stack<Integer> s = new Stack<>();
		showPush(s,10);
		showPush(s,20);
		showPush(s,30);
		
		showPop(s);
		showPop(s);
		showPop(s);
		try
		{
			showPop(s);
		}
		catch(Exception e)
		{ 
			System.out.println(e);
		}
	}
}

