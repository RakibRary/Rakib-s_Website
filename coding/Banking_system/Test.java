//Rakib Rary
//CSCI 313
//Anne Smith Thompson
//Mon-Wed section
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner; 
public class Test {
	public static void main(String[] args) {
		//----------------------------------------------------------------------
		Scanner Scanner = new Scanner(System.in);//import scanner
		myBST myBST = FileManager.read("./src/textfile");
		//----------------------------------------------------------------------
		//declare variables
		int Input = 0, Attempts = 0;
		String first, last;
		//----------------------------------------------------------------------
		//user name login
		System.out.println("Enter First name and Last name ");
		String name = Scanner.nextLine();
		
		if(name.contains(" ")) {
			String[] names = name.split(" ");
			first = names[0]; last = names[1];
			
		} else {
			first = name;
			System.out.println("Please enter your last name:");
			last = Scanner.nextLine();
		}
		
		//-----------------------------------------------------------------------
		//failed attempts tracked
		Customer searchCustomer = new Customer(last, first, null, 0);
		Customer selectedCustomer = null;
		
		while(myBST.search(searchCustomer) == null) {
			Attempts++;
			System.out.println("username not found\n" + "# of attempts left: " +(3 - Attempts));
			//logout after 3 failed attempts
			if (Attempts == 3) {
				System.out.println("There are no accounts");
				return;
			}
			//-------------------------------------------------------------------
			name = Scanner.nextLine();
			if(name.contains(" ")) {
				String[] username = name.split(" ");
				first = username[0];last = username[1];
				
			} else {
				first = name;
				System.out.println("Enter last name.");
				last = Scanner.nextLine();
			}
			searchCustomer = new Customer(last, first, null, 0);
		}
		
		if(myBST.search(searchCustomer) == null) {
			System.out.println("Enter 1 to create an account and 0 to exit the program");
			int userinput = Scanner.nextInt();
			Scanner.nextLine();
			if(userinput == 0) {
				System.out.println("good-bye");
				Scanner.close();
				return;
			} else {
				Random random = new Random();
				System.out.println("Enter last name and first name:");
				last = Scanner.nextLine();first = Scanner.nextLine();
				System.out.println("Enter balance to deposit:");
				double balance = Scanner.nextDouble();
				System.out.println(balance);
//---------------------------------------------------------------------------------
//Generate random
				int acctNo1 = random.nextInt(999-111) + 111;
				int acctNo2 = random.nextInt(999-111) + 111;
				String acctNo = acctNo1 + "" + acctNo2;
				
				selectedCustomer = new Customer(last, first, acctNo, balance);
				myBST.insert(selectedCustomer);
//--------------------------------------------------------------------------------
			}
		}
		selectedCustomer = myBST.search(searchCustomer).getCustomer();
		
		while (true) {
//----------------------------------------------------------------------
//program choices
			System.out.println("Enter # choice:\n" + "~ 1 deposit\n" + "~ 2 withdraw\n" + "~ 3 check balance\n" + "~ 4 new account\n" + "~ 5 close account\n" + "~ 6 exit\n");
			//-----------------------------------------------------------------------
			Input = Scanner.nextInt();
			DecimalFormat decimalNumber = new DecimalFormat("#.#");
//-----------------------------------------------------------------------------------------------
//~1deposit
		 if (Input == 1) {
				
				System.out.println("Enter # to deposit.");
				double deposit = Scanner.nextDouble();
				Scanner.nextLine();
				System.out.println("Your new Balance is " + decimalNumber.format(selectedCustomer.deposit(deposit)));
//-----------------------------------------------------------------------------------------------
//~2 withdraw
			} else if (Input == 2) {

				System.out.println("Enter # to withdraw.");
				double withdraw = Scanner.nextDouble();
				Scanner.nextLine();
				System.out.println("New Balance is " + decimalNumber.format(selectedCustomer.withdraw(withdraw)));	
//---------------------------------------------------------------------------------------------------
//~3 check balance
			} else if (Input == 3) {
				System.out.println("Current balance is " + decimalNumber.format(selectedCustomer.getBalance()));
//-----------------------------------------------------------------------------------------------
//~4 new account
			} else if (Input == 4) {

				System.out.println("opening new account:");
				Random random = new Random();
				System.out.println("Enter last name and first name:");
				
				last = Scanner.nextLine();first = Scanner.nextLine();
				
				System.out.println("Enter # to deposit: ");
				//-------------------------------------------------------------------------------------
				double balance = Scanner.nextDouble();
				System.out.println(balance);
//-----------------------------------------------------------------------------------
//generate random account numbers
				int ac1 = random.nextInt(999-111) + 111;
				int ac2 = random.nextInt(999-111) + 111;
				String acctNo = ac1 + "" + ac2;
				//-------------------------------------------------------------------------------------
				//inserting new customer
				Customer newCustomer = new Customer(last, first, acctNo, balance);
				myBST.insert(newCustomer);
				
				System.out.println("Enter 0 to end action");
				int userInput = Scanner.nextInt();
				if(userInput == 0) {
					selectedCustomer = newCustomer;
				}
//------------------------------------------------------------------------------------
//~5 close account
			} else if (Input == 5) {
				System.out.println("Enter 1 to delete or 0 to cancel");
				int userInput = Scanner.nextInt();
				if(userInput == 1) {
					myBST.delete(selectedCustomer);
					System.out.println("good-bye");
					return;
				}
//------------------------------------------------------------------------------------
//~6 exit
				if (Input == 6) {
					return;
				}}
		System.out.println("good-bye");
		
//---------------------------------------------------------------------------------------
//write data and close scanner
		FileManager.write("./src/textfile", myBST);// write data to text file path
		Scanner.close();//scanner closed
		return;
		//---------------------------------------------------------------------------------------------
}}}

