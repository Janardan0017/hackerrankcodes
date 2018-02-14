package hackerrank;

import java.util.Scanner;

public class BigSorting {
	

	public static void main(String[] args) {
		
		try {
			Scanner in = new Scanner(System.in);
			System.out.println("input...");
	        int n = in.nextInt();
	        String[] ar = new String[n];
	        int[] a = new int[n];
	        for(int i=0; i < n; i++){
	            ar[i] = in.next();
	        }
	        int p = n-1;
	        for(int l=1; l<n; l++) {
	        for(int i=0; i < p; i++){
	            if(ar[i].length() > ar[i+1].length()) {
	            	System.out.println("1. swap "+ar[i]+" and "+ar[i+1] );
	            	String t = ar[i];
	            	ar[i] = ar[i+1];
	            	ar[i+1] = t;
	            }
	            else if(ar[i].length() == ar[i+1].length()) {
	            	int j = 0;
	            	while(j < ar[i].length()) {
	            		if(ar[i].charAt(j) < ar[i+1].charAt(j)) {
	            			break;
	            		}
	            		else if(ar[i].charAt(j) == ar[i+1].charAt(j)) {
	            			j++;
	            		}
	            		else {
	            			System.out.println("2. swap "+ar[i]+" and "+ar[i+1] );
	            			String t = ar[i];
	                    	ar[i] = ar[i+1];
	                    	ar[i+1] = t;
	                    	break;
	            		}
	            	}
	            }}
	        p--;
	        }

	        for(int i=0; i < n; i++){
	            System.out.print(ar[i] + " ");
	        }

		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
