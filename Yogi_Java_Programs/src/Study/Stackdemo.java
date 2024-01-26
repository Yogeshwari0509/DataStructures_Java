package Study;

import java.util.*;
public class Stackdemo{
    private static final int MAX_SIZE=100;
    private int[] stackArray=new int[MAX_SIZE];
    private int top=-1;
    //declaring public for push()
    public void push(){
        if(top<MAX_SIZE){
            stackArray[++top]=value;
            System.out.println("pushed:"+value);
        }
        else{
            System.out.println("stack overflow, can't push");
        }
    }
    //pop()
    public int pop(int value){
        if(top>=0){
            int poppedValue=staticArray[top--];
            System.out.println("pop value:"+poppedValue);
            return poppedValue;
        }
        else{
            System.out.println("stack overflow, can't pop");
            return -1;
        }
    }
    //peek()
    public void peek(){
        if (top>=0){
            int peekValue=stackArray[top];
            System.out.println("peeked value:"+peekValue);
        }
        else{
            System.out.println("stack is empty,can't peek");
            //return -1;
        }
    }
    public static void main(String args[]);
    //attempting to pop from an empty stack
    Stackdemo stack=new Stackdemo();
    stack.push(10);
    stack.push(20);
    stack.push(30);
    stack.push(40);
    stack.push(50);
    stack.peek();
    stack.pop();
}
