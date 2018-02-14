package hackerrank;

import java.util.Scanner;

public class CamelCase {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        System.out.println("enter string");
        String s = in.nextLine();
        int count = 0;
        for(int i=0; i<s.length(); i++) {
        	if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
        		count++;
        }
        System.out.println(count+1);
	}

}
