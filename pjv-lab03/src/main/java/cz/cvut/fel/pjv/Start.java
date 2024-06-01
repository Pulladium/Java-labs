package cz.cvut.fel.pjv;

/**
 * @author Jirka Sebek
 */
public class Start {

    public static void main(String[] args) {

         
        /*  */
//        Queue queue = new CircularArrayQueue(10);
//
//        queue.enqueue("Starkiller");
//        queue.enqueue("C-3PO");
//        queue.enqueue("Jabba the Hutt");
//        queue.enqueue("HK-47");
//        queue.enqueue("Darth Nihilus");
//        queue.enqueue("Count Dooku");
//        System.out.println("size: " + queue.size());
//        System.out.println("Value dequeued from CircularArrayQueue: " + queue.dequeue());
//        System.out.println("printing all elements: ");
//        queue.printAllElements();
//        queue.enqueue("Jango Fett");
//        System.out.println("size: " + queue.size());



        Queue queue2 = new CircularArrayQueue(6);
        queue2.enqueue("LOPO");
        queue2.enqueue("wither dosquh");
        queue2.enqueue("Siloweq");
        queue2.enqueue("Kilow");
        queue2.enqueue("Molow");
        queue2.enqueue("Nolow");

        System.out.println("Is the queue full? " + queue2.isFull());


        System.out.println("size: " + queue2.size());
        System.out.println("Value dequeued from CircularArrayQueue: " + queue2.dequeue());
        System.out.println("printing all elements: ");

        queue2.enqueue("Jango Fett");

        queue2.printAllElements();
        System.out.println("size: " + queue2.size());
    }
}
