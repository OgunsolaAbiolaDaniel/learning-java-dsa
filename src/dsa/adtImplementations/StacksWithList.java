package dsa.adtImplementations;
import dsa.adt.Stack;
import dsa.ds.SinglyLinkedList;


public class StacksWithList<T> implements Stack{
    private SinglyLinkedList list = new SinglyLinkedList();

    @Override
    public void push(Object e) {
        list.addLast(e);
    }

    @Override
    public void pop() {
        list.removeLast();
    }

    @Override
    public T top() {
        if(isEmpty()){
            return null;
        }
     return (T) list.last();

    }
    public contains(){

    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
       return list.isEmpty();
    }

    @Override
    public void display() {
        list.display();
    }
}
