package CollectionsDemo;

import java.util.*;

class LinkedHashSetDemo
{
	public static void main(String [] args)
	{
		LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(40);
		hs.add(50);
		hs.remove(40);
		Iterator<Integer> i = hs.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}