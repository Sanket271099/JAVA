package LinkedList_Lecture7;
import java.util.Scanner;
public class Print_Ith_Node {
	public static node<Integer> takeinput(){
		node<Integer> head=null,tail=null;
      Scanner s=new Scanner(System.in);
		int data=s.nextInt();
		while(data!=-1) {
			node newnode=new node(data);
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
	public static void Print_Ith_Node(node<Integer>head, int n) {
		int count=0;
		node<Integer> temp=head;
		while(temp!=null) {
			if(count==n) {
				System.out.println(temp.data);
			return;
			}
			count++;
			temp=temp.next;
		}
		System.out.println("there is no index found");
	}
public static void main(String[] args) {
	int n=3;
	Print_Ith_Node(takeinput(), n);
	
}
}
