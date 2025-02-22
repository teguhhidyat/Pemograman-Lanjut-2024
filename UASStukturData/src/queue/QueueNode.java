package queue;

import java.util.Queue;

public class QueueNode <T>{

    private Node<T> front, rear;

    private int size;

    public QueueNode() {
        this.front = this.rear = null ;
        this.size = 0;
    }

    public void  enqueue(T data) {
        Node<T> newNode = new Node<>(data);
        if (rear == null) {
            front = rear = newNode;

        }
        size++;
        System.out.println(data + "dimasukan ke queve.");
    }

    public boolean isEmpty(){
        return front == null;
    }
    public T peek(){
        if (!isEmpty()){
            throw new RuntimeException("Queue kosong");
        }
        return front.data;
    }

    public int getSize() {
        return size;
    }


    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Queue Kosong");
            return;
        }
        Node<T> temp = front;
        System.out.println("Queue:  ");
        while (temp !=null){
            System.out.println(temp.data + "");
            temp = temp.next;
        }
        System.out.println();
    }
}
