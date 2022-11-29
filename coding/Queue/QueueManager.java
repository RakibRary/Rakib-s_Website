package Queue;
import java.util.*;

public class QueueManager {
//make switch case for mapping functions in main
	private int[] queue = new int[DEFAULT];
	private int rear = -1; //define the front/back of queue
	private int data; // array data
	Scanner scanner=new Scanner(System.in);	//Scanner Import 

	void printMenu() {
		System.out.println("Queue Options: ");
		System.out.println("1.ADD ");
		System.out.println("2.DELETE");
		System.out.println("3.LOOK UP");
		System.out.println("4.FRONT");
		System.out.println("5.REAR");
		System.out.println("6.EXIT");
		System.out.println("Please enter option: ");
	}
	
	void enqueue() { //function to enqueue data
		System.out.println("Please enter size of queue: ");
		int size = scanner.nextInt();
		if(rear + size >= queue.length) {
			int newArr[] = new int[2*queue.length]; //create new array 2x size
			System.out.println("Creating more space! ^_^");
			for(int i = 0;i<=rear;i++) {
				newArr[i] = queue[i];
			}
			queue = newArr;
		}
		System.out.println("Enter data to enque: "); 
		for(int i =0; i <=size-1;i++) {
			data = scanner.nextInt();
			System.out.println("Enqeuing " + data);
			rear = rear + 1; //moving the rear
			queue[rear] = data;
			display();
		}	
	}	
	
	Integer dequeue() { //primitive int vs class Integer
		if(isEmpty()) { //check queue is empty
			System.out.println("Queue is empty!");
			return null;
		}
		int front = queue[0];
		for(int i = 0; i <= rear; i++) {	//elements are moved to the right by one
			queue[i] = queue[i+1];
		}
		rear--;	
		return front;
	}	
	
	void display() { //function for displaying items within the queue
		System.out.print("The elements in the queue: ");
		if(isEmpty()) {
			System.out.print("\nThe queue is empty");
		}else {
			for(int i = 0;i <= rear; i++) {
				System.out.print(queue[i] + " ");
			}
		}
		System.out.println();
	}
	
	int search(int data) {
		for(int i = 0; i <= rear; i++) {
			if(queue[i] == data) {
				return i;
			}
		}
		return -1;
	}
	
	void front() {
		if(isEmpty()) {
			System.out.println("Queue is empty! please enter data: ");
		}else {
			System.out.println(queue[0] + " front");
		}
	}		
	
	void rear() {
		if (isEmpty()) {
			System.out.println("Queue is empty! please enter data: ");
		}else {
			System.out.println(queue[rear] + " rear");
		}
	}
	
	private boolean isEmpty() {
		return rear == -1;
	}
	private final static int DEFAULT = 10;
}

