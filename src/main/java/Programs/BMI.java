package Programs;

import java.util.Scanner;
import org.apache.log4j.*;

public class BMI {
	
	static Logger log = Logger.getLogger(BMI.class.getName());
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			log.info("Enter the body weight(kg): ");
			int weight = sc.nextInt();
			log.info("Enter the body height(cm): ");
			int height = sc.nextInt();
			int bmi = bmiCalc(weight,height);
			log.info("BMI = "+bmi+"\n");
			log.info("Continue (y/n): ");
			char ch = sc.next().charAt(0);
			if(ch == 'n')
				break;
		}
		sc.close();
	}
	public static int bmiCalc(int w, int h) {
		double b = (w / Math.pow(h, 2)) * 10000;
		return (int)b;
	}

}