package com.company;

public class LinkedListQueueClient {

    public static void main(String[] args) {
	// write your code here
        MyLinkedListQueue queue = new MyLinkedListQueue();
        queue.enQueue(10);
        queue.enQueue(20);
        System.out.println("Số cần vừa xóa = " + queue.deQueue().getKey());
        System.out.println("Số cần vừa xóa = " + queue.deQueue().getKey());
        queue.enQueue(30);
        queue.enQueue(40);
        queue.enQueue(50);
        System.out.println("Số cần vừa xóa = " + queue.deQueue().getKey());
    }
}
