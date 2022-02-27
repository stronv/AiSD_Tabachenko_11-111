public class Queue extends LinkedList {
    private Node head;
    private Node tail;
    public int length = 0;

    public void enqueue(int data) {
        Node node = new Node(data);
        Node nextHead;

        if (head == null) {
            head = node;
            tail = node;
            length++;
        } else {
            nextHead = head;
            head = node;
            head.next = nextHead;
            length++;
        }
    }

    public void dequeue() {
        Node currNode = head;
        Node prevNode = head;

        while (currNode.next != null) {
            prevNode = currNode;
            currNode = currNode.next;
        }
        prevNode.next = null;
        tail = prevNode;
        length--;
    }

    public int check() {
        return tail.data;
    }

    public int getLength() {
        return length;
    }

    void print() {
        Node currNode = head;

        if (head != null) {
            System.out.println(head.data);
        }

        while (currNode.next != null) {
            currNode = currNode.next;
            System.out.println(currNode.data);
        }
    }
}
