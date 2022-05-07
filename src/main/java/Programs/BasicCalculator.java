package Programs;

import java.util.Scanner;
import org.apache.log4j.*;

public class BasicCalculator {
	static Logger log = Logger.getLogger(BasicCalculator.class.getName());

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		log.info("Enter 2 numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		log.info("Enter the opertation:");
		log.info("+ - * /");
		char ch = sc.next().charAt(0);
		switch(ch) {
		case '+': log.info(add(a,b)); break;
		case '-': log.info(sub(a,b)); break;
		case '*': log.info(mul(a,b)); break;
		case '/': log.info(div(a,b)); break;
		default: log.info("Invalid Choice");
		}
		sc.close();
	}
	public static int add(int a, int b) {
		return (a+b);
	}
	public static int sub(int a, int b) {
		return (a-b);
	}
	public static int mul(int a, int b) {
		return (a*b);
	}
	public static int div(int a, int b) {
		return (a/b);
	}

}
