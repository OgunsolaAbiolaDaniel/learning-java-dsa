package dsa.adtImplementations;
import dsa.adt.Stack;

import java.security.DrbgParameters;

public class  StackswithArray<T> implements Stack {
    private int size;
    private T[] stack;
    private int top;  // to track the top of the stack;-- -1 means empty not initialised
    private int capacity;


    public StackswithArray(int capacity){
        this.capacity= capacity;
        this.stack= (T[]) new Object[capacity];
        size= 0;
        top = -1;
    }
    @Override
    public void push(Object e) {
        if(size==capacity){
            System.out.println("Stack is Full");
            return;
        }
        int index = top+1;
        stack[index] = (T) e;
        size++;
        top++;
    }


    @Override
    public void pop() {
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return;
        };
        stack[top] =null;
        top --;
        size--;
    }

    @Override
    public T top() {
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return null;
        }
        return stack[top];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size()==0;
    }

    public void display(){
        for (int i = 0; i < size; i++){
            System.out.print(stack[i]+ "->");
        }
    }
}
