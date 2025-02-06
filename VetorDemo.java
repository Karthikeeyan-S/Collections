package collectionp;

import java.util.*;

class VectorDemo
{
	public static void main(String [] args)
	{
		Vector<String> v1 = new Vector<String>();
		
		v1.add("Karthikeeyan");
		v1.addElement("Parthiban");
		v1.add("Dheepash");
		Enumeration<String> e = v1.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
	}

	
}