package dsa.ds;

public interface List<T> {
    /**
     * returns a boolean value if List is Empty
     */
    public boolean isEmpty();

    /**
     * returns the size of the list
     */

    public int size();

    /**
     * add an element <code>e</code> element to the start of the list;
     */
    public void addFirst(T e);
    /**
     * add an element <code>e</code> to the end of the list;
     * */
    public void addLast();

    /**
     *
     * */


}
