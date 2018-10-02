package edu.bu.datastructures.list;

public class DoublyCircularLinkedList<T> extends DoublyLinkedList<T> implements CircularList<T> {

	@Override
	public void add(T x) {
		super.add(x);
		getTail().setNext(getHead());
		getHead().setPrev(getTail());
	}
	public void reverse() {
		setHead(getHead().getPrev());
		setTail(getTail().getNext());
		
	}
	@Override
	public void rotate() {
		// size()>0?
		setHead(getHead().getNext());
		setTail(getTail().getNext());
	}

}
