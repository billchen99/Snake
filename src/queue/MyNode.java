package queue;

public class MyNode {
	private String data;
	private MyNode nextNode;
	
	public MyNode(String data){
		this.data = data;
	}
	
	public MyNode getNextNode(){
		return nextNode;
	}
	
	public void setNextNode(MyNode next){
		nextNode = next;
	}
	
	public String getData(){
		return data;
	}
	
	public void setData(String data){
		this.data = data;
	}
	
}