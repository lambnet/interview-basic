package util.stack_queues;

public class Queues {
    public static class Node{
        private Node next;
        private int data;

        public Node(int data){
            this.data = data;
        }
    }
    private Node head;  // remove from head
    private Node tail; // add thing at tail

    public boolean isEmpty(){
        return head == null;
    }
    public int peek(){
        if(head == null){
            return -1;
        }
        return head.data;
    }
    public void add(int data){
        Node node = new Node(data);
        if(tail != null){
            tail.next = node;
        }
        tail = node;
        if(head == null){
            head = node;
        }
    }
    public int remove(){
        int data = head.data;
        head = head.next;
        if(head == null){
            tail = null;
        }
        return data;
    }
}
