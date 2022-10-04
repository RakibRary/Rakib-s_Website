//Rakib Rary
//CSCI 313
//Anne Smith Thompson
//Mon-Wed section
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.io.File;
import java.io.FileOutputStream;
public class FileManager {
	//---------------------------------------------------------------------------------------
	public static void write(String address, myBST myBST) {
		File file;
		FileOutputStream outStream;
		
		try {file = new File(address + "/Bank_Database.txt");//name of file
		
			outStream = new FileOutputStream(file);
			Customers(myBST.getRoot(), outStream);
		} catch (IOException excep) {
			excep.printStackTrace();}
	}
	//----------------------------------------------------------------------------------------
	private static void Customers(Node root, FileOutputStream outStream) {
		//base case
		if(root == null) {
			return;
		}
		//------------------------------------------------------------------------------------------
		Customers(root.getLeft(), outStream);
		double balance = root.getCustomer().getBalance();
		String acctNo = root.getCustomer().getAcctNo();
		String first = root.getCustomer().getFirst();
		String last = root.getCustomer().getLast();
		DecimalFormat deci = new DecimalFormat("####0.00");
		String saveCustomerInfo =first + " " + last + " " + acctNo + " $" + deci.format(balance) + "\n";
		//decimal format for the customer number
		byte[] info = saveCustomerInfo.stripLeading().getBytes();

		try {outStream.write(info); // write to file
		
		} catch (IOException excep) {
			excep.printStackTrace();
		}
		Customers(root.getRight(), outStream);
	}
	//----------------------------------------------------------------------------------------
	public static myBST read(String address) {
		myBST mybst = new myBST();
		File file = new File(address + "/Bank_Database.txt");//name of file
		
		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
			//-------------------------------------------------------------------------
			//remove dead space from the beginning
			String concatenate;
			while((concatenate = reader.readLine()) != null) {
				concatenate = concatenate.strip();
				
			String[] num = concatenate.split(" ");
			num[3] = num[3].substring(1);
			//------------------------------------------------------------------------
			//order of text file
			Customer customer = new Customer(num[0], num[1], num[2], Double.parseDouble(num[3]));
				mybst.insert(customer);
			}
		} catch (IOException excep) {}
		return mybst;
	}
}
