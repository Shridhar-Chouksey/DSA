package com.company;

public class Main {

    public static void main(String[] args) {

        QueueByArray queue=new QueueByArray(5);
        System.out.println("Enqueuing 6 values in the queue...");
        for (int i = 1; i <= 6; i++) {
            queue.Enqueue(i * 10);
        }

        System.out.println("Peek value from queue...");
        queue.peek();

        System.out.println("Dequeue 6 values from queue...");
        queue.DeQueue();

        System.out.println("Deleting the entire Queue...");
        queue.deleteQueue();



    }
}
