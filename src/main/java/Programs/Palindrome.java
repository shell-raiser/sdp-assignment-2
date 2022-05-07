package Programs;

import java.util.Scanner;
import org.apache.log4j.Logger;

public class Palindrome {
	static Logger log = Logger.getLogger(Palindrome.class.getName());

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		log.info("Enter a String: ");
		String str = sc.nextLine();
		if(paldrome(str))
			log.info(str+" is a Palindrome");
		else
			log.info(str+" is not a Palindrome");
		sc.close();

	}
	
	public static boolean paldrome(String s) {
		StringBuilder str = new StringBuilder(s);
		String reverseStr = str.reverse().toString();
		return reverseStr.equals(s);
	}

}
