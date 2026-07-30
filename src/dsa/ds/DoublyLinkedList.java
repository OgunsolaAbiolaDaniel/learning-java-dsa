package dsa.ds;

public class DoublyLinkedList <T> {
    //same as sll:- singly linked list but addition of previous
    /*
    i am using sentinels here i.e null headers and trailers
    size(): Returns the number of elements in the list.
isEmpty(): Returns true if the list is empty, and false otherwise.
first(): Returns (but does not remove) the first element in the list.
last(): Returns (but does not remove) the last element in the list.
addFirst(e): Adds a new element to the front of the list.
addLast(e): Adds a new element to the end of the list.
removeFirst(): Removes and returns the first element of the list.
removeLast(): Removes and returns the last element of the list.
  */

    public static class Node<T>{
        private T data;
        private Node next;
        private Node prev;
        public Node(T e){
            this.data = e;
            prev = null;
            next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public DoublyLinkedList(){
        this.head=new Node(null);
        this.tail=new Node(null);
        head.next=tail;
        tail.prev= head;
        this.size=0;
    }

    public int getSize(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public T first(){
        if(head.next==null||head.next==null){
            return null;
        }
        else{
            return (T) head.next.data;
        }

    }

    public T last(){
        if(tail.prev==null||tail.prev==head){
            return null;
        }
        else{
            return (T) tail.prev.data;
        }
    }


    public void addFirst(T e){
        Node newNode = new Node(e);
        if(isEmpty()){
            head.next = newNode;
            newNode.prev= head;
            newNode.next = tail;
            tail.prev = newNode;

        }
        else {
            Node currentHead = head.next;
            head.next=newNode;
            newNode.prev=head;
            newNode.next=currentHead;
            currentHead.prev = newNode;
        }
        size++;
    }


    public void addLast(T e ){
        Node newNode = new Node (e);
        if(isEmpty()){
            head.next = newNode;
            newNode.prev = head;
            newNode.next=tail;
            tail.prev = newNode;
        }else{
            Node currentTail = tail.prev;
            tail.prev=newNode;
            newNode.next= tail;
            newNode.prev = currentTail;
            currentTail.next= newNode;
        }
        size ++;
    }

    public void removeFirst(){
        if(isEmpty()){
            System.out.print("Empty Doubly List");
            return;
        }else if (head.next==tail.prev){
            //we have removed the only data;
            head.next=tail;
            tail.prev=head;
            System.out.print("List is now Empty");
        }
        else{
            Node currentHead = head.next;
            Node nextHead = currentHead.next;
            head.next = nextHead;
            nextHead.prev = head;
        }
        size--;
    }


    public void removeLast(){
        if(isEmpty()){
            System.out.print("Empty Doubly List");
            return;
        }else if (head.next==tail.prev){
            //we have removed the only data;
            head.next=tail;
            tail.prev= head;
            System.out.print("List is now Empty");

        }
        else{
            Node currentTail = tail.prev;
            Node nextTail =currentTail.prev;
            tail.prev = nextTail;
            nextTail.next = tail;
        }
        size--;
    }
}
