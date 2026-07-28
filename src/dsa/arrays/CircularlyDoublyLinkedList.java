package dsa.arrays;

public class CircularlyDoublyLinkedList<T> {

    public static class Node<T>{
        private T data;
        private Node next;
        private Node prev;
        public Node(T data){
            this.data = data;
            this.next=null;
            this.prev=null;
        }
    }


    private Node sentinel;
    private int size;

    public CircularlyDoublyLinkedList(){
        this.sentinel=new Node(null);
        sentinel.prev=sentinel;
        sentinel.next=sentinel;
        size= 0;
    }

    public int getSize(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public T first (){
        if(isEmpty()||sentinel.next==sentinel){
            return null;
        }
        Node head = sentinel.next;
        return (T)head.data;
    }
    public T last (){
        if(isEmpty()||sentinel.prev==sentinel){
            return null;
        }
        Node tail = sentinel.prev;
        return (T)tail.data;
    }
    public void addfirst(T e){
        Node newNode = new Node(e);
        if(isEmpty()){
            sentinel.next=newNode;
            newNode.next=sentinel;
            newNode.prev=sentinel; //   next---prev--->
            sentinel.prev=newNode;  //sentinel->newnode->sentinel
        }
        else{
            Node currentHead = sentinel.next;
            sentinel.next= newNode;
            newNode.prev=sentinel;
            newNode.next=currentHead;
            currentHead.prev=newNode;
        }
        size ++;

    }
    public void addLast(T e){
        Node newNode = new Node(e);
        if(isEmpty()){
            sentinel.next=newNode;
            newNode.next=sentinel;
            newNode.prev=sentinel; //   next---prev--->
            sentinel.prev=newNode;  //sentinel->newnode->sentinel
        }
        else{
            Node currentTail = sentinel.prev;
            currentTail.next= newNode;
            sentinel.prev=newNode;
            newNode.next=sentinel;
            newNode.prev=currentTail;
        }
        size ++;

    }


    public void removefirst(){
        if(isEmpty()){
            System.out.print("Empty List");
            return;
        }else if (getSize()==1 || sentinel.next==sentinel.prev){
            sentinel.next= sentinel;
            sentinel.prev=sentinel;
            System.out.println("List is Now Empty !");
           size--;
        }
        else{
            Node currentHead= sentinel.next;
            Node newHead = currentHead.next;
            sentinel.next = newHead;
            newHead.prev=sentinel;
            size--;
        };

    }

    public void  removelast(){
        if(isEmpty()){
            System.out.print("Empty List");
            return;
        }
        else if (getSize()==1 || sentinel.next==sentinel.prev){
            sentinel.next= sentinel;
            sentinel.prev=sentinel;
            System.out.println("List is Now Empty !");
            size--;
        }
        else {
            Node currentTail = sentinel.prev;
            Node newTail = currentTail.prev;
            sentinel.prev=newTail;
            newTail.next=sentinel;
            size --;
        }
    }



}
