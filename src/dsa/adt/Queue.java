package dsa.adt;


// generic type queue;
public interface Queue<T> {
    /**
     * add element to the back of the queue;
     * */
    public void enqueue();
    /**
     * Removes and returns the first element from the queue
     * */
    public void dequeue();
    /**
     * returns the first element of the queue without removing it from the queue
     * (or null if the queue is empty).
     * */
    public T first();
    /**
     * returns the number of elements in the queue;
     * */
    public int size();
    /***
     * returns  boolean indicating whether the queue isEmpty()
     */
}
