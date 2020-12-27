package LinkedList_Lecture7;
import java.util.Scanner;

public class TakingLinkList_Input {
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
public static void main(String[] args) {
	
}
}
