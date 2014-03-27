package queue;

public class MyNode {

    // Fields
    private String data;
    private MyNode next;

    // constructor
    public MyNode(String data) {
        this(data,null);
    }

    // constructor two with Node parameter
    public MyNode(String data, MyNode node) {
        this.data = data;
        next = node;
    }

    /**
     * Methods below return information about fields within class
     * */

    // @return the data
    public String getData() {
        return data;
    }

    // @param String data to this.data
    public void setData(String data) {
        this.data = data;
    }

    // @return next
    public MyNode getNext() {
        return next;
    }
    // @param Node next set to this.next
    public void setNext(MyNode next) {
        this.next = next;
    }

}