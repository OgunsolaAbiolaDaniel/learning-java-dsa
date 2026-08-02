package exercises;

import dsa.adt.Stack;
import dsa.adtImplementations.StacksWithList;

public class Demlimiter<T> {

    public boolean isMatched(String e){
        char o_delim1 = '(';
        char o_delim2= '{';
        char  o_delim3 = '[';
        char c_delim1 = ')';
        char c_delim2 = '}';
        char c_delim3 = ']';

        Stack tracker  = new StacksWithList();
        char[] word = e.toCharArray();
        int size =  word.length;
        for(char character: word){
        if(character==o_delim1 && tracker.con) {
            tracker.push(character);
        };


        }

    }



    public static void  main(String[] args){

    }
}
