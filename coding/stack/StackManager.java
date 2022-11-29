package Stack;

public class StackManager {
	public static int MAX = 18; //Define max size of stack
	public static int[] stack = new int[MAX]; //stack of 18 is created
	public static int top = -1; //keep track of items in stack
	 void printMenu() {
		System.out.println("Stack option:");
		System.out.println("1.ADD");
		System.out.println("2.DELETE TOP");
		System.out.println("3.EMPTY?");
		System.out.println("4.DISPLAY");
		System.out.println("5.Exit");
		System.out.println("Please enter option: ");
	 }
	 
	 void display() {
		if(top == -1) {
			System.out.println("Stack is empty!");
			
		}else {
			 System.out.print("Items in stack: ");
			for(int i = 0; i <= top; i++) {
				System.out.print(stack[i] + " " );
			}
		}
		System.out.println();
	}
	 
	 void push(int data) {
		if(top == MAX-1) {
			System.out.println("Stack Overflow: ");
			MAX++;
			return;
		}else {
			stack[++top] = data;	
		}
	}
	 public void popStack() {
		 if(top >= 0) {//guard top statement
			 top--;
		 }
		display();
		
	}
	 
	 void peek() {
		 if(top == -1){
			System.out.println("Stack is empty!"); 
		 }else {
		System.out.println("Peak Element: " + stack[top]);
		 }
	}
	 
	 boolean printIsEmpty() {
		if(top<0) { 
		System.out.print("Stack is empty ");
		return true;
		
	 }else 
	   return false;	
	}
	 
	 void size() {
		System.out.print("Stack size: ");
	System.out.println("stack size is: " + top);
		
	}
	
}
