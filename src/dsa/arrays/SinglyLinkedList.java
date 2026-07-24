package dsa.arrays;

public class  SinglyLinkedList <T> {

    private static class ListNode<T>{
        private T data;
        private ListNode next;

        public ListNode(T data){
            this.data= data;
            this.next= null;
        }
    }

    private ListNode head = null;
    private int size;

//head




    //print function ;
    public void display(){
         ListNode current = head;
         while(current!=null){
             System.out.print(current.data +"->");
             current= current.next;
         }

    }


    //size function
    public int size(){
         ListNode current = head;
         int counter = 0 ;
         while (current!=null){
             counter++;
            current=current.next ;
         }
         size = counter;
         return size ;
    }

    public T first(){
        ListNode first = head;
        if(first== null){
            System.out.print("Empty List");
        }
         return (T)first.data;
    }
    public T last(){
        ListNode current = head;
        if (size == 0){
            System.out.print("Empty");
        }
        while(current.next!=null){
            current =  current.next;
        };
        return (T) current.data;
    }
    public void  addFirst(T e){
        ListNode current = head;
        ListNode newhead = new ListNode(e);
        newhead.next=current;
        head=newhead;
        size++;
    }

    public void addLast(T e){
        ListNode current = head;
        ListNode newNode = new ListNode<>(e);
                while(current.next!= null){
                    current= current.next;
                }
                current.next=newNode;
                newNode.next=null;
                size++;
    }

    public void removeFirst (){
        ListNode current = head;
        ListNode newHead ;
       if(size==0 || head == null){
           System.out.print("empty");
       }
       head= head.next;
       size--;
    }

    public void  removeLast (){
        ListNode current = head;
        ListNode previous= null;
        while(current.next!=null)
        {
            previous =current;
            current= current.next;
        }
        current.next = null;
    }






}
