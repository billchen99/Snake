package queue;

import model.Block;

public class MyNode {

    // Fields
    private Block data;
    private MyNode next;
    private MyNode previous;

    // constructor
    public MyNode(Block data) {
        this(data,null);
    }

    // constructor two with Node parameter
    public MyNode(Block data, MyNode node) {
        this.data = data;
        next = node;
    }

    /**
     * Methods below return information about fields within class
     * */

    // @return the data
    public Block getData() {
        return data;
    }

    // @param String data to this.data
    public void setData(Block data) {
        this.data = data;
    }


    public MyNode getNext() {
        return next;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }


    public MyNode getPrevious() {
        return previous;
    }
    // @param Node next set to this.next
    public void setPrevious(MyNode previous) {
        this.previous = previous;
    }
}