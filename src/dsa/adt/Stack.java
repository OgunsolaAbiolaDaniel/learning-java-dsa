package dsa.adt;

public interface Stack <T> {
    /**
     * push a generic element <code>e</code> to the top of the Stack;
     * */
    public void push(T e);
    /**
     * Remove an element at the top of the stack (or return null if is Empty);
     * */
    public void pop();
    /**
     * returns the element at the top of the Stack;
     * */
    public T top();
    /**
     * returns the number of elements in the stack
     * */
    public int size();
    /**
     * returns a boolean value indicating whether the stack is Empty or not
     * */
    public boolean isEmpty();

    /**
     * displays the contents of the stack;
     * */
    public void display();

}
