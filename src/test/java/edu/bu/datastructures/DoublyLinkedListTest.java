package edu.bu.datastructures;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.bu.datastructures.list.ArrayBasedList;
import edu.bu.datastructures.list.LinkedList;
import edu.bu.datastructures.list.DoublyLinkedList;
public class DoublyLinkedListTest {

	@Test
	public void testAddAtPos() {
		DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();
		
		list.add(5);
		list.add(68);
		list.add(45);
		list.add(7);
		list.add(8);
		list.add(12);
		list.add(3 , 50);
		
		assertEquals(50, (int) list.get(3));
		
	}
	@Test
	public void testSet() {
		DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();
		
		list.add(5);
		list.add(68);
		list.add(45);
		list.add(7);
		list.add(8);
		list.add(12);
		list.set(3, 50);
		
		assertEquals(50, (int) list.get(3));
		
	}
	@Test
	public void testRemove() {
		DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();
		
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		
		assertEquals(7, (int) list.remove(2));
		
		
	}
	
	
	
}
