package dsa.ds;

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


    public SinglyLinkedList(){
        this.head = null;
        this.size = 0;
    }
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

    public boolean isEmpty(){
        return size == 0 ;
    }

    public void  removeLast (){
        if(isEmpty()){
            System.out.println("Empty List");
            return;
        }
        ListNode current = head;
        ListNode previous= null;

        if(size==1){
            head = null;
            size--;
            return;
        }

        while(current.next!=null)
        {
            previous =current;
            current= current.next;
        }
        previous.next = null;
        size --;
    }



    /** extended to check the equals method
     * public boolean equals(Object o) {
     * 2 if (o == null) return false;
     * 3 if (getClass() != o.getClass()) return false;
     * 4 SinglyLinkedList other = (SinglyLinkedList) o; // use nonparameterized type
     * 5 if (size != other.size) return false;
     * 6 Node walkA = head; 7 Node walkB = other.head; // traverse the primary list
     * // traverse the secondary list
     * 8 while (walkA != null) {
     * 9 if (!walkA.getElement().equals(walkB.getElement())) return false; //mismatch
     * 10 walkA = walkA.getNext();
     * 11 walkB = walkB.getNext();
     * 12 }
     * 13 return true; // if we reach this, everything matched successfully
     * 14 }
     * */




}
