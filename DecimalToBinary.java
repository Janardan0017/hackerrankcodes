package hackerrank;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("input..");
		int n = in.nextInt();
		int rem, i=0;
		int[] binary = new int[n];
		while(n!=0) {
			binary[i] = n%2;
			n = n/2;
			i++;
		}
		int count = 0, max = 0;
		for(int j=i-1; j>=0; j--) {
			if(binary[j] == 1)
				count++;
			else
				count = 0;
			if(count > max)
				max = count;
		}
		System.out.println(max);
	}

}
