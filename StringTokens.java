package hackerrank;

import java.util.Scanner;

public class StringTokens {
	
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter string");
    String s = scan.nextLine();
    scan.close();
    String[] str = s.split("!|\\,|\\?|\\.|\\_|\\'|\\@|\\ ");
    int count = 0;
    for(String s1 : str) {
    	if(s1 == "")
    		count++;
    }
    	
    System.out.println(str.length - count);
    for(String s2 : str) {
    	if(s2 != "")
    		System.out.println(s2);
    }
        
	}
}
