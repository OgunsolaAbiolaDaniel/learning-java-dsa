package exercises;
import dsa.adt.Stack;
import dsa.adtImplementations.*;
public class StackReverse <T> {
    //using a stack to reverse the elements in an array;
    private void stackReverse(T[] e){
        Stack stacker = new StacksWithList();
        T[] newArray = (T[]) new  Object[e.length];
        for(int i = 0; i<= e.length; i++){
            stacker.push(e[i]);
        }
        for (int i= 0;i<e.length;i++){
            newArray[i]=(T) stacker.top();
            stacker.pop();
        }
    }

    public static void main(String[] args){

    }

}
