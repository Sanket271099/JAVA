package LinkedList_Lecture7;

import java.util.Scanner;

public class Find_THE_Node_Position {
	public static int FindNode(node<Integer>head,int data) {
		node<Integer>temp=head;
		int i=0;
		while(temp!=null) {
			if(temp.data==data) {
				return i;
			}
			i++;
			temp=temp.next;
		}
		return -1;
	}
	public static node <Integer> input(){
		node head=null,tail=null;
		Scanner s=new Scanner(System.in);
		int data=s.nextInt();
		while(data!=-1) {
			node newnode= new node(data);
			if(head==null) {
				head=newnode;
				tail=newnode;
			}else {
				tail.next=newnode;
				tail=newnode;
			}
			data=s.nextInt();
		}
		return head;
	}
	public static void print(node<Integer>head) {
		node<Integer>temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
public static void main(String[] args) {
	node<Integer>head=input();
	print(head);
	System.out.println();
	int pos=FindNode(head, 30);
     System.out.println(pos);
}
}
