package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class Pangrams {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("string...");
		String s = in.nextLine().toLowerCase();
		char[] ch = s.toCharArray();
		Arrays.sort(ch);
		
		for(int m = 0; m<s.length(); m++) {
			System.out.print(ch[m]);
		}
		System.out.println();
		int i=0;
		while(ch[i] != 'a') {
			i++;
		}
		for(int j=i; j<s.length()-1; j++) {
			if(ch[j] == ch[j+1]) {
				ch[j] = ' ';
			}
		
		}
		for(int m = 0; m<s.length(); m++) {
			System.out.print(ch[m]);
		}
		System.out.println();
		int count = 0;
		for(int k=i; k<s.length(); k++)
		{
			if(ch[k] != ' ' && ch[k] <= 'z') {
				count++;
				System.out.println(ch[k] + " "+count);
			}
			
		}
		if(count == 26)
			System.out.println("pangram");
		else
			System.out.println("not pangram");
		
	}

}
