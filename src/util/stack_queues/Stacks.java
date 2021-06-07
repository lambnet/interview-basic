package util.stack_queues;

public class Stacks {
    public static class Node{
        Node next;
        int data;
        public Node(int data){
            this.data = data;
        }
    }
    private Node top; // push and pop at top

    public boolean isEmpty(){
        return top == null;
    }
    public int peek(){
        if(top == null){
            return -1;
        }
        return top.data;
    }
    public void push(int data){
        Node node = new Node(data);
        node.next = top;
        top = node;
    }
    public int pop(){
        int data = top.data;
        top=top.next;
        return data;
    }
}
