package hackerrank;

import java.util.Scanner;

public class ArraysRotation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int temp = 0;
        for(int i=0; i<k; i++){
            temp = a[0];
            System.out.println("temp = " + temp);
            for(int j=0; j<n-1; j++){
            	System.out.println(a[j] + " is replaced by " + a[j+1]);
                  a[j] = a[j+1];   
            }
            a[n-1] = temp;
            System.out.println("new array is...");
            for(int k1=0; k1<n; k1++)
                System.out.print(a[k1] + " ");
        }
        for(int k1=0; k1<n; k1++)
            System.out.print(a[k1] + " ");
    }
}
