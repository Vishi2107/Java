// package linkedlist;

public class LengthLL {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
    public static int length(Node head){
        int count = 0;
        while(head!=null){
            count++;
            head = head.next;
        }
        return count;
    }
    public static void main(String[] args) {
        Node a = new Node(5); 
        Node b = new Node(10);
        Node c = new Node(15);
        Node d = new Node(20);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = null;
        System.out.println(length(a));
    }
    
}
