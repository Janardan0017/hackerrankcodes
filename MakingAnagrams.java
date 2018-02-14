package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class MakingAnagrams {
	
	 public static int numberNeeded(String first, String second) {
	      
	        char[] c1 = first.toCharArray();
	        char[] c2 = second.toCharArray();
	        Arrays.sort(c1);
	        Arrays.sort(c2);
	        int i = -1;
	        do{
	            i++;
	        } while(c1[i]  != c2[i]);
			return i;
	        
	        
	       
	    }

	public static void main(String[] args) {
		
		 	Scanner in = new Scanner(System.in);
	        String a = in.next();
	        String b = in.next();
	        System.out.println(numberNeeded(a, b));

	}

}
