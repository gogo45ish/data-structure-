package edu.bu.datastructures.list;

public class LinkedList<T> implements List<T> {
	private Node<T> head;
	private Node<T> tail;
	private int size;

	public LinkedList() {
	}

	public int size() {
		return size;
	}

	public T get(int i) {
		// TODO check if i<0 or i>=size--> throw exception

		if(i < 0 || i >= size) {
			throw new ArithmeticException ();
		}
			

		T data = getData(i);
		return data;
	}


	public void set(int index, T x) {
		// TODO: impelement the set method and its test cases
		int i = 0;
		Node<T> currNode = getHead();
		while (i != index ) {
			currNode = currNode.getNext();
			i++;
		}
		currNode.setData(x);
		

	}

	public void add(int index, T x) {
		// TODO check if dataIndex is valid

		if (x == null) {
			throw new NullPointerException();
		}

		Node<T> newNode = new Node<T>();
		newNode.setData(x);

		if (index == 0) {
			addFirstPositionNode(newNode);
			return;
		}

		int i = 0;
		Node<T> currNode = getHead();
		while (i != index - 1) {
			currNode = currNode.getNext();
			i++;
		}
		newNode.setNext(currNode.getNext());
		currNode.setNext(newNode);
		size++;

	}

	public void add(T x) {
		Node<T> newNode = new Node<T>();
		newNode.setData(x);
		newNode.setNext(null);
		if (size == 0) {
			setHead(newNode);
			setTail(newNode);
		} else {
			getTail().setNext(newNode);
			setTail(newNode);
		}
		size++;
	}

	public T remove(int i) {
		// TODO implement the remove method and its test case

		Node<T> prev = getHead();
		int c = 0;
		while (c != i - 1) {
			prev = prev.getNext();
			i++;
		}
		Node<T> currNode = prev.next;
		prev.setNext(currNode.getNext());
		currNode.setNext(null);

		return null;
	}

	public int getSize() {
		return size;
	}

	private T getData(int index) {
		int i = 0;
		Node<T> currData = getHead();
		while (i != index) {
			currData = currData.getNext();
			i++;
		}

		return currData.data;
	}

	private void addFirstPositionNode(Node<T> newNode) {
		newNode.setNext(getHead());
		setHead(newNode);
		size++;
	}

	public Node<T> getHead() {
		return head;
	}

	public void setHead(Node<T> head) {
		this.head = head;
	}

	public Node<T> getTail() {
		return tail;
	}

	public void setTail(Node<T> tail) {
		this.tail = tail;
	}

	class Node<T> {
		private T data;
		private Node<T> next;

		public T getData() {
			return data;
		}

		public void setData(T data) {
			this.data = data;
		}

		public Node<T> getNext() {
			return next;
		}

		public void setNext(Node<T> next) {
			this.next = next;
		}
	}


	public void rotate() {
		// TODO Auto-generated method stub
		
	}

}

