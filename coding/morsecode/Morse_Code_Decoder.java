package morsecode;

import java.util.*;

public class Morse_Code_Decoder {
	// dictionary - how to store different morse codes to  letter translate
	/*
	Implement a morse code decoder 
	Given an input sequence:
	Decode based on series of . & - characters
	Assume character is complete on ‘ ‘
	Bonus points: Handle malformed input 
	IE: ..-- decodes as ..- as ..-- is not a valid character
*/
	public static void main(String[] args) {
		int choice;
		
		boolean loop = true;
		Scanner scanner=new Scanner(System.in);	//Scanner Import 
		Manager manager = new Manager();
		while(loop) {
			manager.printMenu();
			choice = scanner.nextInt();
			switch(choice) {
				case 1://English to morse code
				manager.engMorse();
					break;
				case 2://Morse code to English	
					manager.morEng();
					break;
				case 3://Exit program
					System.out.println("program closing!");
					loop = false;
					break;
			default://none of the user inputs are accepted case
					System.out.println("Input not accepted please try again!");
		}
	}	
//--------------------------------------
	}

}
