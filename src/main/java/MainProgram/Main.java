package MainProgram;

import Programs.*;
import java.util.Scanner;
import org.apache.log4j.Logger;

public class Main {
	static Logger log = Logger.getLogger(Main.class.getName());
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		log.info("Enter the program to run:");
		log.info("1. BasicCalculator");
		log.info("2. BinarySearch");
		log.info("3. BMI");
		log.info("4. LinearSearch");
		log.info("5. Palindrome");
		int ch = sc.nextInt();
		
		switch(ch) {
		case 1: Programs.BasicCalculator.main(args);break;
		case 2: Programs.BinarySearch.main(args);break;
		case 3: Programs.BMI.main(args);break;
		case 4: Programs.LinearSearch.main(args);break;
		case 5: Programs.Palindrome.main(args);break;
		default: log.info("Invalid choice");
		}
		
		sc.close();
	}
}