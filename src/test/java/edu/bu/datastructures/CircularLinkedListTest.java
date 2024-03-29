package edu.bu.datastructures;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.bu.datastructures.list.CircularLinkedList;

public class CircularLinkedListTest {

	@Test
	public void testRotate() {
		CircularLinkedList<Integer> list = new CircularLinkedList<Integer>();
		list.add(3);
		list.add(0, 5);
		list.add(20);
		list.rotate();
		assertEquals(3, (int) list.get(0));
		assertEquals(20, (int) list.get(1));
		assertEquals(5, (int) list.get(2));
		assertEquals(3, list.size());
	}
	//TODO: add some more tests here (test more combinations of actions)
	@Test
	public void testRotate1() {
		CircularLinkedList<Integer> list = new CircularLinkedList<Integer>();
		list.add(3);
		list.add(0, 5);
		list.add(20);
		list.add(18);
		list.rotate();
		assertEquals(3, (int) list.get(0));
		assertEquals(20, (int) list.get(1));
		assertEquals(18, (int) list.get(2));
		assertEquals(5, (int) list.get(3));
		assertEquals(4, list.size());
	}

}



