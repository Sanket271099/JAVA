package LinkedListLecture_8;

import java.util.Scanner;


public class Reverse_LL_BY_Iterative {
	public static node<Integer> reverse(node<Integer>head){
		if(head==null||head.next==null) {
			return head;
		}
		node<Integer>finalhead=reverse(head.next);
		node<Integer>temp=finalhead;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=head;
		head.next=null;
		return finalhead;
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
	head=reverse(head);
print(head);
}
}
