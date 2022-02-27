public class Stack extends LinkedList {
    private Node head;
    private int cnt;

    void push(int data) {
        Node node = new Node(data);
        Node currNode = head;

        if (head == null) {
            head = node;
            cnt++;
        } else {
            while (currNode.next != null) {
                currNode = currNode.next;
            }
            currNode.next = node;
            cnt++;
        }
    }

    void pop() {
        Node currNode = head;
        Node prevNode = head;

        if (head != null) {
            while (currNode.next != null) {
                prevNode = currNode;
                currNode = currNode.next;
            }
            prevNode.next = null;
            cnt--;
        } else {
            throw new ArrayIndexOutOfBoundsException("Stack is empty!");
        }
    }

    void isEmpty() {
        if (cnt > 0) {
            System.out.println("Number of elements: " + cnt);
        } else {
            throw new ArrayIndexOutOfBoundsException ("Stack is emty!");
        }
    }

    int peek() {
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        return currNode.data;
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
