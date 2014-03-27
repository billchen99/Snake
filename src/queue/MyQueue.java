package queue;

public class MyQueue {
	// fields
	private MyNode head;
	private MyNode last;
	private int size = 0;

	// constructor, used when the class is first called
	public MyQueue() {
		head = last = null;
	}

	// add method
	public void push(String s) {
		if (head == null){
			head = last = new MyNode(s);
			return;
		}

		last.setNext(new MyNode(s));
		last = last.getNext();
		size++;

	}

	// remove method, if it returns false then the specified index element doens not exist
	// otherwise will return true
	@SuppressWarnings("null")
	public String pop() {
		if (head == null){
			return null;
		}
		
		String result = head.getData();
		MyNode current = head;
		head = current.getNext();
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

	// @param (index) will get the data at specified index
	public String getData(int index) {

		if(index <= 0) {
			return null;
		}

		MyNode current = head.getNext();
		for(int i = 1;i < index;i++) {
			if(current.getNext() == null) {
				return null;
			}
			current = current.getNext();
		}

		return current.getData();
	}

	//@param will check if the arguement passed is in the list
	// will return true if the list contains arg otherwise false
	public boolean contains(String s) {
		for(int i = 1;i<=size();i++) {
			if(getData(i).equals(s)) {
				return true;
			}
		}
		return false;
	}

	//@return contents of the list - recursively 
	public String toString() {
		MyNode current = head.getNext();
		String output = "[";
		while(current != null) {
			output += current.getData()+",";
			current = current.getNext();
		}
		return output+"]";
	}

	//@return first node
	public MyNode getHead() {
		return head;
	}

	// @return (recursively) list
	public void print(MyNode n) {
		if(n == null) {
			return;
		}else {
			System.out.println(n.getData());
			print(n.getNext());
		}
	}

	public static void main(String[] args){
		MyQueue mylist = new MyQueue();
		mylist.push("1");
		mylist.push("2");
		mylist.push("3");
		System.out.println(mylist.pop());
		System.out.println("***********");
		mylist.push(mylist.pop());
		mylist.print(mylist.getHead());
	}

}
