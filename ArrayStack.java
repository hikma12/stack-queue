import java.util.*;
public class ArrayStack < E > {

    public static final int CAPACITY = 1000;
    private int topIndex; 
    private E[] data; 
    
    public ArrayStack() {
        this(CAPACITY);
    } 

    public ArrayStack(int capacity) { 
        topIndex = -1;
        data = (E[]) new Object[capacity]; 
    }

    public int size() {
        return (topIndex + 1);
    }

    public boolean empty() {
        return (topIndex == -1);
    }

    public void push(E e) throws IllegalStateException {
        if (size() == data.length) throw new IllegalStateException("Stack is full");
        data[++topIndex] = e; 
   }

    public E peek() throws EmptyStackException {
        if (empty()) throw new EmptyStackException();
        return data[topIndex];
    }

    public E pop() throws EmptyStackException {
        if (empty()) throw new EmptyStackException();
        E answer = data[topIndex];
        data[topIndex] = null; 
        topIndex--;
        return answer;
    }

    public static void main(String args[]) {
        ArrayStack < Integer > mystack = new ArrayStack<>();
        mystack.push(9); 
        mystack.push(3);  
        mystack.push(8); 
        System.out.println("Element at the top is :" + mystack.peek());
        System.out.println("Element removed is : " + mystack.pop()); 
        System.out.println("The size of the stack is : " + mystack.size()); 
        System.out.println("Element removed is : " + mystack.pop()); 
        System.out.println("Element at the top is : " + mystack.peek()); 
        mystack.push(10); 
        System.out.println("Stack is empty :  " + mystack.empty()); 
    }
}