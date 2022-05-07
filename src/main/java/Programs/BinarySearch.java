package Programs;

import java.util.Scanner;
import org.apache.log4j.*;

public class BinarySearch {
	static Logger log = Logger.getLogger(BinarySearch.class.getName());
	
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
		
		int pos = bSearch(arr,n,key);
		log.info("Element found at: "+pos);
		sc.close();
	}
	
	public static int bSearch(int[]a, int n, int k) {
		int first = 0; 
		int last = n-1; 
		int mid = 0;  
		while( first <= last ){ 
			mid = (first + last)/2;
			if ( a[mid] < k )  
		        first = mid + 1;     
		    else if ( a[mid] == k )  
		        break;  
		    else  
		         last = mid - 1;    
		}  
		if ( first > last )
			return -1;
		else
			return mid;
	}

}
