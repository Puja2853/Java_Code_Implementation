package collections;

import java.util.PriorityQueue;

public class Queue {

	public static void main(String[] args) {
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

		for(int i =10; i>0;i--) {
			queue.add(i);
		}
		//Queue: (front) 10 9 8 7 6 5 4 3 2 1 (rear)
		//PriorityQueue sorts the data for us
		//Queue: (front) 1 2 3 4 5 6 7 8 9 10 (rear)
		
		//peeking -- obtaining the head of queue
		//polling -- removing the head of queue
		System.out.println("Queue size is: " + queue.size());
		System.out.println("Head of Queue is: " + queue.peek());
		queue.poll();
		System.out.println("Queue size after poll is: " + queue.size());
		System.out.println("Head of Queue is: " + queue.peek());
	}

}
