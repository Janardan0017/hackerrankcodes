package hackerrank;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class QueuesandStacks {
	Stack stk = new Stack();
    Queue que = new LinkedList<>();
	
	void pushCharacter(char ch) {
		stk.push(ch);
	}
	
	void enqueueCharacter(char ch) {
		que.add(ch);
	}
	
	char popCharacter() {
		char c = (char) stk.pop();
		return c;
	}
	
	char dequeueCharacter() {
		char c = (char) que.poll();
		return c;
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        QueuesandStacks obj = new QueuesandStacks();
        for(int i=0; i<s.length(); i++) {
        	obj.pushCharacter(s.charAt(i));
        	obj.enqueueCharacter(s.charAt(i));
        }
        int n = s.length();
        while(n>0) {
        	if(obj.popCharacter() != obj.dequeueCharacter()) {
        		break;
        	}
        	n--;
        }
        if(n==0)
        	System.out.println("is palindrome");
        else
        	System.out.println("not palindrome");
        scan.close();

    }
}