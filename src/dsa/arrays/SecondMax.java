package dsa.arrays;


import javax.management.ListenerNotFoundException;

public class SecondMax {
    /**
     * returns the second max in the given array
     * */
    public int s_max(int []arr){
        //first sort then find
        return 1;
    };
    public static void main(){
        int[] nums =  {2,33,4,1,4,5,566,3,2,34,2,24,24,21,14}
    }
}


public int[] moveZeros(int[] arr){
    int n  = arr.length;
    for(int i = 0; i < n; i++){
        if(arr[i]==0){
            int c = arr[i];
            arr[i]= arr[n-1];
            arr[n-1] = c;
        };
    }
}

public <T> void swap(T a, T b){
    T c  = a;
     a =(T) b;
     b = (T)c;
}

public class SinglyLinkedLst{

    private class ListNode<T>{
        private T data;
        private T next;
       public ListNode(T data){
           this.data= data;
           this.next =null;
       }
    }

    private ListNode head;

    public void main(){
        SinglyLinkedLst sl1 = new SinglyLinkedLst();
        sl1.head = new ListNode(10);
        ListNode second = new ListNode<Integer>(20);
        ListNode third  = new ListNode<String> ("Abiola");
        ListNode forth =  new ListNode<String>("yustra");
        ListNode fifth = new ListNode<Integer>(35);

        sl1.head.next =  second ;
        second.next =  third;
        third.next =  forth;

    }
    //print function
    public void display (){
        ListNode current =  head;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        };
    }
}