package Queue;
import java.util.Scanner;
import java.util.*;

public class Queue_Project_1 {
	//TODO move all print statements to queueproject1
	
	public static void main(String[] args) {
		int choice = 0;
		boolean userInput = true;
		Scanner scanner=new Scanner(System.in);	//Scanner Import
		QueueManager manager = new QueueManager();
		
			
		while(userInput) {
		manager.printMenu();
		choice = scanner.nextInt();
		switch(choice) {		
			case 1://ADD TO STACK
					manager.enqueue();
					break;
			case 2://DELETE FROM Queue		
					Integer front = manager.dequeue();
					if(front !=null) {
						System.out.print("Dequeing queue: ");
						System.out.print(front);
					}
				break;
			case 3://LOOK UP FOR ITEM IN STACK AND INDEX
				int search;
					System.out.println("Enter the data you are searching for: ");
					search = scanner.nextInt();
					manager.search(search);
				break;		
			case 4://WHAT IS FRONT INDEX
				manager.front();
				break;	
			case 5://WHAT IS REAR INDEX
				manager.rear();
				break;
			case 6://END PROGRAM
				System.out.println("Program ended good-bye!");
				userInput = false;
				break;	
				  }
	
		}
//----------------------------------------	
	}
}
