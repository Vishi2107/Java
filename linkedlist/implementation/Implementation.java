public class Implementation {
    public static class Node {
        int data;
        Node next;
        
        public Node(int data) {
            this.data = data;
        }
    }

    public static class linkedlist {
        Node head = null;
        Node tail = null;
        int size = 0;

        void insertAtEnd(int val) {
            // Create a new node
            Node temp = new Node(val);

            // Check if the linked list is empty
            if (head == null) {
                // If empty, make the new node the head and the tail
                head = temp;
            } else {
                // If not empty, append the new node to the end of the list
                tail.next = temp;
            }
            // Update the tail to be the new node
            tail = temp;
            size++;
        }

        void insertAtHead(int val) {
            // Create a new node
            Node temp = new Node(val);

            // Check if the linked list is empty
            if (head == null) {
                // If empty, make the new node both the head and the tail
                head = tail = temp;
            } else {
                // If not empty, insert the new node at the beginning of the list
                temp.next = head;
                head = temp;
            }
            size++;
        }

        void insertAtIndex(int idx, int val) {
            // Create a new node
            Node t = new Node(val);
            // Find the node at the previous index
            Node temp = head;
            
            // Handle the case where the index is 0 (inserting at the head)
            if (idx == 0) {
                insertAtHead(val);
                return;
            }
            else if(idx == size) {
                insertAtEnd(val);
                return;
            }

            for (int i = 1; i < idx-1; i++) {
                if (temp == null || temp.next == null) {
                    // If the index is out of bounds, do not insert
                    return;
                }
                temp = temp.next;
            }

            // Insert the new node at the given index
            t.next = temp.next;
            temp.next = t;
            size++;
        }

        int getAt(int idx){
            // Find the node at the given index
            Node temp = head;
            for(int i=1; i<=idx-1; i++){
                temp = temp.next;
            }
            return temp.data;
        }

        void deleteAt(int idx){
            // Handle the case where the index is 0 (deleting the head)
            if(idx == 0){
                head = head.next;
                size--;
                return;
            }
            // Find the node at the given index
            Node temp = head;

            for(int i=1; i<=idx-1; i++){
                temp= temp.next;
            }
            // Delete the node at the given index
            temp.next = temp.next.next;
            tail = temp;
            size--;
        }

        void display() {
            // Start from the head and traverse the linked list
            Node temp = head;
            while (temp != null) {
                // Print the data of each node
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

        // int size() { //O(n)
        //     // Start from the head and count the number of nodes
        //     Node temp = head;
        //     int count = 0;
        //     while (temp != null) {
        //         count++;
        //         temp = temp.next;
        //     }
        //     return count;
        // }
    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();

        // Insert nodes at the end of the linked list
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.insertAtEnd(6);

        // Display the linked list
        ll.display();
        System.out.println();

        // Insert nodes at the head of the linked list
        ll.insertAtHead(3);
        ll.insertAtHead(2);

        // Display the linked list
        ll.display();
        System.out.println();

        // Insert nodes at the given index
        ll.insertAtIndex(4, 7);
        ll.display();
        System.out.println();

        // Insert nodes at the given index
        ll.insertAtIndex(2, 9);
        ll.display();
        System.out.println();

        // Delete the node at the given index
        ll.deleteAt(2);
        ll.display();

        // Display the data at the given index
        System.out.println(ll.getAt(4));

        // Display the size of the linked list
        System.out.println("Size: " + ll.size);
    }
}