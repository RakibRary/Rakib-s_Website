package Stack;
import java.util.*;

public class Stack_Project1 {

//move to separate project: DONE
//resize stack ex. if stack is full:DONE


	public static void main(String[] args) {
		int size, choice, data;
		boolean userinput = true; //primitive vs class
		Scanner scanner=new Scanner(System.in);	//Scanner Import 
		StackManager manager = new StackManager();
		
		
		
		while(userinput) {
			manager.printMenu();
			choice = scanner.nextInt();
			switch(choice) {	
				case 1://ADD
					System.out.println("Please input max size of stack: ");
					size = scanner.nextInt();
					System.out.println("Enter data into stack: ");
					
					for(int i = 0; i <= size-1; i++) {
						data = scanner.nextInt();
						System.out.println("Pushing data to stack: ");
						manager.push(data);
						manager.display();
					}
					
					System.out.println("Done!");
					
					break;
				case 2://DELETE
					System.out.println("Popping stack: ");
					manager.popStack();
					break;
				case 3://EMPTY?
					System.out.println("Stack is empty: ");
					manager.printIsEmpty();
					break;
				case 4://DISPLAY
					System.out.println("Items in stack: ");
					manager.display();
					break;
				case 5://EXIT
					System.out.println("Program ended, Good-bye!");
					userinput = false;
					break;
				default: { //does not match any options
					System.out.println("Input not accepted! ");
					
				}
			}
	}
//----------------------------------------------------------		
	} 

}
