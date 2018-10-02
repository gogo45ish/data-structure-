package edu.bu.datastructures.list;

public class Queue<T> {
	LinkedList<T> list = new LinkedList<T>();
	
	
	public void enqueue(T x) {
		list.add(0 , x);
	}
public T deueue() {
		return list.remove(list.getSize()-1);
		 
	}
}