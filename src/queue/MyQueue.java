package queue;

public class MyQueue {
	
	MyNode head;
	MyNode tail;
	int size = 0;
	
	public MyQueue(){
		head = new MyNode(null);
		tail = head;
		//head.setNextNode(tail);
	}
	
	public void push(String data){
		MyNode newNode = new MyNode(data);
		tail.setNextNode(newNode);
		tail = newNode;
	}
	
	public MyNode pop(){
		return null;
	}
	
	
	public static void main(String[] args){
		MyQueue queue = new MyQueue();
		queue.push("1");
		queue.push("2");
	}
}
