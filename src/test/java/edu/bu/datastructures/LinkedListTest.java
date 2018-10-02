package edu.bu.datastructures;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.bu.datastructures.list.ArrayBasedList;
import edu.bu.datastructures.list.LinkedList;
import edu.bu.datastructures.list.Stack;
import edu.bu.datastructures.list.Queue;

public class LinkedListTest {
	@Test
	public void testSizeOfEmptyList() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		assertEquals(0, list.size());
	}

	@Test
	public void testSizeOfList() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(3);
		list.add(4);
		assertEquals(2, list.size());
	}

	@Test
	public void testAddingToList() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(3);
		assertEquals(3, (int) list.get(0));
	}

	@Test
	public void testAddingToListAtPosition() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(3);
		list.add(0, 5);
		assertEquals(5, (int) list.get(0));
		assertEquals(3, (int) list.get(1));
		assertEquals(2, list.size());
	}

	// TODO add remove test

	@Test(expected = NullPointerException.class)
	public void testRemove() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(3);
		list.add(0, 5);
		list.add(4);
		list.add(6);
		Integer removed = list.remove(2);
		assertEquals(5, (int) list.get(0));
		assertEquals(3, (int) list.get(1));
		assertEquals(6, (int) list.get(3));
		assertEquals(4, (int) removed);
	}
	@Test(expected = NullPointerException.class)
	public void testRemovingFromEmptyList() {
		LinkedList<Integer> list = new LinkedList<Integer>();		
		Integer removed = list.remove(1);
		assertEquals(4, (int) removed);
	
	
	}
	@Test
	public void testAddingToFullList() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(3);
		list.add(5);
		list.add(4);
		list.add(1);
		list.add(9);
		list.add(8);
		list.add(7);
		list.add(6);
		list.add(5);
		list.add(10);
		assertEquals(3, (int) list.get(0));
		assertEquals(10, list.size());
	}
	public void testSetMethod() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(3);
		list.add(5);
		list.add(4);
		list.add(1);
		
	list.set(3, 0);
	
		assertEquals(3, (int) list.get(0));
		
	}
	
	public void testStack() {
		Stack<Integer> list = new Stack<Integer>();
		list.push(3);
		list.push(5);
		list.push(4);
		list.push(1);
		list.push(78);
	
	
		assertEquals(78, (int) list.pop());
		
	}
	@Test
	public void testQueue() {
		Queue<Integer> list = new Queue<Integer>();
		list.enqueue(3);
		list.enqueue(5);
		list.enqueue(4);
		list.enqueue(1);
		list.enqueue(78);
	
	
		assertEquals(3, (int) list.deueue());
	}
}

	// TODO: add more tests 1) test removing from empty list 2)adding to full list
	// 3)add test for cases that expect exception


