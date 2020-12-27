package LinkedList_Lecture7;
//all these are just example remember this thing okay,
public class LinkedListUse {
	public static void print(node head) {
		while(head!=null) {
			System.out.print(head.data+" ");
			head=head.next;
		}
	}
	public static void main(String[] args) {
		node<Integer> node1=new <Integer>node(10);
	    node <Integer>node2=new <Integer>node(20);
	    node <Integer>node3=new <Integer>node(30);
	    node <Integer>node4=new <Integer>node(40);
	    node<Integer> head=node1;
	    node1.next=node2;
	    node2.next=node3;
	    node3.next=node4;
	    print(head);
	    System.out.println();
	    print(head);
	   


}
	}
