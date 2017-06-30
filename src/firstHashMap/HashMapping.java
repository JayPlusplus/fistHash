package firstHashMap;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapping {

	public static void main(String[] args) {
		String answer,answer2;
		HashMap<Integer, String> myMap = new HashMap<Integer, String>();
		Scanner keyboard = new Scanner(System.in);
		while(true) {
		System.out.println("enter your number");
		int num = keyboard.nextInt();
		if (myMap.containsKey(num)==true) {
			System.out.println("Your number is in the HashMap" + "\nThe value is " + myMap.get(num));
		}
		if (myMap.containsKey(num) == false) {
			System.out.println("Your number is not in the HashMap. Do you want to add this number in?");
			answer = keyboard.next();
			System.out.println("How do you spell your number");
			answer2=keyboard.next();
			if (answer.equals("yes")) {
				myMap.put(num, answer2);
			}
			System.out.println("Here is your value " + myMap.get(num));
		}
		}		
	}	
}	
	
	//while (true) {
			
