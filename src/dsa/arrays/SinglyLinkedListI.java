package dsa.arrays;

public interface SinglyLinkedListI <T> {
    /**
     * adds a new node to the beginning of the list
     * */
    void  addFirst(T e);
    void addLast(T e);
    void removeFirst ();
    void  removeLast();
    T last();
    T first();
}
