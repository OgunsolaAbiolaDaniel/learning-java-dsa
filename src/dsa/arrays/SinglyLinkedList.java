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

    private ListNode head;
    private int size;


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
                size++;
    }

    public void removeFirst (){
        ListNode current = head;
        ListNode newHead ;
       if(size==0){
           System.out.print("empty");
       };
       head= head.next;
       size--;

    }

    public void  removeLast (){
        ListNode current = head;

        while(current.next!=null)
        {
            current= current.next;
        }
        current = null;
    }



    public static void main(){
        SinglyLinkedList sll  =  new SinglyLinkedList();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(2);
        ListNode third =  new ListNode(3);
        //linking time
        sll.head.next=second;//10->2
        second.next=third;//10->2->3
        sll.display();
        sll.addLast(3);
        sll.addLast("Bingo");
        sll.display();
        sll.addFirst(20);
        sll.first();
        sll.removeFirst();
        sll.last();
        sll.removeLast();
        sll.last();
    }

}
