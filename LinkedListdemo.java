package collectionp;

import java.util.*;

class LinkedListdemo
{
	public static void main(String[] args)
	{
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Karthikeeyan");
		ll.add("Manasvini");
		ll.add("Keshav");
		ll.add(1,"Ashwini");
		ll.removeLast();
		Object [] a = ll.toArray();
		for(int i=0;i<ll.size();i++)
		{
			System.out.println(a[i]);
		}
	}
}