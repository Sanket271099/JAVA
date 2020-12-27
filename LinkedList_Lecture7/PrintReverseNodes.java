package LinkedList_Lecture7;

import java.util.Scanner;

public class PrintReverseNodes {
	public static node<Integer>PrintReverse(node<Integer>head){
		if(head.next==null) {
			System.out.println(head.data);
			return null;
		}
		PrintReverse(head.next);
		System.out.println(head.data);
		return null;
	}
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
	public static void print(node<Integer>head) {
		node<Integer>temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
public static void main(String[] args) {
	node<Integer>head=takeInput();
	print(head);
	
	System.out.println();
	PrintReverse(head);
}
}
