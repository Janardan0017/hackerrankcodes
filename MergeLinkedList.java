package hackerrank;

import java.util.ArrayList;
import java.util.Collections;

class Node1{
	int data;
	Node next;
}
public class MergeLinkedList {
	Node mergeLists(Node headA, Node headB) {
	     Node head = new Node();
	    ArrayList<Integer> ar = new ArrayList<>();
	    while(headA != null){
	        ar.add(headA.data);
	        headA = headA.next;
	    }
	    while(headB != null){
	      ar.add(headB.data);
	      headB = headB.next; 
	    }
	    Collections.sort(ar);
	    for (Integer i : ar) {
			
		}
		return head;
	}

	public static void main(String[] args) {
		

	}

}
