package edu.bu.datastructures;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.bu.datastructures.list.DoublyCircularLinkedList;
public class DoublyCircularListTest {
	@Test
	public void reverse() {
		DoublyCircularLinkedList<Integer> list = new DoublyCircularLinkedList<Integer>();
		
		list.add(5);
		list.add(68);
		list.add(45);
		list.add(7);
		list.add(8);
		list.add(12);
		list.rotate();
		list.reverse();
		
		assertEquals(5, (int) list.get(0));
		assertEquals(68, (int) list.get(5));
		
		
	}
}
