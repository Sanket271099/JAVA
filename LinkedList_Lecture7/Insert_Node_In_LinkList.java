package LinkedList_Lecture7;
import java.util.Scanner;
public class Insert_Node_In_LinkList {
	public static node<Integer> insert(){
		Scanner s=new Scanner(System.in);
		node<Integer>head=null ,tail=null;
		int data=s.nextInt();
		while(data!=-1) {
			node<Integer>newnode=new node(data);
			if(head==null) {
				head=newnode;
				tail=newnode;
			}
			else {
				tail.next=newnode;
				tail=newnode;
			}
			data=s.nextInt();
		}
		return head;
	}
	public static node<Integer>InsertNode(node<Integer>head,int pos,int data){
		node<Integer>temp=head;
		node<Integer>newnode=new node(data);
		if(pos==0) {
			newnode.next=head;
			return newnode;
		}
		int i=0;
		while(i<pos-1) {
			temp=temp.next;
			i++;
		}
		newnode.next=temp.next;
		temp.next=newnode;
		return head;
	}
	public static void print(node <Integer>head) {
		node<Integer>temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
public static void main(String[] args) {
	node head=insert();
	InsertNode(head, 4, 928);
	print(head);
	
}
}
