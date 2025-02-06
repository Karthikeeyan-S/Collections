package collectionp;

import java.util.*;

class HashSetDemo
{
	public static void main(String [] args)
	{
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(2);
		System.out.print(hs);
	}
}