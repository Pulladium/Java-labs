package cz.cvut.fel.pjv;


/**
 * @author Palladxd
 */
/**
 * Implementation of the {@link Queue} backed by fixed size array.
 */
public class CircularArrayQueue implements Queue {

    private final Object[] items;
    int r_pivot = 0;
    int w_pivot = 0;



    /**
     * Creates the queue with capacity set to the value of 5.
     */
    public CircularArrayQueue() {
        this(5);
    }


    /**
     * Creates the queue with given {@code capacity}. The capacity represents maximal number of elements that the
     * queue is able to store.
     * @param capacity of the queue
     */
    public CircularArrayQueue(int capacity) {
        this.items = new Object[capacity];
    }

    @Override
    public int size() {
        int size = 0;
        for(Object obj : items){
            if(obj != null){
                size++;
            }
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        for (Object obj : items){
            if(obj != null){
                return false;
            }
        }
        return true;

    }

    @Override
    public boolean isFull() {
        //xd
        for(Object obj : items){
            if(obj == null){
                return false;
            }
        }
        return true;
//        if((w_pivot+1) % (items.length+1) == r_pivot ){
//            return true;
//        }

//        return false;
    }

    @Override
    public boolean enqueue(String obj) {
        if( obj == null){
            return false;
        }
        if(isFull()){
            return false;
        }
        items[w_pivot] = obj;
        w_pivot = (w_pivot + 1) % items.length;

        return true;
    }

    @Override
    public String dequeue() {
        if(isEmpty()){
            return null;
        }
        //chanee val
        String val = (String) items[r_pivot];
        items[r_pivot] = null;
        r_pivot = (r_pivot + 1) % items.length;
        return val;


    }

    @Override
    public void printAllElements() {
        for (Object obj : items){
            if(obj != null){
                System.out.println(obj);
            }
        }
    }
}
