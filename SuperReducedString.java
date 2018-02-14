package hackerrank;

import java.util.Scanner;

public class SuperReducedString {

	static String super_reduced_string(String s){
		
		int count = 0;
		if(s.length() == 0)
			return "Empty String";
		else if(s.length() == 1)
			return s;
		else {
			for(int i=0; i<s.length()-1; i++) {
				if(s.charAt(i) == s.charAt(i+1)) {
					s = s.substring(0, i) + s.substring(i+2);
					count ++;
					break;
				}
			}
			if(count == 1) {
				return super_reduced_string(s);
			}
			else
				return s;
		}
		
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter string");
        String s = in.next();
        String result = super_reduced_string(s);
        System.out.println(result);
    }
}


