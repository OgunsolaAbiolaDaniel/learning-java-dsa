package dsa.arrays;

public class CircularLinkedList<T> {

    public static class Node<T>{
        private T data;
        private Node next;
        public  Node(T data){
            this.data= data;
           this.next =  null;
        };
    };


    private Node tail; //we dont have an head;
    private int size;


    public CircularLinkedList() {
        this.tail = null;
        this.size = 0;
    }
    public int size() {return size; }


    public boolean isEmpty(){
        return size==0;
    }
    //return the first number i.e the head;
    public T first(){
        if(isEmpty()){
            return null;
        }
        else{
            Node first = tail.next;
            return (T)first.data;
        }
    };
    public T last(){
        return (T) tail.data;
    }
    public void display(){
        if (isEmpty()||tail==null){
            System.out.println("Empty List");
        }
        else{
            Node first = tail.next;
            while(first!=tail.next){
                System.out.print(first.data +"");
                first = first.next;
            }
        }
    }

    public void addFirst(T e){

        Node newnode = new Node(e);
        //if list is empty ?
        if(isEmpty()){
            tail=newnode;
            newnode.next=tail;
        }else{
            Node head = tail.next;
            tail.next = newnode;
            newnode.next=head;

        }
        size++;
    }

    public void addLast(T e){
       addFirst(e);
       tail=tail.next;

    }
    // hold he
    public void rotate(){
        Node head = tail.next;
       if(tail!=null){

           tail = tail.next;
       };
    }
    //removeFirst ;
    public void removefirst(){
        if(isEmpty()){
            System.out.print("Empty List");
        }else {
            Node head = tail.next;
            if(head==tail){
                //if its only one element i.e the selfloop- head = tail;
                tail=null;
            }else{
                tail.next = head.next;
            }
            size--;
        }

    }







}
