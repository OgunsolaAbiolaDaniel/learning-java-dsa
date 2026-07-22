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
         return counter ;
    }

    public T first(){
        ListNode first = head;
        if(first== null){
            System.out.print("Empty List");
        }
         return (T)first.data;
    }
    public void  addFirst(T e){
        ListNode current = head;
        ListNode newhead = e;
        newhead.next=current;
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
    }

}
