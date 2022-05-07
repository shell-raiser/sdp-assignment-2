package Programs;

import java.util.Scanner;
import org.apache.log4j.*;

public class LinearSearch {
	static Logger log = Logger.getLogger(LinearSearch.class.getName());
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		log.info("Enter the number of elements: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		log.info("Enter the array elements: ");
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		log.info("Enter the key element: ");
		int key = sc.nextInt();
		
		int pos = search(arr,n,key);
		log.info("Element found at: "+pos);
		sc.close();
	}
	public static int search(int[] a, int n, int k) {
		int p = -1;
		for (int i = 0; i < n; i++)
			if(k == a[i])
				p = i;
		return p;		
	}

}
