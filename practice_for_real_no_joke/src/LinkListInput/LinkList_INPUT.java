package LinkListInput;
import java.util.Scanner;
public class LinkList_INPUT {
	public static node<Integer> takeinput(){
		//this have time complexity of O(n^2) which is shame we can do better than this. 
		node<Integer>head=null;
		Scanner s=new Scanner(System.in);
	 int data=s.nextInt();
	 while(data!=-1) {
		 node newnode=new node(data);
		 if(head==null) {
			 head=newnode;
		 }
		 else {
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
	public static void print(node head) {
		node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	public static node<Integer> takaInput(){
		//this have complexuty of O(n)
		node head=null,tail=null;
		Scanner s=new Scanner(System.in);
		int data=s.nextInt();
		while(data!=-1) {
			node newnode=new node(data);
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
public static void main(String[] args) {
	node head=takaInput();
	print(head);
	
}
}
