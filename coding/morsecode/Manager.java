package morsecode;
import java.util.*;

public class Manager {
Scanner scanner=new Scanner(System.in);	//Scanner Import 

	private static char[] English = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
            'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 
            'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
            ',', '.', '?' };
	
	private static String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", 
                ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
                "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
                "-----", "--..--", ".-.-.-", "..--.." };
	
	void printMenu() {
		System.out.println("Morse Code Dictionary");
		System.out.println("Please select an option below: ");
		System.out.println("1:ENGLISH TO MORSE CODE");
		System.out.println("2:MORSE CODE TO ENGLISH");
		System.out.println("3:EXIT");
		System.out.println("Input: ");
	}
	
	String engMorse() {
		System.out.println("Please enter string to translate to morse code: ");
		String userInput = scanner.nextLine();
			for(int j = 0;j <=English.length-1; j++) {
			for(int i = 0;i<=userInput.length() - 1 ;i++) {
				//go through string
				//match letters of string by the index of the array to morse
				if(userInput.charAt(i) == English[j]) {		
				System.out.print(morse[j] + " ");
				}
			}
			}
		System.out.println();
		return null;
	}
	
	String morEng() {
		System.out.println("Please enter morse code to decrypt: ");
		String morseCode = scanner.nextLine();
		String[] array = morseCode.split(" ");
			for(int j = 0; j <= array.length-1; j++) {
			for(int i = 0; i <= morse.length-1;i++) {
				//compare morse to english
				if(array[j].compareTo(morse[i]) == 0) {
				System.out.print((char)(i + 'a')+ " ");
				}
			}
			}	
			System.out.println();
		return null;
	}
		
	}

