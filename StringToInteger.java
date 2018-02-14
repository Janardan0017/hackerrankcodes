package hackerrank;

import java.util.Scanner;

public class StringToInteger {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("enter string");
		String s = in.next();
		try {
			int n = Integer.parseInt(s);
			System.out.println(n);
		}
		catch(Exception e) {
			System.out.println("Bad String");
		}

	}

}
