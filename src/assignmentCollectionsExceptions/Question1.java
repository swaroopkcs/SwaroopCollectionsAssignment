package assignmentCollectionsExceptions;

import java.util.HashMap;
import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> phoneBook = new HashMap<String, String>();
		Scanner sc = new Scanner(System.in);
		phoneBook.put("Superman", "1234567890");
		phoneBook.put("Batman", "9087654321");
		phoneBook.put("WonderWoman", "4567891230");
		phoneBook.put("Flash", "7890123456");
		phoneBook.put("Aquaman", "3210654987");
		System.out.println("Please enter the name of the user that you want to find");
		String userRequested = sc.next();
		if(phoneBook.get(userRequested)!=null) {
			System.out.println("Name of the user: " + userRequested);
			System.out.println("Phone Number    : " + phoneBook.get(userRequested));
		} else {
			System.out.println("Not found");
		}
		sc.close();

	}

}
