package LinkedList_Lecture7;

import java.util.Scanner;

//Code : Midpoint of Linked list
//Send Feedback
//Given a linked list, find and return the midpoint.
//If the length of linked list is even, return the first mid point.
//Input format : Linked list elements (separated by space and terminated by -1)`
//
//Sample Input 1 :
//1 2 3 4 5 -1
//Sample Output 1 :
//3
//Sample Input 2 :
//1 2 3 4 -1
//Sample Output 2 :
//2
public class MidPointOfLL {
	public static node<Integer> takeInput(){
		node<Integer> head=null;
		Scanner s=new Scanner(System.in);
		int data=s.nextInt();
		while(data!=-1) {
			node <Integer>newnode=new node<Integer>(data);
			if(head==null) {
				head=newnode;
			}else {
				node temp=head;
				while(temp.next!=null) {
					temp=temp.next;
				}
				temp.next=newnode;
			}
			data=s.nextInt();
			}
		return head;
	}
	public static int midPoint(node<Integer> head) {
        node <Integer>fast =head;
        node <Integer>temp= head;
        node <Integer>slow=head;
        int mid;
        while(fast!=null && slow !=null){
            fast=fast.next.next;
            temp=slow;
            slow=slow.next;
        }
         mid=temp.data;
        return mid;
    }
public static void main(String[] args) {
	node<Integer>head=takeInput();
	System.out.println(midPoint(head));
}
}
