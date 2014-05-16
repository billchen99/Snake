package queue;

import model.Block;

public class MyQueue {
	// fields
	private MyNode tail;
	private MyNode head;
	private int size = 0;

	// constructor, used when the class is first called
	public MyQueue() {
		tail = head = null;
	}

	// If the queue is empty, set both tail and head to be the new Node
	// Otherwise push the new Node onto the head of the queue
	public void push(Block s) {
		size++;
		if (tail == null){
			head = tail = new MyNode(s);
			return;
		}
		
		MyNode newNode = new MyNode(s);
		newNode.setNext(head);
		head.setPrevious(newNode);
		head = newNode;
		
	}
	
	// If empty return null, otherwise remove the tail item and return it.
	@SuppressWarnings("null")
	public Block pop() {
		if(tail == null) return null;
	
		Block result = tail.getData();
		MyNode newTail = tail.getPrevious();
		newTail.setNext(null);
		tail = newTail;
		size--;
		return result;
	}
	//will return the size of the list - will return -1 if list is empty
	public int size() {
		return size;
	}

	// will check if the list is empty or not
	public boolean isEmpty() {
		return true;
	}

	//@return first node
	public MyNode getHead() {
		return head;
	}
	
	public MyNode getTail(){
		return tail;
	}

	public static void main(String[] args){
		MyQueue mylist = new MyQueue();
	}

}
