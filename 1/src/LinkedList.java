public class LinkedList {

    private Node head;
    private Node tail;

    public LinkedList() {
        head = null;
    }

    public class Node {
        public int data; //-данные узла.
        public Node next; //-ссылка на следующий узел.

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }
}
