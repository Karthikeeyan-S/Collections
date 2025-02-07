package collectionp;

import java.util.*;

class DequeueDemo
{
	public static void main(String [] args)
	{
		Deque<Integer> d = new ArrayDeque<Integer>();
		d.add(10); d.offer(60); d.offerLast(70); // adds an element at the last, offer is preferred as it doesn't throw an exception 
		d.addFirst(20); d.offerFirst(50); d.push(90); // adds an element at first
		d.addLast(30); // adds an element at last
		//d.clear(); // Clears the Deque completely
		d.contains(30); // returns true if the specified element is present and if not returns false
		System.out.println(d.element()); // returns the first element of the deque
		d.getFirst(); // returns the first element of the deque
		d.getLast(); // returns the last element of the deque
		d.peek(); d.peekFirst(); // returns first element of the deque
		d.peekLast(); // returns the last element of the deque
		d.poll(); d.pollFirst(); // retrives and removes the first element of the deque 
		d.pollLast(); // retrives and removes the last element of the deque
		d.size(); // returns the size of the deque
	}
}