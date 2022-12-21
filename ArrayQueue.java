import java.util.*;
public class ArrayQueue < E > {
    private E[] data;
    private int frontIndex;
    private int queueSize;

    public ArrayQueue(int capacity) { 
        data = (E[]) new Object[capacity]; 
        queueSize = 0; 
        frontIndex = 0; 
    }

    public ArrayQueue() {
        this(1000);
    } 

    public int size() {
        return queueSize;
    }

    public boolean isEmpty() {
        return (queueSize == 0);
    }

    public void enqueue(E e) throws IllegalStateException {
        if (queueSize == data.length) throw new IllegalStateException("Queue is full");
        int avail = (frontIndex + queueSize) % data.length; 
        data[avail] = e;
        queueSize++;
    }

    public E first() throws IllegalStateException {
        if (queueSize == data.length) throw new IllegalStateException("Queue is empty");
        return data[frontIndex];
    }

    public E dequeue() throws IllegalStateException {
        if (queueSize == data.length) throw new IllegalStateException("Queue is empty");
        E answer = data[frontIndex];
        data[frontIndex] = null; 
        frontIndex = (frontIndex + 1) % data.length;
        queueSize--;
        return answer;
    }

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue();
        queue.enqueue(18); 
        System.out.println("Element at front :  " + queue.first()); 
        System.out.println("Element removed from front : " + queue.dequeue());   
        System.out.println("Queue is Empty : " + queue.isEmpty()); 
        queue.enqueue(79); 
        queue.enqueue(90); 
        System.out.println("Size of the queue : " + queue.size()); 
        System.out.println("Element removed from front end : " + queue.dequeue());
    }
}