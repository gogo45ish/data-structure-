package edu.bu.datastructures.list;

public class Stack<T> {
	LinkedList<T> list = new LinkedList<T>();

	public void push(T x) {
		list.add(x);
	}

	public T pop() {
		return list.remove(list.getSize() - 1);
	}
}