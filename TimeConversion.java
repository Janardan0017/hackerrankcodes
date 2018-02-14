package hackerrank;

import java.util.Scanner;

public class TimeConversion {
			
		static String timeConversion(String s) {
	        String h = s.substring(0, 2);
			String s1 = s.substring(s.length() - 2).toLowerCase();
	        if(h.equals("12") && s1.equals("am")) {
					return "00" + s.substring(2, 8);
				}
	        else{
			    if(s1.equals("pm") && !h.equals("12")) {
					int t = Integer.parseInt(h) + 12;
					return t + s.substring(2, 8);
				}
			else
			return s.substring(0, 8);
		}
	    }

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("enter time..");
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);

	}

}
