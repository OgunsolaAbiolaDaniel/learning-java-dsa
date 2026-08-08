package dsa.ds;

import dsa.adt.List;

public interface SinglyLinkedListI <T> extends List {
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
