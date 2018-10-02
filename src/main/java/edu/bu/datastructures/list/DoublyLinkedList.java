package edu.bu.datastructures.list;

import edu.bu.datastructures.list.LinkedList.Node;

public class DoublyLinkedList<T> implements List<T> {
	private Node<T> head;
	private Node<T> tail;
	private int size;

	public DoublyLinkedList() {
	}

	public int size() {
		return size;
	}

	public T get(int i) {
		// TODO check if i<0 or i>=size--> throw exception
		if(i < 0 || i >= size) {
			new IndexOutOfBoundsException();
		}
			
		T data = getData(i);
		return data;
	}

	public void set(int index, T x) {
		// TODO: impelement the set method and its test cases
		if(x == null) {
			throw new NullPointerException();
		}
		int i = 0;
		Node<T> currNode = getHead();
		while (i != index ) {
			currNode = currNode.getNext();
			i++;
		}
		currNode.setData(x);
		
	}

	public void add(int index, T x) {
		// TODO implement this method and its tests
		if(x == null) {
			throw new NullPointerException();
		}
		
		Node<T> newNode = new Node<T>();
		newNode.setData(x);
		newNode.setNext(null);
		newNode.setPrev(null);
		
		
		int i = 0;
		Node<T> currNode = getHead();
		while (i != index - 1) {
			currNode = currNode.getNext();
			i++;
			
		} 
		newNode.setNext(currNode.getNext());
		currNode.setNext(newNode);
		newNode.setPrev(currNode);
		currNode.getNext().setPrev(newNode);
		size++;
	}

	public void add(T x) {
		Node<T> newNode = new Node<T>();
		newNode.setData(x);
		newNode.setNext(null);
		newNode.setPrev(null);
		if (size == 0) {
			setHead(newNode);
			setTail(newNode);
		} else {
			newNode.setPrev(getTail());
			getTail().setNext(newNode);
			setTail(newNode);
		}
		size++;
	}

	public T remove(int i) {
		// TODO implement the remove method and its test case
		
		Node<T> p = getHead();
		
	    if (i == 0) {
	        head = head.getNext();
	        getHead().setPrev(null);
	        size --;
	        return p.getData();
	    }else if (i == size-1) {
	    	Node<T> q = getTail();
	        tail = tail.getPrev();
	        getTail().getNext().setPrev(null);
	        getTail().setNext(null);
	    
	        tail.setNext(null);
	        size--;
	        return q.getData();
	    } else {
	    	int j = 0;
			while (j != i) {
				p = p.next;
				j++;
				
			}
			p.getPrev().setNext(p.getNext());
			p.getNext().setPrev(p.getPrev());
			p.setPrev(null);
			p.setNext(null);
			
	/*		Node<T> q = p.getPrev();
			Node<T> c = p.getNext();
			
			q.next = p.next;
			c.prev = p.prev;
			p.prev = null;
			p.next = null;*/
			
		size--;
		return p.getData();		
	    }

	}
	
	public void removeFirstPos(Node<T> p) {
		setHead(getHead().getNext());
		head = head.next;
		head.prev = null;
		p.next = null;
		
	}
	public void removeLastPos(Node<T> p ) {
		Node<T> temp = new Node<T>();	
		
		if(head == tail) {
			head = null;
		}else {
			tail.prev.next = null;
		}
			tail = tail.prev;
			temp.prev = null;
			size--;
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

	public class Node<T> {
		private T data;
		private Node<T> next;
		private Node<T> prev;

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

		public Node<T> getPrev() {
			return prev;
		}

		public void setPrev(Node<T> prev) {
			this.prev = prev;
		}
	}
	// TODO: implement the test cases for each public method in this class

	public void rotate() {
		// TODO Auto-generated method stub
		
	}
	
}

	


