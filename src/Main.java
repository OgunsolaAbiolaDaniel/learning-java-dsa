import dsa.adt.Stack;
import dsa.adtImplementations.StackswithArray;
import dsa.arrays.SinglyLinkedList;

public class Main {

  /*
  maximum element in an array v. called with max(v,0)
  
   * public static int max(int[] v,int i){
   * if(i>=v.length-1){return v[i];
   * }
   * int nextMax = max(v,i+1);
   * return ((v[i]>nextMax)?v[i]:nextMax)
   * 
   * 
   * 
   * 
   * 
   * Sum of elements in the array v called with sum(v,0)
   *
   * public static int  sum (int [] v, int i){
   * if(i>=v.length-1){
   * return v[i];
   * }
   * return v[i] + sum(v,i+1);}}
   * 
   * 
   * 
   * Sorted or not sorted called with isSorted(v,0)
   * public static boolean isSorted(int [] v, int i){
   * if (i>=v.length-1){return true;}
   * if(v[i]>v[i+1]){return false;
   * }]) return isSorted(v,i+1);
   * 
   * 
   * public static int max(int[] v, int i) {
    if (i >= v.length - 1) {
      return v[i];
    }
    int nextMax = max(v, i + 1);
    return (v[i] > nextMax) ? v[i] : nextMax;
  }
   * 
   * 
   * 
   * 
   * 
   * 
   */
  public static void main(String[] args) {

     /*  SinglyLinkedList sll  =  new SinglyLinkedList();
      sll.addFirst(10);
      sll.addLast(20);
      sll.addLast("Abiola");
      sll.addFirst("Olaitan");
      sll.display();
      */


      Stack stack = new StackswithArray(20);
      stack.isEmpty();
      System.out.println("Stack size is "+ stack.size() +"");
      stack.push(3);
      stack.push("Abiola");
      stack.push(true);
      stack.push(40);
      stack.push("David");
      stack.display();

      stack.pop();//pop david
      System.out.println("------");
      stack.display();

      stack.pop();//pop 40
      System.out.println("------");
      stack.display();
      System.out.println("------");
      System.out.println(stack.top() +"");
      stack.isEmpty();
      System.out.println("------");
      stack.display();

      System.out.println("\n" + stack.top() +"");

      System.out.println("\n" + stack.size() +"");
      stack.pop();
      System.out.println("\n" + stack.size() +"");

      System.out.println("\n" + stack.top() +"");
    }



}
  
        
      

