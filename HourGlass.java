package hackerrank;

import java.util.Scanner;

public class HourGlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("enter size and values..");
		int n = in.nextInt();
        int arr[][] = new int[n][n];
        for(int i=0; i < n; i++){
            for(int j=0; j < n; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n-2; i++){
            for(int j=0; j<n-2; j++){
                int sum = arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]
                		+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                if(sum > max)
                	max = sum;
            }
        }
        System.out.println(max);
    }
}
