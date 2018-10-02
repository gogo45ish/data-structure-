package edu.bu.datastructures;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.bu.datastructures.list.ArrayBasedList;

public class ArrayBasedListTest {
	@Test
	public void testSizeOfEmptyList() {
		ArrayBasedList<Integer> list = new ArrayBasedList<Integer>();
		assertEquals(0, list.size());
	}

	@Test
	public void testAddingToList() {
		ArrayBasedList<Integer> list = new ArrayBasedList<Integer>();
		list.add(3);
		assertEquals(3, (int) list.get(0));
	}

	@Test
	public void testAddingToListAtPosition() {
		ArrayBasedList<Integer> list = new ArrayBasedList<Integer>();
		list.add(3);
		list.add(0, 5);
		
		int actual = (int) list.get(0);
		assertEquals(5, actual);
		
		assertEquals(2, list.size());
	}

	@Test
	public void testRemovingFromList() {
		ArrayBasedList<Integer> list = new ArrayBasedList<Integer>();
		list.add(3);
		list.add(4);
		Integer removed = list.remove(1);
		assertEquals(4, (int) removed);
		assertEquals(1, list.size());
	
	}
	@Test
	public void testRemovingFromEmptyList() {
		ArrayBasedList<Integer> list = new ArrayBasedList<Integer>();
		list.add(3);
		list.add(5);
		Integer removed = list.remove(1);
		assertEquals(5, (int) removed);
	
	
	}
	@Test
	public void testAddingToFullList() {
		ArrayBasedList<Integer> list = new ArrayBasedList<Integer>();
		list.add(3);
		list.add(5);
		list.add(4);
		list.add(1);
		list.add(9);
		list.add(8);
		list.add(7);
		list.add(6);
		list.add(5);
		
		
		assertEquals(3, (int) list.get(0));
		assertEquals(9, list.size());
	}
	// TODO: add more tests 1) test removing from empty list 2)adding to full list
	// 3)add test for cases that expect exception
}
