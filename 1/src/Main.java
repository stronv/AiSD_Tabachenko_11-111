public class Main {
    public static void main(String[] args) {

        //Проверка для очереди:
        Queue queue = new Queue();
        queue.enqueue(3);
        queue.enqueue(7);
        queue.enqueue(9);
        queue.dequeue();
        queue.print();

        System.out.println(" ");
        //Проверка для стэка:
        Stack stack = new Stack();
        stack.push(3);
        stack.push(8);
        stack.push(11);
        stack.print();

//        int peek_check = stack.peek();
//        System.out.println();
//        System.out.println(peek_check);


    }
}
