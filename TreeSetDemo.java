package collectionp;

import java.util.*;

class TreeSetDemo
{
	public static void main(String [] args)
	{
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(10);
		ts.add(20);		//adds an element to the TreeSet
		ts.add(30);
		ts.add(40);
		ts.add(50);
		ts.add(60);
		Iterator<Integer> it = ts.iterator();		// Initializes an iterator for this TreeSet
		System.out.println("Before Operation");
		while(it.hasNext())		//checks whether there is elements in the TreeSet to be visited
		{
			System.out.println(it.next());
		}
		ts.floor(50); // returns the immediate lower element lower than or equal to the number
		ts.ceiling(50); // returns the immediate higher element lower than or equal to the number
		//ts.clear();	// clears the TreeSet completely
		System.out.println(ts.contains(50));  // returns a true/false when an element is present or not
		ts.first(); // returns the first i.e, smallest element in the TreeSet
		ts.last();	// returns the last i.e, largest element in the TreeSet
		ts.higher(50); // returns the immediate higher element which is strictly greater than the mentioned value
		ts.lower(60); // returns the immediate lower element which is strictly smaller then the mentioned value
		ts.size(); // returns the size of the TreeSet
		ts.pollFirst();	// returns the first element of the TreeSet and removes it from the same
		ts.pollLast(); // return the last element of the TreeSet and removes it from the same
		System.out.println("After Operation");
		Iterator<Integer> it1 = ts.descendingIterator(); // Implements a method to iterate the TreeSet in descending order using descendingIterator()
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
		
	}
}